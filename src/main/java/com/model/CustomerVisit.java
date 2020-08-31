package com.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CustomerVisit implements Serializable {
    private int id;
    private int cusId;
    private int empId;
    private String content;
    @JsonFormat(shape = JsonFormat.Shape.STRING,timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm")
    private Date date;
    private List<Customer> customers;
    private List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "CustomerVisit{" +
                "id=" + id +
                ", cusId=" + cusId +
                ", empId=" + empId +
                ", contact='" + content + '\'' +
                ", date=" + date +
                ", customers=" + customers +
                ", employees=" + employees +
                '}';
    }
}
