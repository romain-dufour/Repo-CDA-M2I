package com.example.exercice_spring_boutique_bonbons.repository;

import com.example.exercice_spring_boutique_bonbons.entity.Candy;
import com.example.exercice_spring_boutique_bonbons.entity.CandyOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "candies", collectionResourceRel = "candies")
public interface CandyRepository extends CrudRepository<Candy,Long> {


//    List<Candy> findAllByName(String name);

    @RestResource(path = "searchname")
    List<Candy> findAllByNameContaining(@Param("name") String name);
    List<Candy> findAllByPriceBetween(double minPrice, double maxPrice);

    List<Candy> findAllByMagicEffect(String magicEffect);


    // interdire la suppression par Id
//    @RestResource(exported = false)
//    void deleteById(long id);


}
