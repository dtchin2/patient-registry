package com.dtchin2.npr.entity;

import java.util.Date;

public class Patient {

    private Long patientId;
    private String patientFirstName;
    private String patientLastName;
    private Date patientDOB;
    private Long patientSSN;
    private String patientPhoneNumber;
    private String patientEmail;

    public Patient(){}

    public Patient(String patientFirstName, String patientLastName, Date patientDOB, Long patientSSN, String patientPhoneNumber, String patientEmail) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientDOB = patientDOB;
        this.patientSSN = patientSSN;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientEmail = patientEmail;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public Date getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(Date patientDOB) {
        this.patientDOB = patientDOB;
    }

    public Long getPatientSSN() {
        return patientSSN;
    }

    public void setPatientSSN(Long patientSSN) {
        this.patientSSN = patientSSN;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientFirstName='" + patientFirstName + '\'' +
                ", patientLastName='" + patientLastName + '\'' +
                ", patientDOB=" + patientDOB +
                ", patientSSN=" + patientSSN +
                ", patientPhoneNumber='" + patientPhoneNumber + '\'' +
                ", patientEmail='" + patientEmail + '\'' +
                '}';
    }
}
