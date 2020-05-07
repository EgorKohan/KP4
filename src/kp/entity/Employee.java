package kp.entity;

import java.util.Objects;

public class Employee extends User{
    private float salary;

    public Employee(String name, String surname, int age, Account account, float salary) {
        super(name, surname, age, account);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
