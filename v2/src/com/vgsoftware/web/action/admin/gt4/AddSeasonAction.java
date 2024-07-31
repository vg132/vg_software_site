package com.vgsoftware.web.action.admin.gt4;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.vgsoftware.web.data.gt4.SeasonData;
import com.vgsoftware.web.form.gt4.SeasonForm;
import com.vgsoftware.web.model.gt4.SeasonModel;
import com.vgsoftware.web.util.Constants;

/**
 * @author viktor
 * @version 1.0
 * 
 * History:
 * 2005-apr-15 - Document created.
 */
public class AddSeasonAction extends Action
{
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	throws IOException
	{
		ActionErrors ae=null;
		SeasonForm sf=(SeasonForm)form;
		try
		{
			SeasonData sd=new SeasonData();
			sd.setName(sf.getName());
			sd.setPointRounds(sf.getPointRounds());
			SeasonModel.addSeason(sd,getDataSource(request));
			return(mapping.findForward(Constants.SUCCESS));
		}
		catch(SQLException sql)
		{
			ae=new ActionErrors();
			ae.add("unknown_error",new ActionMessage("error.unknown.database"));
			addErrors(request,ae);
			sql.printStackTrace(System.err);
		}
		return(mapping.findForward(Constants.ERROR));
	}
}
