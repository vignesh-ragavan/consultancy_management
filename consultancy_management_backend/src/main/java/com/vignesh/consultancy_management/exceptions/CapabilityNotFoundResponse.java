package com.vignesh.consultancy_management.exceptions;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;

@Getter
@Setter
public class CapabilityNotFoundResponse {

    private String capabilityNotFound;

    public CapabilityNotFoundResponse(String capabilityNotFound) {
        this.capabilityNotFound = capabilityNotFound;
    }
}
