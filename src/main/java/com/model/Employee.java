package com.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private Integer empId;

    private String userName;

    private String userPassword;

    private String tel;

    private String empName;

    private String email;

    private Integer roleId;

    private String roleInfo;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(String roleInfo) {
        this.roleInfo = roleInfo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", tel='" + tel + '\'' +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", roleInfo='" + roleInfo + '\'' +
                '}';
    }
}
