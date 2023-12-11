package org.rohan;

public class Employee {

    // Create attributes
    private int id;
    private String name;
    private String email; // If these can be modified without restriction, Any trggering methods on change cannot be coded. So, Make these private and handle them via methods

    // Empty Constructor
    public Employee () {

    }

    // Parameterized Constructor
    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // To String
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
