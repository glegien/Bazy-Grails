<%--
  Created by IntelliJ IDEA.
  User: gzeg
  Date: 31.05.12
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="bazy.grails.Family" contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Choose/create family</title></head>

<body>
<g:form method="post">
    <g:select name="families" from="${Family.list()}" optionKey="familyId" optionValue="familyId"/>
    <input id="familyPasswd" type='text' name='familyPasswd'/>

    <div class="buttons">
        <g:actionSubmit value="Choose" controller="family" action="choose"/>
        <g:actionSubmit value="Create" controller="family" action="create"/>
    </div>
</g:form>
</body>
</html>