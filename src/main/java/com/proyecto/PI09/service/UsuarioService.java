package com.proyecto.PI09.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.proyecto.PI09.model.Rol;
import com.proyecto.PI09.model.Usuario;
import com.proyecto.PI09.repository.RolRepository;
import com.proyecto.PI09.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private RolRepository rolRepository;

	public Optional<Usuario> buscarPorCorreo(String correo) {
		return usuarioRepository.findByCorreo(correo);
	}

	public Usuario guardar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario validarLogin(String correo, String password) {
		return usuarioRepository.findByCorreo(correo).filter(u -> Boolean.TRUE.equals(u.getEstado()))
				.filter(u -> encoder.matches(password, u.getPassword())).orElse(null);
	}

	public String registrarUsuario(String nombre, String apellido, String correo, String password) {
		if (correo == null || !correo.endsWith("@cibertec.edu.pe")) {
			return "CORREO_INVALIDO";
		}

		if (usuarioRepository.findByCorreo(correo).isPresent()) {
			return "CORREO_EXISTENTE";
		}

		Optional<Rol> rolOpt = rolRepository.findByNombreRol("USUARIO");
		if (rolOpt.isEmpty()) {
			return "ROL_NO_EXISTE";
		}

		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setCorreo(correo);
		usuario.setPassword(encoder.encode(password));
		usuario.setRol(rolOpt.get());
		usuario.setEstado(true);

		usuarioRepository.save(usuario);
		return "OK";
	}
}