/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.database;

import backend.usuarios.TipoUsuario;
import backend.usuarios.Usuario;
import exceptions.ExceptionRevistasWeb;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import java.time.format.DateTimeParseException;

/**
 *
 * @author brandon
 */
public class CreadorUsuarios {

    ConexionDB conexionDB = new ConexionDB();

    public Usuario crearUsuario(HttpServletRequest request) throws ExceptionRevistasWeb {
        Usuario nuevoUsuario = extraerYValidarUsuario(request);
        if (conexionDB.existeUsuario(TipoUsuario.valueOf(request.getParameter("tipoUsuario")), request.getParameter("usuario"))) {
            throw new ExceptionRevistasWeb("El usuario ya existe.");
        }
        conexionDB.almacenarUsuario(nuevoUsuario);
        return nuevoUsuario;
    }

    private Usuario extraerYValidarUsuario(HttpServletRequest request) throws ExceptionRevistasWeb {
        Usuario nuevoUsuario = new Usuario();
        try {
            nuevoUsuario.setUsuario(request.getParameter("usuario"));
            nuevoUsuario.setContraseña(request.getParameter("contraseña"));
            nuevoUsuario.setHobbies(request.getParameter("hobbies"));
            nuevoUsuario.setTemasInteres(request.getParameter("temasInteres"));
            nuevoUsuario.setGustos(request.getParameter("gustos"));
            nuevoUsuario.setDescripcion(request.getParameter("descripcion"));
            nuevoUsuario.setTipo(TipoUsuario.valueOf(request.getParameter("tipoUsuario")));
            nuevoUsuario.setPathFoto("s");
        } catch (DateTimeParseException | IllegalArgumentException | NullPointerException e) {
            throw new ExceptionRevistasWeb("Error en los datos Ingresados...");
        }
        if (nuevoUsuario.datosValidos()) {
            return nuevoUsuario;
        }
        throw new ExceptionRevistasWeb("Error en los datos enviados.");
    }
}
