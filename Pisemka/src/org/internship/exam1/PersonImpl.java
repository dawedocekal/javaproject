package org.internship.exam1;

/**
 * Created by Davča on 8.6.2017.
 */
public class PersonImpl implements Person {
    private String name;
    private String phoneNumber;
    private String email;

    public PersonImpl(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public String toString() {
        if (name != null) {
            return name;
        }
        return "Anonymous";
    }
}
