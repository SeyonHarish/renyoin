package com.ooo.renyoin.mycotroller;

import com.ooo.renyoin.mymodel.Employee;
import com.ooo.renyoin.myservice.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewController {
    @Autowired
    NewService newService;
    @GetMapping ("/getValue")
    public List<Employee> getValue()
    {
        return newService.getValue();
    }





}
