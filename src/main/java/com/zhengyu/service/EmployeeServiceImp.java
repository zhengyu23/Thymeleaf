package com.zhengyu.service;

import com.zhengyu.dao.EmployeeDao;
import com.zhengyu.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService{

    private EmployeeDao employeeDao;

    @Autowired(required = false)
    public EmployeeServiceImp(EmployeeDao employeeDao){this.employeeDao=employeeDao;}

    @Override
    public void delete(Integer id) {
        employeeDao.delete(id);
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeDao.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public List<Employee> lists() {
        return employeeDao.lists();
    }
}
