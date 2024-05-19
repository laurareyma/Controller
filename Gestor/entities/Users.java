package Gestor.entities;

public class Users {

    // Atributos
    private String IdUsuario;
    private String name;
    private String surname;
    private String password;
    private String NivelUsuario;

    public Users(String IdUsuario, String name, String surname, String password, String NivelUsuario) {
        this.IdUsuario = IdUsuario;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.NivelUsuario = NivelUsuario;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNivelUsuario() {
        return NivelUsuario;
    }

    public void setNivelUsuario(String NivelUsuario) {
        this.NivelUsuario = NivelUsuario;
    }

    @Override
    public String toString() {
        return "User{" + "IdUsuario=" + IdUsuario + ", name=" + name + ", surname=" + surname + ", password=" + password + ", NivelUsuario=" + NivelUsuario + '}';
    }
}