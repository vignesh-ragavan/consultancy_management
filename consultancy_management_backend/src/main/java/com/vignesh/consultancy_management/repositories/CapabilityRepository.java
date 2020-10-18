package com.vignesh.consultancy_management.repositories;

import com.vignesh.consultancy_management.domain.Capability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapabilityRepository extends JpaRepository<Capability,Long> {
}
