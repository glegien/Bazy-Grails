<%--
  Created by IntelliJ IDEA.
  User: gzeg
  Date: 07.05.12
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Create user</title></head>

<body>
<div class="body">
    <g:form method="post" action="createUser">
        <div class="dialog">
            <p>Enter your personal details below:</p>
            <table class="userForm">
                <g:hasErrors>
                    <div class="errors">
                        <g:renderErrors bean="${user}" as="list"/>
                    </div>
                </g:hasErrors>

                <tr class='prop'>
                    <td valign='top' style='text-align:left;' width='20%'>
                        <label for='login'>Login:</label>
                    </td>
                    <td valign='top' style='text-align:left;' width='80%'>
                        <input id="login" type='text' name='login' value='${user?.login}'/>
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
                <tr class='prop'>
                    <td valign='top' style='text-align:left;' width='20%'>
                        <label for='passwordRepeat'>Retype password:</label>
                    </td>
                    <td valign='top' style='text-align:left;' width='80%'>
                        <input id="passwordRepeat" type='password' name='passwordRepeat'
                               value='${retypePassword}'/>
                    </td>
                </tr>
                <tr class='prop'>
                    <td valign='top' style='text-align:left;' width='20%'>
                        <label for='name'>Name:</label>
                    </td>
                    <td valign='top' style='text-align:left;' width='80%'>
                        <input id="name" type='text' name='namely'
                               value='${user?.name}'/>
                    </td>
                </tr>
                <tr class='prop'>
                    <td valign='top' style='text-align:left;' width='20%'>
                        <label for='surname'>Surname:</label>
                    </td>
                    <td valign='top' style='text-align:left;' width='80%'>
                        <input id="surname" type='text' name='surname'
                               value='${user?.surname}'/>
                    </td>
                </tr>
                <tr class='prop'>
                    <td valign='top' style='text-align:left;' width='20%'>
                        <label for='email'>Email:</label>
                    </td>
                    <td valign='top' style='text-align:left;' width='80%'>
                        <input id="email" type='text' name='email'
                               value='${user?.email}'/>
                    </td>
                </tr>

            </table>
        </div>

        <div class="buttons">
            <g:actionSubmit value="Create" action="createUser"/>

            <g:actionSubmit value="Cancel" action="login"/>
        </div>
    </g:form>
</div>

</body>
</html>