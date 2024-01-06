package dao;

import models.Person;

public interface PersonDAO {
    public boolean addPerson(Person person);
    public boolean deletePerson(Long personId);

}
