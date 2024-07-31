<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!-- start top menu -->
<div id="masthead">
	<h1 id="siteName"><bean:message bundle="vgsoftware" key="system.siteName"/></h1>
	<div id="globalNav">
		<c:forEach var="item" items="${menuItems}" varStatus="status">
			<a href="<c:out value="${item.url}"/>"><c:out value="${item.name}"/></a>
			<c:if test="${status.last==false}">
				&nbsp;|&nbsp;
			</c:if>
		</c:forEach>
	</div>
</div>
<!-- end top menu -->