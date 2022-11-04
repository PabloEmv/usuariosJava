package com.proyectousuarios.usuarios;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectousuarios.usuarios.models.Administrador;
import com.proyectousuarios.usuarios.models.Alumno;
import com.proyectousuarios.usuarios.models.Editor;

@SpringBootApplication
public class UsuariosApplication {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno();
		System.out.println(alumno1);

		Alumno alumno2 = new Alumno("pedro", "pedrito@xd.com", "warisapo", 22, 'M', 01);
		System.out.println(alumno2);

		Administrador admin1 = new Administrador("Faker","faker.t1@gmail.com","essecreto", 26, 'M', 02,"dios");
		System.out.println(admin1);

		Administrador admin2 = new Administrador("Nelson","nejobac@gmail.com","elmasrapidodeloeste", 27, 'M', 03,"dios");
		System.out.println(admin2);

		Editor editor1 = new Editor("Mari", "mipzoa@gmail.com", "felicessomos", 28, 'F', 04);
		System.out.println(editor1);

		alumno1.crearUsuario();
		alumno2.cerrarSesion();
		admin1.administrarUsuario();
		admin2.crearPruebas();
		editor1.editarWebVisual();
	}
}
