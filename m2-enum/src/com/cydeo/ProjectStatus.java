package com.cydeo;

public enum ProjectStatus {

    //I want to do  IN PROGRESS (with space)
    OPEN,CLOSED,PROGRESS("IN PROGRESS");//is looking for constructor

   private String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    ProjectStatus() {//do constructor without any parameter
    }


}
