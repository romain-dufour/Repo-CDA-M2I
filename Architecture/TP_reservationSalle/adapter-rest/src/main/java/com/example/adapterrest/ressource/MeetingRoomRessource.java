package com.example.adapterrest.ressource;


import com.example.adapterrest.dto.MeetingRoomDto;
import com.example.adapterrest.dto.UserDto;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.example.domain.service.MeetingRoomService;
import org.example.infra.orm.repository.MeetingRoomEntityRepository;
import org.example.infra.orm.repository.impl.MeetingRoomRepositoryImpl;

@Path("meetingRoom")
public class MeetingRoomRessource {

    private final MeetingRoomService meetingRoomService;


    public MeetingRoomRessource() {
        meetingRoomService = new MeetingRoomService(new MeetingRoomRepositoryImpl(new MeetingRoomEntityRepository()));
    }

    @POST
    public Response post(MeetingRoomDto meetingRoomDto){
        try {
            meetingRoomService.createMeetingRoom(meetingRoomDto.getCapacity());
            return Response.ok().build();
        } catch (Exception ex) {
            return Response.status(500, "Erreur serveur").build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
        try {
            meetingRoomService.deleteMeetingRoom(id);
            return Response.ok().build();
        }catch (Exception ex) {
            return Response.status(500, "Erreur serveur").build();
        }
    }

    @PATCH


}

