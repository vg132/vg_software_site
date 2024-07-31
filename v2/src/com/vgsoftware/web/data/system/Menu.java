package com.vgsoftware.web.data.system;

import java.util.List;

public class Menu
{
	private long id=-1;
	private Menu parent=null;
	private String name=null;
	private String url=null;
	private boolean membersOnly=false;
	private int orderNr=-1;
	private List subMenuItems=null;

	/**
	 * @return Returns the id.
	 */
	public long getId()
	{
		return(id);
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(long id)
	{
		this.id=id;
	}

	/**
	 * @return Returns the membersOnly.
	 */
	public boolean isMembersOnly()
	{
		return(membersOnly);
	}

	/**
	 * @param membersOnly The membersOnly to set.
	 */
	public void setMembersOnly(boolean membersOnly)
	{
		this.membersOnly=membersOnly;
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
	 * @return Returns the order.
	 */
	public int getOrderNr()
	{
		return orderNr;
	}
	/**
	 * @param order The order to set.
	 */
	public void setOrderNr(int orderNr)
	{
		this.orderNr=orderNr;
	}

	/**
	 * @return Returns the parent.
	 */
	public Menu getParent()
	{
		return parent;
	}

	/**
	 * @param parent The parent to set.
	 */
	public void setParent(Menu parent)
	{
		this.parent=parent;
	}

	/**
	 * @return Returns the subMenuItems.
	 */
	public List getSubMenuItems()
	{
		return subMenuItems;
	}

	/**
	 * @param subMenuItems The subMenuItems to set.
	 */
	public void setSubMenuItems(List subMenuItems)
	{
		this.subMenuItems=subMenuItems;
	}

	/**
	 * @return Returns the url.
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * @param url The url to set.
	 */
	public void setUrl(String url)
	{
		this.url=url;
	}
}
