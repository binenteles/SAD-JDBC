package com.sda.alexjelescu.hibernate2.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendanceId")
    private Integer attendanceId;
    @Column(name = "date")
    private Date date;
    @Column(name = "isPresent")
    private Boolean isPresent;
    @Column(name = "studentId")
    private Integer studentId;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getPresent() {
        return isPresent;
    }

    public void setPresent(Boolean present) {
        isPresent = present;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Attendances{" +
                "attendanceId=" + attendanceId +
                ", date=" + date +
                ", isPresent=" + isPresent +
                ", studentId=" + studentId +
                '}';
    }
}
