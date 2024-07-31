package com.vgsoftware.web.data.system;

import java.util.List;

public class Role
{
	private long id=-1;
	private String name=null;
	private List members=null;

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
	
	public List getMembers()
	{
		return(members);
	}
	
	public void setMembers(List members)
	{
		this.members=members;
	}
}
