package com.example.mybatis.mapper;


import com.example.mybatis.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    TestDto selectTest();
}
