package com.ranjeet.jobportal.company.dto;

import com.ranjeet.jobportal.dto.JobDto;

import java.math.BigDecimal;
import java.util.List;

public record CompanyDto(
        Long id,
        String name,
        String logo,
        String industry,
        String size,
        BigDecimal rating,
        String locations,
        Integer founded,
        String description,
        Integer employees,
        String website,
        java.time.Instant createdAt, List<JobDto> jobs
) {
}