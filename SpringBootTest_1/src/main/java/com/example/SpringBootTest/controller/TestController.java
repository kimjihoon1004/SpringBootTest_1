package com.example.SpringBootTest.controller;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import com.example.SpringBootTest.dto.TestDTO;
import com.example.SpringBootTest.service.DbService;
 
@Controller
public class TestController {
 
    @Autowired
    DbService dbService;
    
    @RequestMapping("/")
    public String main() {
        return "main";
    }
    
    
    
    @RequestMapping("/dbTest")
    public ModelAndView dbTest() throws Exception {
        
        List<TestDTO> list = new ArrayList<TestDTO>();
        list = dbService.getList();
        
        return new ModelAndView("dbTest", "list", list);
        
        
    }
}