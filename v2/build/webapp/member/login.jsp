<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>VG Software - Login</title>
        <base href="<bean:message key="baseurl" />" />
        <link rel="stylesheet" href="<bean:message key="basestyle" />" type="text/css" />
    </head>
    <body>
		<jsp:include page="include/content/header.html" />
        <div id="content">
			<h2 id="pageName">Site News</h2>
			<c:forEach var="newsItem" items="${news}">
				<div class="story">
					<h3><c:out value="${newsItem.title}"/></h3>
					<p><c:out value="${newsItem.content}" escapeXml="false" /></p>
					<p>
						Posted By: <a href="?member_id=<c:out value="${newsItem.authorId}"/>"><c:out value="${newsItem.authorName}"/></a> - <c:out value="${newsItem.niceDate}"/>
						<c:if test="${newsItem.commentsEnabled==true}">
							&nbsp;|&nbsp;&nbsp;<a href="/news/read.do?newsId=<c:out value="${newsItem.id}"/>"><c:out value="${newsItem.comments}" /> comment(s)</a>
						</c:if>
					</p>
				</div>
			</c:forEach>
		</div>
		<div id="navBar">
			<jsp:include page="include/content/menu/vgsoftware.html" />
			<jsp:include page="include/content/menu/member.html" />
        </div>
    </body>
</html>