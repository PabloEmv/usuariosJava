package com.proyectousuarios.usuarios.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.proyectousuarios.usuarios.models.Administrador;
import com.proyectousuarios.usuarios.models.Alumno;

class AlumnoTest {
    
    @Test
    void testAdmin() {
        Administrador admin2 = new Administrador();
        assertEquals(false, admin2.verificarCambios());
    }
    @Test
    void testAlumno() {
        Alumno alumno = new Alumno();
        alumno.setNombre("warisapo");
        assertEquals("Si es tu nombre", alumno.nombreAlumno());
    }
}
