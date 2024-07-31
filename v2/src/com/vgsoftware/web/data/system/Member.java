package com.vgsoftware.web.data.system;

import java.util.Date;
import java.util.List;

public class Member
{
	private long id=-1;
	private String name=null;
	private String password=null;
	private String email=null;
	private Date joinDate=null;
	private List roles=null;

	/**
	 * @return Returns the email.
	 */
	public String getEmail()
	{
		return email;
	}
	/**
	 * @param email The email to set.
	 */
	public void setEmail(String email)
	{
		this.email=email;
	}
	/**
	 * @return Returns the id.
	 */
	public long getId()
	{
		return id;
	}
	/**
	 * @param id The id to set.
	 */
	public void setId(long id)
	{
		this.id=id;
	}
	/**
	 * @return Returns the joinDate.
	 */
	public Date getJoinDate()
	{
		return joinDate;
	}
	/**
	 * @param joinDate The joinDate to set.
	 */
	public void setJoinDate(Date joinDate)
	{
		this.joinDate=joinDate;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	 * @return Returns the password.
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * @param password The password to set.
	 */
	public void setPassword(String password)
	{
		this.password=password;
	}
	/**
	 * @return Returns the roles.
	 */
	public List getRoles()
	{
		return roles;
	}
	/**
	 * @param roles The roles to set.
	 */
	public void setRoles(List roles)
	{
		this.roles=roles;
	}
	

}
