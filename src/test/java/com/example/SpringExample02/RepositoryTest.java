//package com.example.SpringExample02;
//
//import com.example.SpringExample02.entity.Employee;
//import com.example.SpringExample02.repository.EmployeeRepository;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
////@SpringBootTest
//public class RepositoryTest {
//    @Autowired
//    private EmployeeRepository repository;
//
//    private Employee employee = new Employee();
//    private  Employee employee2 = new Employee();
//   @Before
//    public void setUp(){
//       employee.setEmployeeId("1");
//       employee.setEmployeeId("2");
//       employee.setFirstName("Anshuman");
//       employee2.setFirstName("Coviam");
//
//        repository.save(employee);
//        repository.save(employee2);
//
//    }
//
//    //to clear the data
//    @After
//    public  void tearDown(){
//        repository.deleteAll();
//    }
//
//    @Test
//    public void testFindByFirstName_empty_outputEmpty(){
//        Employee result = repository.findByFirstName("");
//        Assert.assertNull(result);
//    }
//
//    @Test
//    public void testFindByFirstName_null_outputNull(){
//        Employee result = repository.findByFirstName(null);
//        Assert.assertNull(result);
//    }
//
//    @Test
//    public void testFindByFirstName_notNull_outputNotNull(){
//        Employee result = repository.findByFirstName("Anshuman");
//        Assert.assertEquals("Anshuman",result.getFirstName());
//    }
//
////    @Test
////    public void test
//
//}
