import DTO.LoginDTO;
import DTO.NewUserDto;
import DTO.StandardResponseDto;
import com.google.gson.Gson;
import okhttp3.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTests {
    private final MediaType JSON = MediaType.get("application/json;charset=utf-8");
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();
    @Test
    public void LoginTestSuccess() throws IOException {
        LoginDTO login = LoginDTO.builder().email("tja@aa.aa").password("sa123456").build();
        RequestBody body = RequestBody.create(this.gson.toJson(login), this.JSON);
        Request request = (new Request.Builder()).url("http://localhost:8080/login").post(body).build();
        Response response = this.client.newCall(request).execute();

        //Assert.assertTrue(response.isSuccessful());
        //Assert.assertEquals(response.code(), 200);
        StandardResponseDto responseDTO = this.gson.fromJson(response.body().string(), StandardResponseDto.class);
        System.out.println(responseDTO.getMessage());
        System.out.println(responseDTO.getStatus());
    }
    @Test
    public void LoginTestNegativePassword() throws IOException {
        LoginDTO login = LoginDTO.builder().email("tja@aa.aa").password("sa12345622").build();
        RequestBody body = RequestBody.create(this.gson.toJson(login), this.JSON);
        Request request = (new Request.Builder()).url("http://localhost:8080/login").post(body).build();
        Response response = this.client.newCall(request).execute();

        //Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.code(), 401);
        StandardResponseDto responseDTO = this.gson.fromJson(response.body().string(), StandardResponseDto.class);
        System.out.println(responseDTO.getMessage());
        System.out.println(responseDTO.getStatus());
    }
}
