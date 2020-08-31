package com.model;

public class Permission {
    private int pId;
    private String pName;
    private String pUrl;
    private int isMenu;
    private int parentId;
    private String pInfo;
    private int roleId;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }

    public int getIsMenu() {
        return isMenu;
    }

    public void setIsMenu(int isMenu) {
        this.isMenu = isMenu;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getpInfo() {
        return pInfo;
    }

    public void setpInfo(String pInfo) {
        this.pInfo = pInfo;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pUrl='" + pUrl + '\'' +
                ", isMenu=" + isMenu +
                ", parentId=" + parentId +
                ", pInfo='" + pInfo + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
