<%-- 
    Document   : login
    Created on : Jun 2, 2018, 3:34:14 PM
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>[FON] Prijava</title>
        <jsp:include page="WEB-INF/include.jsp" />
    </head>
    <body>

        <div class = "container">
            <h1>Prijavite se na sistem</h1>
            <form action="/action/login" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Korisničko ime:</td>
                            <td><input class = "form-control" type="text" name="username" value="" size="80" /></td>
                        </tr>
                        <tr>
                            <td>
                                <br>
                                Korisnička šifra:
                            </td>
                            <td>
                                <br>
                                <input class = "form-control" type="password" name="password" value="" size="40" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <br>
                                <input class = "btn btn-primary" type="submit" value="Prijavi se na sistem" />
                            </td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>

            </form>
            <div>
                </body>
                </html>

