package com.model;


import lombok.Data;

import java.io.Serializable;

/**
 * @author Edo
 */
@Data
public class Customer implements Serializable{
    private int cusId;
    private int empId;
    private String cusName;
    private String address;
    private String contact;
    private String tel;
    private String email;

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", empId=" + empId +
                ", cusName='" + cusName + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
