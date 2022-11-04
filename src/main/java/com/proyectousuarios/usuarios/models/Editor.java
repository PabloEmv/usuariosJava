package com.proyectousuarios.usuarios.models;

public class Editor extends Usuario{

    public Editor() {
        super();
    }
    public Editor(String nombre, String correo, String contrasenha, Integer edad, Character sexo, Integer id) {
        super(nombre, correo, contrasenha, edad, sexo, id);
    }
    
    public void editarWebVisual() {
        System.out.println("editar web");
    }
    public void editarPrueba() {
        System.out.println("editar prueba");
    }
    public void accederTodasLasClases() {
        System.out.println("accender a clases");
    }
    @Override
    public String toString() {
        return "Editor []" + super.toString();
    }
    
}
