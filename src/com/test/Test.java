package com.test;



import com.code.Employee;

import junit.framework.TestCase;

public class Test extends TestCase 
{
	public void testGetEmployeeName()
	{
		Employee e = new Employee();
		e.setFirstname("Mithali");
		e.setLastname("Mithali");
		assertEquals("Mithali Mithali",e.getEmployeeName());
		
		/*Employee e1 = new Employee();
		e1.setFirstname(null);
		e1.setLastname(null);
		assertEquals("N/A N/A",e1.getEmployeeName());
		
		Employee e2 = new Employee();
		e2.setFirstname("Pakhi");
		e2.setLastname(null);
		assertEquals("Pakhi N/A",e2.getEmployeeName());
		
		Employee e3 = new Employee();
		e3.setFirstname(null);
		e3.setLastname("Gargi");
		assertEquals("N/A Gargi",e3.getEmployeeName());
		*/
		
	}

}
