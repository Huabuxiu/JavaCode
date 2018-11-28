package exp_5;

import exp_5.Employee;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Employee Tester. 
* 
* @author <Authors name> 
* @since <pre>11/28/2018</pre> 
* @version 1.0 
*/ 
public class EmployeeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {
    Employee employee = new Employee("huabuiux",21,"男");
    System.out.println(employee.toString());
//TODO: Test goes here... 
} 


} 
