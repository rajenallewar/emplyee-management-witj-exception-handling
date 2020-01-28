package com.syne;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.syne.api.exception.EmployeeNotFoundException;
import com.syne.api.service.impl.EmployeeServiceImpl;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)

public class MockitoDemoApplicationTests {
	
   @Autowired
   private EmployeeServiceImpl empService;
   

   @Test
   public void whenEmpIdIsProvided_thenRetrievedEmpNameIsCorrect() throws EmployeeNotFoundException {
      Mockito.when(empService.getEmployeeById(1).getName()).thenReturn("Raj");
      String testName = empService.getEmployeeById(1).getName();
      Assert.assertEquals("Raj", testName);
   }
}
