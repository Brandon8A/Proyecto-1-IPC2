<%-- 
    Document   : crear-usuario
    Created on : 15 sept 2024, 3:21:59
    Author     : brandon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Usuario</title>
        <jsp:include page="/includes/resources.jsp"/>
    </head>
    <body>
        <main>
            <section class="section">
                <div class="container">
                    <form action="${pageContext.servletContext.contextPath}/ControladorRegistrarUsuario" method="Post">
                        <h1>Crear Perfil de Usuario</h1>
                        <div class="form-group">
                            <label for="usuario">Usuario:</label><%--Creando label con texto: Usuario--%>
                            <input id="usuario" name="usuario" class="form-control" placeholder="Ingrese usuario"/>
                        </div>
                        <div class="form-group">
                            <label for="contraseña">Contraseña:</label>
                            <input type="password" id="contraseña" name="contraseña" class="form-control" placeholder="Ingrese la contraseña"/>
                        </div>
                        <div class="form-group">
                            <label for="hobbies">Ingrese sus hobbies separados por una coma:</label><%--Creando label con texto: Usuario--%>
                            <input id="hobbies" name="hobbies" class="form-control" placeholder="Hobbies"/>
                        </div>
                        <div class="form-group">
                            <label for="temasInteres">Ingrese sus temas de interes separados por una coma:</label><%--Creando label con texto: Usuario--%>
                            <input id="temasInteres" name="temasInteres" class="form-control" placeholder="Temas de Interes"/>
                        </div>
                        <div class="form-group">
                            <label for="gustos">Ingrese sus gustos separados por una coma</label><%--Creando label con texto: Usuario--%>
                            <input id="gustos" name="gustos" class="form-control" placeholder="Gustos"/>
                        </div>
                        <div class="form-group">
                            <label for="descripcion">Ingrese una pequeña descripcion</label><%--Creando label con texto: Usuario--%>
                            <input id="descripcion" name="descripcion" class="form-control" placeholder="Descripcion"/>
                        </div>
                        <div class="form-group">
                            <label for="tipoUsuario">Tipo de Usuario</label>
                            <select id="tipoUsuario" name="tipoUsuario" class="form-control">
                                <option value="Administrador">ADMINISTRADOR</option>
                                <option value="Autor">AUTOR</option>
                                <option value="Suscriptor">SUSCRIPTOR</option>
                                <option value="Especial">ESPECIAL</option>
                            </select>
                        </div>
                        <br>
                        <button type="submit">Registrar Usuario</button>
                        <br>
                    </form>
                </div>
            </section>
        </main>
    </body>
</html>
