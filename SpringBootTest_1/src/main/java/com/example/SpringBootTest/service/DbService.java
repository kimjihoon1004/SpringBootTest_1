package com.example.SpringBootTest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.SpringBootTest.dao.DbMapper;
import com.example.SpringBootTest.dto.TestDTO;
 
@Service
public class DbService {
    
    @Autowired
    DbMapper dbmapper;
    
    public List<TestDTO> getList() throws Exception{
        
        return dbmapper.getList();
        
    }
}