package org.example.adapteur.ressource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.adapteur.dto.DepenseDTO;
import org.example.entity.Depense;
import org.example.infra.orm.repository.DepenseEntityRepository;
import org.example.infra.orm.repository.impl.DepenseRepositoryImpl;
import org.example.service.DepenseService;

import java.util.List;
import java.util.stream.Collectors;

@Path("depense")
public class DepenseRessource {


    private final DepenseService depenseService;


    public DepenseRessource() {
        depenseService = new DepenseService(new DepenseRepositoryImpl(new DepenseEntityRepository()));
    }


    @POST
    public Response post(DepenseDTO depenseDTO) {
        try {
            depenseService.createDepense(depenseDTO.getMontant(), depenseDTO.getTitre());
            return Response.ok().build();
        } catch (Exception e) {
            return Response.status(500, "Erreur serveur").build();
        }
    }

    @GET
    @Path("listeDepense")
    @Produces(MediaType.APPLICATION_JSON)
    public List<DepenseDTO> get(){
        List<Depense> depenses = depenseService.depenses();
        return depenses
                .stream()
                .map(depense -> DepenseDTO.
                        builder().
                        montant(depense.getMontant())
                        .titre(depense.getTitre())
                        .id(depense.getId())
                        .build()).collect(Collectors.toList());
    }



}
