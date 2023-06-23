package DTO;

import java.util.List;

public class AllUsersDTO {
    private List<UserDto> users;

    AllUsersDTO(List<UserDto> users) {
        this.users = users;
    }

    public static AllUsersDTOBuilder builder() {
        return new AllUsersDTOBuilder();
    }

    public void setContacts(List<UserDto> contacts) {
        this.users = contacts;
    }

    public List<UserDto> getContacts() {
        return this.users;
    }

    public String toString() {
        return "AllUsersDTO(contacts=" + this.getContacts() + ")";
    }

    public static class AllUsersDTOBuilder {
        private List<UserDto> users;

        AllUsersDTOBuilder() {
        }

        public AllUsersDTOBuilder contacts(List<UserDto> users) {
            this.users = users;
            return this;
        }

        public AllUsersDTO build() {
            return new AllUsersDTO(this.users);
        }

        public String toString() {
            return "AllUsersDTO.AllUsersDTOBuilder(contacts=" + this.users + ")";
        }
    }

}
