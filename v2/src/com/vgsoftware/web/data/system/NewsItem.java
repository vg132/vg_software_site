package com.vgsoftware.web.data.system;

import java.util.Date;
import java.util.List;

public class NewsItem
{
	private long id=-1;
	private String title=null;
	private String content=null;
	private Date newsDate=null;
	private boolean openForComments=false;
	private int nrOfComments=-1;
	private List comments=null;
	private Member author=null;

	/**
	 * @return Returns the content.
	 */
	public String getContent()
	{
		return content;
	}
	/**
	 * @param content The content to set.
	 */
	public void setContent(String content)
	{
		this.content=content;
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
	 * @return Returns the title.
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title The title to set.
	 */
	public void setTitle(String title)
	{
		this.title=title;
	}
	/**
	 * @return Returns the comments.
	 */
	public List getComments()
	{
		return (comments);
	}
	/**
	 * @param comments The comments to set.
	 */
	public void setComments(List comments)
	{
		this.comments=comments;
	}
	/**
	 * @return Returns the newsDate.
	 */
	public Date getNewsDate()
	{
		return (newsDate);
	}
	/**
	 * @param newsDate The newsDate to set.
	 */
	public void setNewsDate(Date newsDate)
	{
		this.newsDate=newsDate;
	}
	/**
	 * @return Returns the nrOfComments.
	 */
	public int getNrOfComments()
	{
		return (nrOfComments);
	}
	/**
	 * @param nrOfComments The nrOfComments to set.
	 */
	public void setNrOfComments(int nrOfComments)
	{
		this.nrOfComments=nrOfComments;
	}
	/**
	 * @return Returns the openForComments.
	 */
	public boolean isOpenForComments()
	{
		return (openForComments);
	}
	/**
	 * @param openForComments The openForComments to set.
	 */
	public void setOpenForComments(boolean openForComments)
	{
		this.openForComments=openForComments;
	}
	/**
	 * @return Returns the author.
	 */
	public Member getAuthor()
	{
		return (author);
	}
	/**
	 * @param author The author to set.
	 */
	public void setAuthor(Member author)
	{
		this.author=author;
	}
}
