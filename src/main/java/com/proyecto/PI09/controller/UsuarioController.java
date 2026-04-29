package com.proyecto.PI09.controller;

import com.proyecto.PI09.model.Usuario;
import com.proyecto.PI09.service.UsuarioService;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String inicio() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String acceder(@RequestParam String correo,
                          @RequestParam String password,
                          HttpSession session) {

        Usuario user = usuarioService.validarLogin(correo, password);

        if (user != null) {
            session.setAttribute("usuarioLogueado", user);

            if ("ADMIN".equalsIgnoreCase(user.getRol().getNombreRol())) {
                return "redirect:/admin/dashboard";
            } else {
                return "redirect:/simulacion";
            }
        }

        return "redirect:/login?error";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

    @PostMapping("/registro")
    public String guardarRegistro(@RequestParam String nombre,
                                  @RequestParam String apellido,
                                  @RequestParam String correo,
                                  @RequestParam String password) {

        String resultado = usuarioService.registrarUsuario(nombre, apellido, correo, password);

        if ("CORREO_INVALIDO".equals(resultado)) {
            return "redirect:/registro?errorCorreo";
        }

        if ("CORREO_EXISTENTE".equals(resultado)) {
            return "redirect:/registro?correoExiste";
        }

        if ("ROL_NO_EXISTE".equals(resultado)) {
            return "redirect:/registro?errorRol";
        }

        return "redirect:/login?registroExitoso";
    }

    @GetMapping("/logout")
    public String salir(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}