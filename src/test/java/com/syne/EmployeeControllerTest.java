package com.syne;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.syne.api.model.Employee;

public class EmployeeControllerTest extends AbstractTest {
	
   @Override
   @Before
   public void setUp() {
      super.setUp();
   }
   
   @Test
   public void getEmployeeList() throws Exception {
      String uri = "/employees/1";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      Employee[] empList = super.mapFromJson(content, Employee[].class);
      assertTrue(empList.length > 0);
   }
   //@Test
   public void createEmployee() throws Exception {
      String uri = "/products";
      Employee employee = new Employee();
//      product.setId("3");
//      product.setName("Ginger");
      String inputJson = super.mapToJson(employee);
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
         .contentType(MediaType.APPLICATION_JSON_VALUE)
         .content(inputJson)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(201, status);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals(content, "Product is created successfully");
   }
}
