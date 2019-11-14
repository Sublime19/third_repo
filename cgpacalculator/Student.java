/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpacalculator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miftahudeen
 */
public class Student extends Person {

    String matricNo;

    public String getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }
    List<Course> registeredCourses;

    /**
     *
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param gender
     */
    Student(String matricNo, String firstName, String lastName, String phoneNumber, Gender gender) {
        super(firstName, lastName, phoneNumber, gender);
        this.matricNo = matricNo;
        registeredCourses = new ArrayList<Course>();

    }

    /**
     *
     * @param matricNo
     * @param firstName
     * @param lastName
     * @param middleName
     * @param phoneNumber
     * @param address
     * @param email
     * @param gender
     */
    Student(String matricNo, String firstName, String lastName, String middleName, String phoneNumber, String address, String email, Gender gender) {
        super(firstName, lastName, middleName, phoneNumber, address, email, gender);
        this.matricNo = matricNo;
    }

    void registerCourse(Course course) {
        this.registeredCourses.add(course);
    }

    @Override
    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getMiddleName().charAt(0) + ".";
    }
}
