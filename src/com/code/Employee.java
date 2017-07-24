package com.code;

public class Employee
{
	String firstname=null;
	String lastname=null;
	public String getEmployeeName()
	{
		String returnValue= null;
		if((this.firstname!=null)&&(this.lastname!=null))
			returnValue= this.firstname + " " + this.lastname;
		else if(this.firstname!=null)
			returnValue= this.firstname + "N/A";
		else if(this.lastname!=null)
			returnValue= "N/A" + this.lastname;
		else
			returnValue="N/A" + "N/A";
		
		return returnValue;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
