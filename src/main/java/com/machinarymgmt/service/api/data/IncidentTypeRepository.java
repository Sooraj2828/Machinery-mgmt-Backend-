package com.machinarymgmt.service.api.data;

import com.machinarymgmt.service.api.data.model.IncidentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentTypeRepository extends JpaRepository<IncidentType, Long> {
}
