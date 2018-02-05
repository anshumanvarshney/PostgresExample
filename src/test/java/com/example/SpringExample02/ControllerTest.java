//package com.example.SpringExample02;
//
//import com.example.SpringExample02.controller.EmployeeController;
//import com.example.SpringExample02.entity.Employee;
//import com.example.SpringExample02.services.EmployeeService;
//import org.hamcrest.CoreMatchers;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MockMvcBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class ControllerTest {
//    @InjectMocks
//    private EmployeeController employeeController;
//
//    @Mock
//    private EmployeeService employeeService;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp(){
//        MockitoAnnotations.initMocks(this);
//        this.mockMvc = MockMvcBuilders.standaloneSetup(this.employeeController).build();
//    }
//
//    @After
//    public void tearDown(){
//        Mockito.verifyNoMoreInteractions(employeeService);
//    }
//
//    @Test
//    public void testGetOne() throws Exception {
//        Employee employee = new Employee();
//        employee.setEmployeeId("id");
//        Mockito.when(employeeService.findOne("id")).thenReturn(employee);
//        this.mockMvc.perform(MockMvcRequestBuilders.get("/employee/getOne/{employeeId}","id"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("employeeId", CoreMatchers.equalTo("id")))
//                .andExpect(MockMvcResultMatchers.jsonPath("firstName",CoreMatchers.nullValue()));
//        Mockito.verify(employeeService).findOne("id");
//
//    }
//}
