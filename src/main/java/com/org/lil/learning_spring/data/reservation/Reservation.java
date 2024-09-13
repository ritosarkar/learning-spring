package com.org.lil.learning_spring.data.reservation;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="RESERVATION_ID")
    private long id;

    @Column(name="ROOM_ID")
    private long room_id;
    @Column(name="GUEST_ID")
    private long guest_id;
    @Column(name="RES_DATE")
    private Date res_date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public long getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(long guest_id) {
        this.guest_id = guest_id;
    }

    public Date getRes_date() {
        return res_date;
    }

    public void setRes_date(Date res_date) {
        this.res_date = res_date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", room_id=" + room_id +
                ", guest_id=" + guest_id +
                ", res_date=" + res_date +
                '}';
    }
}
