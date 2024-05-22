/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author lance
 */
public class Student {

    private String studentNumber;
    private String studentName;
    private double milestoneOne;
    private double milestoneTwo;
    private double terminalAssessment;
    private double finalGrade;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studNumber) {
        this.studentNumber = studNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studName) {
        this.studentName = studName;
    }

    public double getMilestoneOne() {
        return milestoneOne;
    }

    public void setMilestoneOne(double milestoneOne) {
        this.milestoneOne = milestoneOne;
    }

    public double getMilestoneTwo() {
        return milestoneTwo;
    }

    public void setMilestoneTwo(double milestoneTwo) {
        this.milestoneTwo = milestoneTwo;
    }

    public double getTerminalAssessment() {
        return terminalAssessment;
    }

    public void setTerminalAssessment(double terminalAssessment) {
        this.terminalAssessment = terminalAssessment;
    }

    public String getFinalGrade() {
        return String.valueOf(finalGrade);
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String computeFinalGrade() {
        finalGrade = milestoneOne + milestoneTwo + terminalAssessment;
        return String.valueOf(finalGrade) + "%";
    }
}
