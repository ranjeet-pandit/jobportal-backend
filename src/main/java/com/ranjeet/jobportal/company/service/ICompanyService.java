package com.ranjeet.jobportal.company.service;

import com.ranjeet.jobportal.company.dto.CompanyDto;
import com.ranjeet.jobportal.company.entity.Company;

import java.util.List;

public interface ICompanyService {
    List<CompanyDto> getAllCompanies();
//    List<Company> findByName(String name);
}
