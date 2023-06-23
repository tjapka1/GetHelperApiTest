import DTO.NewUserDto;
import com.google.gson.Gson;
import okhttp3.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrationTests {

    private final MediaType JSON = MediaType.get("application/json;charset=utf-8");
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();

    @Test
    public void registrationsTestSuccess() throws IOException {
        NewUserDto newUser = NewUserDto.builder().email("tja@aa.aa").password("sa123456").build();
        RequestBody body = RequestBody.create(this.gson.toJson(newUser), this.JSON);
        Request request = (new Request.Builder()).url("http://localhost:8080/api/register").post(body).build();
        Response response = this.client.newCall(request).execute();

        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.code(), 201);
        NewUserDto responseDTO = this.gson.fromJson(response.body().string(), NewUserDto.class);
        System.out.println(responseDTO.getEmail());
            }

    @Test
    public void registrationsTestWrongEmail() throws IOException {
        NewUserDto newUser = NewUserDto.builder().email("").password("sa123456").build();
        RequestBody body = RequestBody.create(this.gson.toJson(newUser), this.JSON);
        Request request = (new Request.Builder()).url("http://localhost:8080/api/register").post(body).build();
        Response response = this.client.newCall(request).execute();

        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.code(), 201);
        NewUserDto responseDTO = this.gson.fromJson(response.body().string(), NewUserDto.class);
        System.out.println(responseDTO.getEmail());
            }
    @Test
    public void registrationsTestWrongPassword() throws IOException {
        NewUserDto newUser = NewUserDto.builder().email("tja@kaa.aa").password("").build();
        RequestBody body = RequestBody.create(this.gson.toJson(newUser), this.JSON);
        Request request = (new Request.Builder()).url("http://localhost:8080/api/register").post(body).build();
        Response response = this.client.newCall(request).execute();

        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.code(), 201);
        NewUserDto responseDTO = this.gson.fromJson(response.body().string(), NewUserDto.class);
        System.out.println(responseDTO.getEmail());
    }

}
