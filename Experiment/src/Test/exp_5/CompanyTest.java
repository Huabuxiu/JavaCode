package exp_5;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* Company Tester. 
* 
* @author <Authors name> 
* @since <pre>11/28/2018</pre> 
* @version 1.0 
*/ 
public class CompanyTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetSetName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getClassName() 
* 
*/ 
@Test
public void testGetClassName() throws Exception {

    Company company = new Company("阿里巴巴");
    System.out.println(company.getClassName());
//TODO: Test goes here... 
} 


} 
