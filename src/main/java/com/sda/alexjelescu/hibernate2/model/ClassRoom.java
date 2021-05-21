package com.sda.alexjelescu.hibernate2.model;

import javax.persistence.*;

@Entity
@Table(name = "classRoom")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classRoomId")
    private Integer classRoomId;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    public Integer getClassroomId() {
        return classRoomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classRoomId = classroomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ClassRooms{" +
                "classroomId=" + classRoomId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
