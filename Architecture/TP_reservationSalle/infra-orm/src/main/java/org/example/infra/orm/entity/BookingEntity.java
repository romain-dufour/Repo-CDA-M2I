package org.example.infra.orm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.entity.Booking;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "userEntity_id")
    private UserEntity userEntity;

    @OneToOne
    @JoinColumn(name = "bookEntity_id")
    private MeetingRoomEntity meetingRoomEntity;


    private LocalDateTime startReservation;

    private LocalDateTime endReservation;

    public Booking toBooking(){return new Booking.Builder()
            .meetingRoom(meetingRoomEntity.toMeetingRoom())
            .user(userEntity.toUser())
            .startReservation(startReservation)
            .endReservation(endReservation)
            .build();}
}
