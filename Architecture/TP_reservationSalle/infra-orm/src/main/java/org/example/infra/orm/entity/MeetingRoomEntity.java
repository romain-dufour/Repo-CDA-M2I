package org.example.infra.orm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.entity.MeetingRoom;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeetingRoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int capacity;


    @OneToOne(mappedBy = "meetingRoomEntity")
    private BookingEntity bookingEntity;

    public MeetingRoom toMeetingRoom(){return new MeetingRoom.Builder()
            .capacity(capacity)
            .booking(bookingEntity.toBooking())
            .build();}
}
