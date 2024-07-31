<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html locale="true">
	<head>
    	<title>Test</title>
		<html:base/>
	</head>
	<body bgcolor="white">
		<html:form action="/test">
			<table>
				<tr>
					<td align="right">
						<b>Name</b>
					</td>
					<td align="left">
						<html:text property="name" size="30" maxlength="30"/>
					</td>
					<td align="left">
						<font color="red">
							<html:errors property="name" header="empty"/>
						</font>
						&nbsp;
					</td>
				</tr>
				<tr>
					<td align="right">
						<b>Address</b>
					</td>
					<td align="left">
						<html:text property="address" size="30" maxlength="30"/>
					</td>
					<td align="left">
						<font color="red">
							<html:errors property="address" header="empty"/>
						</font>
						&nbsp;
					</td>
				</tr>
				<tr>
					<td align="right">
						<b>E-mail address</b>
					</td>
					<td align="left">
						<html:text property="emailAddress" size="30" maxlength="30"/>
					</td>
					<td align="left">
						<font color="red">
							<html:errors property="emailaddress" header="empty"/>
						</font>
						&nbsp;
					</td>
				</tr>
				<tr>
					<td align="right">
						<html:submit>Save</html:submit>
					</td>
					<td align="left">
						<html:cancel>Cancel</html:cancel>
					</td>
				</tr>
			</table>
		</html:form>
	</body>
</html:html>