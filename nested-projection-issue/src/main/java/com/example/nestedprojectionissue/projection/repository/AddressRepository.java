package com.example.nestedprojectionissue.projection.repository;

import com.example.nestedprojectionissue.projection.model.Address;
import com.example.nestedprojectionissue.projection.view.AddressView;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface AddressRepository extends Repository<Address, Long> {
    Optional<AddressView> getAddressByState(String state);
    Optional<Address> getAddressByCity(String city);
}
