package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchingFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    private final static Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public void processSearchingEmployee(String lastname) {
        List<Employee> employees = employeeDao.retrieveEmployeesWithLastNameLike(lastname).orElse(new ArrayList<Employee>());
        if (employees.size() != 0) {
            for (Employee employee : employees) {
                LOGGER.info("Found employee: " + employee.getLastname() + "whose last name contains: " + lastname);
            }
        } else {
            LOGGER.error("Can not find any employee with last name contains: " + lastname);
        }
    }

    public void processSearchingCompany(String name) {
        List<Company> companies = companyDao.retrieveCompanyWithName(name).orElse(new ArrayList<Company>());
        if (companies.size() != 0) {
            for (Company company : companies) {
                LOGGER.info("Found company: " + company.getName() + " whose  name contains: " + name);
            }
        } else {
            LOGGER.error("Can not find any company with name contains: " + name);
        }
    }
}
