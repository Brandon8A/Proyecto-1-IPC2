<%-- 
    Document   : index
    Created on : 14 sept 2024, 19:19:00
    Author     : brandon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <jsp:include page="/includes/resources.jsp"/>
    </head>
    <body>
        <main>
            <section class="section">
                <div class="container">
                    <h1>Iniciar Sesion</h1>
                    <form action="${pageContext.servletContext.contextPath}/ControladorIniciarSesion" method="Post">
                        <div class="form-group">
                            <label for="usuario">Usuario:</label><%--Creando label con texto: Usuario--%>
                            <input id="usuario" name="usuario" class="form-control" placeholder="Ingrese usuario"/>
                        </div>
                        <div class="form-group">
                            <label for="contraseña">Contraseña:</label>
                            <input id="contraseña" name="contraseña" class="form-control" placeholder="Ingrese la contraseña"/>
                        </div>
                        <div class="form-group">
                            <label for="tipoUsuario">Usuario:</label>
                            <select id="tipoUsuario" name="tipoUsuario" class="form-control">
                                <option value="Administrador">Administrador</option>
                                <option value="Autor">Autor</option>
                                <option value="Suscriptor">Suscriptor</option>
                                <option value="Especial">Usuario Especial</option>
                            </select>
                        </div>
                        <br>
                        <button type="submit">Iniciar Sesion</button>
                        <br>
                        <a href="crear-usuario.jsp">Crear Usuario</a>
                    </form>
                </div>
            </section>
        </main>
        <jsp:include page="/includes/footer.jsp"/>
    </body>
</html>