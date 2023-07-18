package com.example.SpringBootTest.dao;

import java.util.List;

import com.example.SpringBootTest.dto.TestDTO;
 
public interface DbMapper {
    public List<TestDTO> getList() throws Exception;
}