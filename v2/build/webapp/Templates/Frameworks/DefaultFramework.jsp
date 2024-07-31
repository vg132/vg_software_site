<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
		<title><tiles:getAsString name="pageTitle"/></title>
        <base href="<bean:message bundle="vgsoftware" key="baseurl" />" />
		<script type="text/javascript" src="<bean:message bundle="vgsoftware" key="basescript" />"></script>
        <link rel="stylesheet" href="<bean:message bundle="vgsoftware" key="basestyle" />" type="text/css" />
	</head>
	<body>
		<jsp:include page="/include/content/header.html" />
		<div id="content">
			<h2 id="pageName"><tiles:getAsString name="pageHeadline"/></h2>
			<tiles:insert attribute="mainContent"/>
		</div>
		<div id="navBar">
			<tiles:getAsString name="leftMenu"/>
			<tiles:getAsString name="systemMenu"/>
		</div>
	</body>
</html>