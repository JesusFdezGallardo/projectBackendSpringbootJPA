package com.proyectoJesus.springboot.models.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import com.proyectoJesus.springboot.models.entity.Rol;
import com.proyectoJesus.springboot.models.entity.Usuario;

/*
 * Incluye los métodos del CRUD
 */
public interface IUsuarioService {

	//Mostrar todos los usuarios
	public List<Usuario> findAll();
	public List<Usuario> findByNombre(String nombre);
//	public List<Usuario> findByNombreContainingIgnoreCase(String usuario);

	//Buscar usuario por Id
	public Usuario finById(Long id);
	
	//Metodos CRUD
	public Usuario save(Usuario usuario);
	public void delete (Long id);
	
	//Rol
	public List<Rol> findAllRoles();
	public List<Usuario> findByRolAlumno();
	public List<Usuario> findByRolProfesor();
	
	//Buscar por nombre de usuario
	public Usuario findByUsuario(String usuario);
	
	//Busqueda filtrar nombre alumnos
	public List<Usuario> findAlumnos(String consulta);
}
