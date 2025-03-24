package com.machinarymgmt.service.api.data;

import com.machinarymgmt.service.api.data.model.OvertimeReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OvertimeReportRepository extends JpaRepository<OvertimeReport, Long> {
}
