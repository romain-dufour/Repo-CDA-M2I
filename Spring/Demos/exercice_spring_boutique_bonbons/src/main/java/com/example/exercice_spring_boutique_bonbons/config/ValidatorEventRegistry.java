package com.example.exercice_spring_boutique_bonbons.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.validation.Validator;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Configuration
public class ValidatorEventRegistry implements InitializingBean {

    // la liste des validators enregistré dans spring CDI
    @Autowired
    private Map<String, Validator> validators;

    //un objet qui permet d'enregistrer des validators dans les events des repos spring data rest
    @Autowired
    ValidatingRepositoryEventListener validatingRepositoryEventListener;
    @Override
    public void afterPropertiesSet() throws Exception {
        List<String> events = Arrays.asList("beforeCreate", "beforeDelete","beforeSave", "beforeLinkSave");

        //pour chaque envent , on cherche le validator qui commence par le meme nom que l'event
        for(Map.Entry<String, Validator> entry: validators.entrySet()) {
            //Pour chaque event, on cherche le validator qui commence par le meme nom que l'event et on l'ajoute dans l'event du repos
            events.stream().filter(e ->entry.getKey().startsWith(e))
                    .findFirst().ifPresent(p ->
                            validatingRepositoryEventListener
                                    .addValidator(p,entry.getValue())
                    );
    }}
}
