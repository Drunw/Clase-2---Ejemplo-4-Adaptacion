package Processor;

import Modelo.Usuario;

import java.util.Map;

public class UsuarioAdapter {

    public Usuario adaptar(Map<String, Object> externo) {
        Usuario usuario = new Usuario();

        // Nombre: intenta varias claves posibles
        if (externo.containsKey("full_name")) {
            usuario.setNombre((String) externo.get("full_name"));
        } else if (externo.containsKey("fullname")) {
            usuario.setNombre((String) externo.get("fullname"));
        } else if (externo.containsKey("nombre_completo")) {
            usuario.setNombre((String) externo.get("nombre_completo"));
        }

        // Edad: intenta varias claves también
        if (externo.containsKey("years")) {
            usuario.setEdad((int) externo.get("years"));
        } else if (externo.containsKey("age")) {
            usuario.setEdad((int) externo.get("age"));
        } else if (externo.containsKey("edad")) {
            usuario.setEdad((int) externo.get("edad"));
        }

        return usuario;
    }
}
