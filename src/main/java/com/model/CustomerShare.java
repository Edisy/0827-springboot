package com.model;

import java.io.Serializable;

public class CustomerShare implements Serializable {
    private int id;
    private int cusId;
    private int empId;

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

    @Override
    public String toString() {
        return "CustomerShare{" +
                "id=" + id +
                ", cusId=" + cusId +
                ", empId=" + empId +
                '}';
    }
}
