package com.vgsoftware.web.data.system;

import java.util.Date;

public class NewsComment
{
	private long id=-1;
	private String comment=null;
	private Date postDate=null;
	private Date editDate=null;
	private NewsItem newsItem=null;
	private Member poster=null;

	/**
	 * @return Returns the comment.
	 */
	public String getComment()
	{
		return (comment);
	}
	/**
	 * @param comment The comment to set.
	 */
	public void setComment(String comment)
	{
		this.comment=comment;
	}
	/**
	 * @return Returns the editDate.
	 */
	public Date getEditDate()
	{
		return (editDate);
	}
	/**
	 * @param editDate The editDate to set.
	 */
	public void setEditDate(Date editDate)
	{
		this.editDate=editDate;
	}
	/**
	 * @return Returns the id.
	 */
	public long getId()
	{
		return (id);
	}
	/**
	 * @param id The id to set.
	 */
	public void setId(long id)
	{
		this.id=id;
	}
	/**
	 * @return Returns the newsItem.
	 */
	public NewsItem getNewsItem()
	{
		return (newsItem);
	}
	/**
	 * @param newsItem The newsItem to set.
	 */
	public void setNewsItem(NewsItem newsItem)
	{
		this.newsItem=newsItem;
	}
	/**
	 * @return Returns the postDate.
	 */
	public Date getPostDate()
	{
		return (postDate);
	}
	/**
	 * @param postDate The postDate to set.
	 */
	public void setPostDate(Date postDate)
	{
		this.postDate=postDate;
	}
	/**
	 * @return Returns the poster.
	 */
	public Member getPoster()
	{
		return (poster);
	}
	/**
	 * @param poster The poster to set.
	 */
	public void setPoster(Member poster)
	{
		this.poster=poster;
	}
	
}
