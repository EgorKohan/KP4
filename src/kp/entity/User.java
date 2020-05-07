package kp.entity;

import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private int age;
    private Account account;

    public User(){

    }

    public User(String name, String surname, int age, Account account) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name) &&
                surname.equals(user.surname) &&
                account.equals(user.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, account);
    }

    @Override
    public String toString() {
        return account.toString()  + "User{ " +
                "name= " + name + " | " +
                "surname= " + surname + " | " +
                "age= " + age +
                " }";
    }
}
