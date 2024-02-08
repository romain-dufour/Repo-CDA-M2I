package com.example.adapterrest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MeetingRoomDto {
    private int id;
    private int capacity;

    private BookingDto bookingDto;
}
