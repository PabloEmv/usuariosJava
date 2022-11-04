package com.proyectousuarios.usuarios.models;

public class Administrador extends Editor{
    String modo;

    public Administrador() {
        super();
    }
    public Administrador(String nombre, String correo, String contrasenha, Integer edad, Character sexo, Integer id,
            String modo) {
        super(nombre, correo, contrasenha, edad, sexo, id);
        this.modo = modo;
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        this.modo = modo;
    }
    public void administrarUsuario() {
        System.out.println("administrar usuario");
    }
    public void verificarCambios() {
        System.out.println("verificar cambios");
    }
    public void crearPruebas() {
        System.out.println("crear prueba");
    }
    public void editarBackend() {
        System.out.println("editar backend");
    }
    @Override
    public String toString() {
        return "Administrador [modo=" + modo + "]" + super.toString();
    }

    
}
