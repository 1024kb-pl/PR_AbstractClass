package org.blog;

public class User extends Entity {
    private String login;
    private String email;

    public User(Long id, String login, String email) {
        super(id);
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
