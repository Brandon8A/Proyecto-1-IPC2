/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.usuarios;

/**
 *
 * @author brandon
 */
public class Usuario {
    
    private String usuario;
    private String contraseña;
    private String hobbies;
    private String pathFoto;
    private String temasInteres;
    private String gustos;
    private String descripcion;
    private TipoUsuario tipo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }

    public String getTemasInteres() {
        return temasInteres;
    }

    public void setTemasInteres(String temasInteres) {
        this.temasInteres = temasInteres;
    }

    public String getGustos() {
        return gustos;
    }

    public void setGustos(String gustos) {
        this.gustos = gustos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
    public boolean datosValidos(){
        return usuario != null && contraseña != null&& hobbies != null && temasInteres != null&& gustos != null&& descripcion != null;
    }
}
