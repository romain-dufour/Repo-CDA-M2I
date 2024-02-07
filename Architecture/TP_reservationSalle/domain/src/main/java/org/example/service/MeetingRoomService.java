package org.example.service;

import org.example.entity.MeetingRoom;
import org.example.port.MeetingRoomRepository;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class MeetingRoomService {

    private final MeetingRoomRepository meetingRoomRepository;


    public MeetingRoomService(MeetingRoomRepository meetingRoomRepository) {
        this.meetingRoomRepository = meetingRoomRepository;
    }

    public MeetingRoom createMeetingRoom(int capacity) {
        if (capacity<0) {
            throw new RuntimeException("Capacity must be gt 0");
        }
        MeetingRoom meetingRoom = new MeetingRoom.Builder().capacity(capacity).build();
        meetingRoomRepository.create(meetingRoom);
        return meetingRoom;
    }

    public void deleteMeetingRoom(int id) {
        MeetingRoom meetingRoom = meetingRoomRepository.findById(id);
        if(meetingRoom == null) {
            throw new RuntimeException("MeetingRoom not found");
        }
        meetingRoomRepository.delete(meetingRoom);
    }

    public List<MeetingRoom> searchMeetingRoom (LocalDate localDate, Time hour, int requiredCapacity) {
        if (requiredCapacity<0 ) {
            throw new RuntimeException("the capacity required must be gt 0");
        }
        LocalDateTime localDateTimeSearched = LocalDateTime.of(localDate, LocalTime.from(hour.toLocalTime()));
        List<MeetingRoom> list = meetingRoomRepository.searchByLocalDateTime(localDateTimeSearched);
        return list;
    }


}
