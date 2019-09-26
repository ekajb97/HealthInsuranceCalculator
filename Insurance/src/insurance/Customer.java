package insurance;

import java.util.*;

public class Customer {

    private String firstName;

    private String surname;

    private String gender;

    private String age;

    private ArrayList healthConditions;

    private String other;

    private String smoker;

    private Policy policy;
    
    
    
    // Constructors
    

    public Customer(String firstName, String surname, String gender,
            String age, ArrayList healthConditions, String other,
            String smoker) {
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.healthConditions = healthConditions;
        this.other = other;
        this.smoker = smoker;
        
    }
    public Customer() {
    }
    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public ArrayList getHealthconditions() {
        return healthConditions;
    }

    public String getOther() {
        return other;
    }

    public String getSmoker() {
        return smoker;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHealthConditions(ArrayList healthConditions) {
        this.healthConditions = healthConditions;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public String toString() {
        return "First Name: " + firstName + "\nSurname: " + surname
                + "\nGender: " + gender + "\nAge: " + age + 
                "\nHealth Conditions: " + healthConditions +
                "\nOther: " + other + "\nSmoker: " + smoker;
    }

    public void assignPolicy(Policy policy) {
    }
}
