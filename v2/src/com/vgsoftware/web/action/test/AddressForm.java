package com.vgsoftware.web.action.test;

import org.apache.struts.action.ActionForm;

public class AddressForm extends ActionForm
{
	private String name=null;
	private String emailAddress=null;
	private String address=null;
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress=emailAddress;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
}
