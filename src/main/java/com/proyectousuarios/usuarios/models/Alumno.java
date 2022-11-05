package com.proyectousuarios.usuarios.models;

import java.io.Console;

public class Alumno extends Usuario{
    Console console = System.console();
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

    public String nombreAlumno() {
        String nombreA = console.readLine("nombre");
        try {
            if (this.nombre == nombreA) {
                return "Si es tu nombre";
            } else {
                return "No es tu nombre";
            }
        } catch (Exception e) {
            return "aaaaaaaaa";
        }
        
    }
    @Override
    public String toString() {
        return "Alumno " + super.toString();
    }
    
}
