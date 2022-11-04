package com.proyectousuarios.usuarios.models;

public class Alumno extends Usuario{

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String correo, String contrasenha, Integer edad, Character sexo, Integer id) {
        super(nombre, correo, contrasenha, edad, sexo, id);
    }
    
    public void verClasesDesbloqueadas() {
        System.out.println("ver las clases");
    }
    public void verAvance() {
        System.out.println("ver el avance");
    }
    public void realizarPruebas() {
        System.out.println("hacer prueba");
    }
    public void verResultadosEvaluaciones() {
        System.out.println("ver resultados");
    }

    @Override
    public String toString() {
        return "Alumno " + super.toString();
    }
    
}
