package Gestor;
import Gestor.controller.UserManagerController;
import Gestor.entities.Users;


public class Main {
    
    //Gestor de usuarios
    public static void main(String[] args) {
        //Instanciar el controlador de usuarios
        UserManagerController controller = new UserManagerController();
        
        //Cargar usuarios
        controller.chargeUser();
        
        //Imprimir usuarios
        controller.printDataUsers();
        
        //Insertar usuario
        Users user = new Users("1", "Juan", "Perez", "1234", "Administrador");
        controller.insertUser(user);
        
        //Imprimir usuarios
        controller.printDataUsers();
    }

    
}
