package Gestor;
import Gestor.controller.UserManagerController;
import Gestor.entities.Users;   
import Gestor.repositories.DBUsers;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Validacion {
    // gestor de validaciones de usuarios

    public static boolean validarIdUsuario(String idUsuario) {
        // validar usuario
        // cuando el  es igual a la de la base de datos
        // se entra al sistema, de lo contrario se muestra un mensaje de error
        // y se vuelve a pedir la contraseña

        return idUsuario.length() > 0;

    }

    public static boolean validarContrasena(String contrasena) {
        // validar contraseña

        


        return contrasena.length() > 0;
    }

   
}
