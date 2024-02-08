package org.example.domain.port;

import org.example.domain.entity.MeetingRoom;

import java.time.LocalDateTime;
import java.util.List;

public interface MeetingRoomRepository {

    void create(MeetingRoom meetingRoom);
    void delete(MeetingRoom meetingRoom);

    void update(MeetingRoom meetingRoom);

    MeetingRoom findById(int id);

    List<MeetingRoom> searchByLocalDateTime (LocalDateTime localDateTime);


}
