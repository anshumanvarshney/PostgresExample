package com.example.SpringExample02;

import com.example.SpringExample02.entity.Employee;
import com.example.SpringExample02.repository.EmployeeRepository;
import com.example.SpringExample02.services.impl.EmployeeServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceImplTest {
    @InjectMocks
    private EmployeeServiceImpl employeeServiceImpl;

    @Mock
    private EmployeeRepository employeeRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(employeeServiceImpl);
    }

    @After
    public void tearDown(){
        Mockito.verifyNoMoreInteractions(employeeRepository);
    }

    //for one id

//    @Test
//    public void existsTest_EmpId_returnTrue(){
//        Mockito.when(employeeRepository.exists("id")).thenReturn(true);
//
//        boolean result = employeeServiceImpl.exists("id");
//        Assert.assertTrue(result);
//        Mockito.verify(employeeRepository).exists("id");
//    }

    //for two id's

    @Test
    public void existsTest_EmpId_returnTrue(){
        Mockito.when(employeeRepository.exists("id")).thenReturn(true);

        boolean result = employeeServiceImpl.exists("id");
        Assert.assertTrue(result);

        boolean result2 = employeeServiceImpl.exists("id2");
        Assert.assertFalse(result2); ;
        Mockito.verify(employeeRepository,Mockito.times(2)).exists(Mockito.anyString());
    }

}
