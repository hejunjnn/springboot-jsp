package com.baizhi.controller;

import com.baizhi.entity.Area;
import com.baizhi.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Area")
public class AreaController {
    @Autowired
    AreaService areaService;

    @RequestMapping("/getAllArea")
    public String  getAllArea(HttpSession session){
        List<Area> allArea = areaService.getAllArea();
        session.setAttribute("Area",allArea);
        return "showAll";
    }
    @RequestMapping("Test")
    public String Testjsp(){
        return "showAll";
    }
}
