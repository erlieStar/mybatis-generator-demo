package com.generator.demo.dao;

import com.generator.demo.entity.StudentExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: lilimin
 * @Date: 2019/4/6 20:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void countByExample() throws Exception {

        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        // id >= 1
        criteria.andIdGreaterThanOrEqualTo(1);
        // id < 4
        criteria.andIdLessThan(4);
        assertEquals(3, studentMapper.countByExample(example));
    }

}