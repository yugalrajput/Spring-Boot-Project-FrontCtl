package com.rays.form;

import com.rays.common.BaseForm;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class UserRegistrationForm extends BaseForm {

    @NotEmpty(message = "firstName is required")
    private String firstName;

    @NotEmpty(message = "lastName is required")
    private String lastName;

    @NotEmpty(message = "loginId is required")
    private String loginId;

    @NotEmpty(message = "password is required")
    private String password;

    private Date dob;

    public UserRegistrationForm() {
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

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
