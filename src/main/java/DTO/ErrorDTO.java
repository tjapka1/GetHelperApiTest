package DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

public class ErrorDTO {
    private int status;
    private String error;
    private Object message;
    private String path;

    ErrorDTO(int status, String error, Object message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public static ErrorDTOBuilder builder() {
        return new ErrorDTOBuilder();
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getStatus() {
        return this.status;
    }

    public String getError() {
        return this.error;
    }

    public Object getMessage() {
        return this.message;
    }

    public String getPath() {
        return this.path;
    }

    public String toString() {
        int var10000 = this.getStatus();
        return "ErrorDTO(status=" + var10000 + ", error=" + this.getError() + ", message=" + this.getMessage() + ", path=" + this.getPath() + ")";
    }

    public static class ErrorDTOBuilder {
        private int status;
        private String error;
        private Object message;
        private String path;

        ErrorDTOBuilder() {
        }

        public ErrorDTOBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ErrorDTOBuilder error(String error) {
            this.error = error;
            return this;
        }

        public ErrorDTOBuilder message(Object message) {
            this.message = message;
            return this;
        }

        public ErrorDTOBuilder path(String path) {
            this.path = path;
            return this;
        }

        public ErrorDTO build() {
            return new ErrorDTO(this.status, this.error, this.message, this.path);
        }

        public String toString() {
            return "ErrorDTO.ErrorDTOBuilder(status=" + this.status + ", error=" + this.error + ", message=" + this.message + ", path=" + this.path + ")";
        }
    }
}
