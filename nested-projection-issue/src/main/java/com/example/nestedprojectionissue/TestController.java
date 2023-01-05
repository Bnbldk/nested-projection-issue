package com.example.nestedprojectionissue;

import com.example.nestedprojectionissue.projection.model.Address;
import com.example.nestedprojectionissue.projection.repository.AddressRepository;
import com.example.nestedprojectionissue.projection.view.AddressView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class TestController {

    private final AddressRepository addressRepository;

    @GetMapping(value = "/address")
    public Optional<AddressView> getAddress() {
        return addressRepository.getAddressByState("xpto");
    }

    @GetMapping(value = "/v2/address")
    public Optional<Address> getAddress2() {
        return addressRepository.getAddressByCity("xpto");
    }

}
