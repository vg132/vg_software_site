package com.vgsoftware.web.action.test;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.vgsoftware.web.model.news.NewsModel;
import com.vgsoftware.web.data.system.Role;
import com.vgsoftware.web.util.Constants;

public class Test extends Action
{
	private static Log log=LogFactory.getLog(Test.class);
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	throws IOException
	{
		try
		{
			Session session=null;
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			session=sessionFactory.openSession();
			Role r=new Role();
			r.setName("Admin");
			session.save(r);
			
			
			/*
			System.out.println("Inserting Record");
			Contact contact=new Contact();
			//contact.setId();
			contact.setFirstName("Kalle");
			contact.setLastName("Anka");
			contact.setEmail("kalle.anka@dropit.se");
			Set hs=new HashSet();
			hs.add("kalle@vgsoftware.com");
			hs.add("kalle.anka@gmail.com");
			hs.add("kalle.anka@gmail.com");
			hs.add("kalle.anka2@gmail.com");
			contact.setEmailAddresses(hs);
			session.save(contact);
			System.out.println("Done");
			*/

			//request.setAttribute("newsItems",NewsModel.getNews(getDataSource(request)));
		}
		catch(Exception e)
		{
			log.error(e);
		}
		return(mapping.findForward(Constants.SUCCESS));
	}
}
