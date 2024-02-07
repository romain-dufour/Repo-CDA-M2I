package org.example.port;

import org.example.entity.MeetingRoom;
import org.example.entity.User;

import java.time.LocalDateTime;
import java.util.List;

public interface MeetingRoomRepository {

    void create(MeetingRoom meetingRoom);
    void delete(MeetingRoom meetingRoom);

    void update(MeetingRoom meetingRoom);

    MeetingRoom findById(int id);

    List<MeetingRoom> searchByLocalDateTime (LocalDateTime localDateTime);


}
