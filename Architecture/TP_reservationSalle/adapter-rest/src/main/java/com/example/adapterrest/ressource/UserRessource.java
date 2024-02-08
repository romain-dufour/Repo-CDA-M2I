package com.example.adapterrest.ressource;


import com.example.adapterrest.dto.UserDto;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.example.domain.service.UserService;
import org.example.infra.orm.repository.UserEntityRepository;
import org.example.infra.orm.repository.impl.UserRepositoryImpl;

@Path("user")
public class UserRessource {

    private final UserService userService;

    public UserRessource() {
        userService = new UserService(new UserRepositoryImpl(new UserEntityRepository()));
    }

    @POST
    public Response post(UserDto userDto){
        try {
            userService.createUser(userDto.getUserName(),userDto.isAdmin());
            return Response.ok().build();
        } catch (Exception ex) {
            return Response.status(500, "Erreur serveur").build();
        }
    }




}
