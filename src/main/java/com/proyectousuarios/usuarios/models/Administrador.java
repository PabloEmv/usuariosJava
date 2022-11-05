package com.proyectousuarios.usuarios.models;

public class Administrador extends Editor{
    String modo;
    Boolean booleanoxd;

    
    public Administrador() {
        super();
    }
    
    public Administrador(String nombre, String correo, String contrasenha, Integer edad, Character sexo, Integer id,
            String modo, Boolean booleanoxd) {
        super(nombre, correo, contrasenha, edad, sexo, id);
        this.modo = modo;
        this.booleanoxd = booleanoxd;
    }
    
    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public Boolean getBooleanoxd() {
        return booleanoxd;
    }

    public void setBooleanoxd(Boolean booleanoxd) {
        this.booleanoxd = booleanoxd;
    }

    public void administrarUsuario() {
        System.out.println("administrar usuario");
    }
    public Boolean verificarCambios() {
        
        try {
            if(this.booleanoxd == true) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
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
