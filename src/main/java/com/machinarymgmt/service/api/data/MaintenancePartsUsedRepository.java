package com.machinarymgmt.service.api.data;

import com.machinarymgmt.service.api.data.model.MaintenancePartsUsed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenancePartsUsedRepository extends JpaRepository<MaintenancePartsUsed, Long> {
}
