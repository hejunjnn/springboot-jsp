package com.baizhi.controller;


import com.baizhi.entity.Person;
import com.baizhi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/Preson")
@Controller
public class PersonController {
    @Autowired
    PersonService personService;
    @ResponseBody
    @RequestMapping("/getAll")
    public List<Person> getAll(){
        return  personService.getAll();
    }
}
