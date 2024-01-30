package org.example.entity;

import org.example.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class SearchCity {

    private List<String> cities = new ArrayList<>();

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
    public List<String> search(String word) {
        if(word.length() < 2)
            throw new NotFoundException();
        else {
            List<String> result = new ArrayList<>();
            for(String city: cities) {
                if(city.startsWith(word))
                    result.add(city);
            }
            return result;
        }
    }
}
