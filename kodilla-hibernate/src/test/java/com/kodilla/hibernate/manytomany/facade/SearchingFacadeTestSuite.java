package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.assertj.AssertableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeTestSuite {
    @Autowired
    SearchingFacade searchingFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSearchEmployee() {

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lukasJavorsky = new Employee("Lukas", "Javorsky");

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lukasJavorsky);

        List<Employee> employees = searchingFacade.processSearchingEmployee("sky");

        //Then
        Assert.assertEquals(1,employees.size());
        Assert.assertEquals("Javorsky",employees.get(0).getLastname());

        //CleanUp
        try {
            employeeDao.deleteById(johnSmith.getId());
            employeeDao.deleteById(stephanieClarckson.getId());
            employeeDao.deleteById(lukasJavorsky.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testSearchCompany() {
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        List<Company> companies = searchingFacade.processSearchingCompany("sters");
        //Then
        Assert.assertEquals(1,companies.size());
        Assert.assertEquals("Data Maesters",companies.get(0).getName());
        //CleanUp
        try {
            companyDao.deleteById(softwareMachine.getId());
            companyDao.deleteById(dataMaesters.getId());
            companyDao.deleteById(greyMatter.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}
