<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insert template="/WEB-INF/tiles/base/defaultframework.jsp">
	<tiles:put name="title"  value="VG Software - TEST" />
	<tiles:put name="headline" value="TEST HEADLINE" />

	<c:forEach var="newsItem" items="${news}">
		<tiles:insert template="/WEB-INF/tiles/base/contentarea.jsp">
			<tiles:put name="title" type="string">
				<c:out value="${newsItem.title}"/>
			</tiles:put>
			<tiles:put name="content" type="string">
				<p><c:out value="${newsItem.content}" escapeXml="false" /></p>
				<p>
					Posted By: <a href="?member_id=<c:out value="${newsItem.authorId}"/>"><c:out value="${newsItem.authorName}"/></a> - <c:out value="${newsItem.niceDate}"/>
					<c:if test="${newsItem.commentsEnabled==true}">
						&nbsp;|&nbsp;&nbsp;<a href="/news/read.do?newsId=<c:out value="${newsItem.id}"/>"><c:out value="${newsItem.comments}" /> comment(s)</a>
					</c:if>
				</p>			
			</tiles:put>
		</tiles:insert>
	</c:forEach>
</tiles:insert>
