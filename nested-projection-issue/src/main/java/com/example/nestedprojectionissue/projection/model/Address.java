package com.example.nestedprojectionissue.projection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Data
public class Address {
    @Id
    private Long id;

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    private Person person;

    private String state;
    private String city;
    private String street;
    private String zipCode;

}
