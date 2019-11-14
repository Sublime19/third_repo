/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpacalculator;

/**
 *
 * @author Miftahudeen
 */
class Course {

    private int score;
    private String courseCode;
    private String courseTitle;
    private int creditPoint;
    private int point;
    private char grade;
    private String remark;
    static int totalCreditPoint;
    static int totalUnit;
    private int unit;

    public Course(int score, String courseCode, String courseTitle, int unit) {
        this.score = score;
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.unit = unit;
    }

    public Course(String courseCode, String courseTitle, int unit) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.unit = unit;
    }

    public Course(int unit, int score) {
        this.unit = unit;
        this.score = score;
    }

    public Course() {
    }

    public Course(int score) {
        this.score = score;

    }

    public Course(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCreditPoint() {
        return creditPoint;
    }

    public void setCreditPoint() {
        this.creditPoint = this.point * this.unit;
    }

    public int getPoint() {
        return this.point;
    }

    public void setPoint() {
        if (this.score <= 100 && this.score >= 70) {
            this.point = 5;
        } else if (this.score < 70 && this.score >= 60) {
            this.point = 4;
        } else if (this.score < 60 && this.score >= 50) {
            this.point = 3;
        } else if (this.score < 50 && this.score >= 45) {
            this.point = 2;
        } else if (this.score < 45 && this.score >= 40) {
            this.point = 1;
        } else if (this.score < 40 && this.score >= 0) {
            this.point = 0;
        } else {
            this.point = -1;
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(int point) {
        switch (point) {

            case 1:
                this.grade = 'E';
                break;

            case 2:
                this.grade = 'D';
                break;

            case 3:
                this.grade = 'C';
                break;

            case 4:
                this.grade = 'B';
                break;

            case 5:
                this.grade = 'A';
                break;

            default:
                this.grade = 'F';
                break;

        }
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark() {
        if (this.score >= 40) {
            this.remark = "Pass";
        } else {
            this.remark = "Fail";
        }
    }

}
