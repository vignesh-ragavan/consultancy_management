package com.vignesh.consultancy_management.services;

import com.vignesh.consultancy_management.domain.Capability;
import com.vignesh.consultancy_management.exceptions.CapabilityException;
import com.vignesh.consultancy_management.repositories.CapabilityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapabilityService {

    private CapabilityRepository capabilityRepository;

    public CapabilityService(CapabilityRepository capabilityRepository) {
        this.capabilityRepository = capabilityRepository;
    }

    public List<Capability> getAllCapabilities(){
        return capabilityRepository.findAll();
    }

    public Capability findCapById(Long id){

        return capabilityRepository.findById(id).
                orElseThrow(()-> new CapabilityException("Capability with ID: "+id+" Not found"));

    }

}
