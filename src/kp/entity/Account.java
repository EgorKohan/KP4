package kp.entity;

import java.util.Objects;

public class Account {
    private String login;
    private String password;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return login.equals(account.login) &&
                password.equals(account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "Account{" +
                "login= " + login + " | " +
                "password= " + password + " | " +
                " }";
    }
}
