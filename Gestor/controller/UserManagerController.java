package Gestor.controller;

import Gestor.repositories.DBUsers;
import java.util.ArrayList;
import Gestor.entities.Users;

public class UserManagerController{
    private ArrayList<Users> User;

    //Añadir usuario
    public void addUser(Users user){
        this.Users.add(user);
    }

    //Eliminar usuario
    public void deleteUser(int index){
        this.Users.remove(index);
    }

    //Actualizar usuario
    public void updateUser(int index, Users user){
        this.Users.set(index, user);
    }

    //Obtener el total de usuarios
    public int totalUser(){
        return this.Users.size();
    }

    //Obtener un usuario
    public Users getUser(int index){
        return this.Users.get(index);
    }

    //Cargar usuarios
    public void chargeUser(){
        DBUsers db = new DBUsers();
        this.Users = db.getDataUsers();
    }

    //Imprimir usuarios
    public void printDataUsers(){
        for (Users p: this.Users){
            System.out.println("------------------------");
            System.out.println("IdUsuario: " + p.getIdUsuario()+ "\nNombre: " +
             p.getName() + "\nApellido: " + p.getSurname() + "\nContraseña: " + p.getPassword()+
             "\nNivel de usuario: " + p.getNivelUsuario());
        }
    }
    
    //Insertar usuario
    public boolean insertUser(Users p){
        DBUsers db = new DBUsers();
        return db.addUser(p);
    }
}