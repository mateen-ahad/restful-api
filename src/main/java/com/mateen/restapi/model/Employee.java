package com.mateen.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long ID;

    private String firstName;
    private String lastName;
    private String role;

    Employee(){}

    public Employee(String firstName, String lastName, String role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public void setName(String name){
        String [] part = name.split(" ");
        this.firstName = part[0];
        this.lastName = part[1];
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return  Objects.equals(this.ID, employee.ID) &&
                Objects.equals(this.firstName, employee.firstName) &&
                Objects.equals(this.lastName, employee.lastName) &&
                Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ID, this.firstName, this.lastName, this.role);
    }

    @Override
    public String toString() {
        return  "Employee{" + "id=" + this.ID + ", " +
                "firstName='" + this.firstName + '\'' + ", " +
                "lastName='" + this.lastName + '\'' + ", " +
                "role='" + this.role + '\'' + '}';
    }
}
