<%--
  Created by IntelliJ IDEA.
  User: gzeg
  Date: 06.05.12
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Login</title></head>

<body>
<div class="body">
    <g:form method="post">
        <div class="dialog">
            <p>Enter your login details below:</p>
            <table class="userForm">
                <tr class='prop'>
                    <td valign='top' style='text-align:left;' width='20%'>
                        <label for='email'>Login:</label>
                    </td>
                    <td valign='top' style='text-align:left;' width='80%'>
                        <input id="email" type='text' name='login' value='${user?.login}'/>
                    </td>
                </tr>
                <tr class='prop'>
                    <td valign='top' style='text-align:left;' width='20%'>
                        <label for='password'>Password:</label>
                    </td>
                    <td valign='top' style='text-align:left;' width='80%'>
                        <input id="password" type='password' name='password'
                               value='${user?.password}'/>
                    </td>
                </tr>
            </table>
        </div>

        <div class="buttons">
            <g:actionSubmit value="Login" action="doLogin"/>

            <g:actionSubmit value="Register" action="create"/>
        </div>
    </g:form>
</div>
</body>

</html>