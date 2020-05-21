package com.numan.blooddonor;

public class StudentModal {

    String st_rollno,st_name,st_phone;
    public StudentModal(){

    }

    public StudentModal(String st_rollno, String st_name, String st_phone) {
        this.st_rollno = st_rollno;
        this.st_name = st_name;
        this.st_phone = st_phone;
    }

    public String getSt_rollno() {
        return st_rollno;
    }

    public void setSt_rollno(String st_rollno) {
        this.st_rollno = st_rollno;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_phone() {
        return st_phone;
    }

    public void setSt_phone(String st_phone) {
        this.st_phone = st_phone;
    }
}
