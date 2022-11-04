package com.proyectousuarios.usuarios.models;

public class Usuario {
    String nombre;
    String correo;
    String contrasenha;
    Integer edad;
    Character sexo;
    Integer id;
    
    public Usuario() {
    }

    public Usuario(String nombre, String correo, String contrasenha, Integer edad, Character sexo, Integer id) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenha = contrasenha;
        this.edad = edad;
        this.sexo = sexo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void crearUsuario() {
        System.out.println("registrar datos");
    }
    public void iniciarSesion() {
        System.out.println("inicio sesion");
    }
    public void cerrarSesion() {
        System.out.println("cierro sesion");
    }
    public void visualizarPagina() {
        System.out.println("mostrar pagina");
    }
    public void editarDatosPersonales() {
        System.out.println("editar datos personales");
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", correo=" + correo + ", contrasenha=" + contrasenha + ", edad=" + edad
                + ", sexo=" + sexo + ", id=" + id + "]";
    }
    
    
}
