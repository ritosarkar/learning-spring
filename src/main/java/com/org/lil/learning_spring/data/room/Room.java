package com.org.lil.learning_spring.data.room;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="ROOM_ID")
   private long id;
   @Column(name="NAME")
   private String name;
   @Column(name="ROOM_NUMBER")
   private String roomNumber;
   @Column(name="BED_INFO")
   private String debInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDebInfo() {
        return debInfo;
    }

    public void setDebInfo(String debInfo) {
        this.debInfo = debInfo;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", debInfo='" + debInfo + '\'' +
                '}';
    }
}
