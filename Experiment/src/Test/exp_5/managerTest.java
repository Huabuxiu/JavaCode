package exp_5;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* manager Tester. 
* 
* @author <Authors name> 
* @since <pre>11/28/2018</pre> 
* @version 1.0 
*/ 
public class managerTest { 

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

    manager manager = new manager("huabuiux",21,"男","boss","200k");
    System.out.println(manager.toString());
//TODO: Test goes here... 
} 


} 
