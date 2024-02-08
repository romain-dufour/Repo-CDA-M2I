package com.example.adapterrest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingDto {
    private int id;
    private UserDto userDto;
    private MeetingRoomDto meetingRoomDto ;

    private LocalDateTime startReservation;

    private LocalDateTime endReservation;
}
