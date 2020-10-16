package com.example.mybatis.service;


import com.example.mybatis.dto.TestDto;
import com.example.mybatis.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    public TestMapper testMapper;

    public TestDto selectTest(){
        return testMapper.selectTest();
    }
}
