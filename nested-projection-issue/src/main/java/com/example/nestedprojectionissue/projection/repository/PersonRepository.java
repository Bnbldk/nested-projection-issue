package com.example.nestedprojectionissue.projection.repository;

import com.example.nestedprojectionissue.projection.model.Person;
import com.example.nestedprojectionissue.projection.view.PersonView;
import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Long> {
    PersonView findByLastName(String lastName);

}
