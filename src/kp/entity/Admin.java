package kp.entity;

import java.io.Serializable;
import java.util.Objects;

public class Admin extends User implements Serializable {
    private AdminsType adminsType;

    public Admin() {
    }

    public Admin(String name, String surname, int age, Account account) {
        super(name, surname, age, account);
    }

    public AdminsType getAdminsType() {
        return adminsType;
    }

    public void setAdminsType(AdminsType adminsType) {
        this.adminsType = adminsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return adminsType == admin.adminsType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adminsType);
    }

    @Override
    public String toString() {
        return super.toString() + "Admin{" +
                "adminsType=" + adminsType +
                '}';
    }
}
