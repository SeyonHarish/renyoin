package com.ooo.renyoin.myservice;

import com.ooo.renyoin.mymodel.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewService {

    public List<Employee> getValue() {

        List<Employee> emp = new ArrayList<>();

        Employee ep1 = new Employee();
        ep1.setEmpId(21);
        ep1.setEmpName("RET");

        Employee ep2 = new Employee();
        ep2.setEmpId(27);
        ep2.setEmpName("Jason");

        emp.add(ep1);
        emp.add(ep2);
        return emp;


    }

}
