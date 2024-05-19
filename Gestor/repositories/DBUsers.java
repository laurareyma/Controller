package Gestor.repositories;
import Gestor.entities.Users;
import Gestor.persistence.FileManager;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DBUsers {
    public ArrayList<Users> getDataUsers(){
        ArrayList<Users> Users = null;
        
        FileManager fileManager = new FileManager("Usuarios.csv");
        ArrayList<String> lines = fileManager.getDataOfFile();
        if (lines != null){
            Users = new ArrayList<>();
            for (String line : lines) {
                StringTokenizer tokens = new StringTokenizer(line, ";");
                String IdUsuario = tokens.nextToken();
                String name = tokens.nextToken();
                String surname = tokens.nextToken();
                String password = tokens.nextToken();
        class FileManager {
            private String filePath;

            public FileManager(String filePath) {
                this.filePath = filePath;
            }

            public ArrayList<String> getDataOfFile() {
                ArrayList<String> lines = new ArrayList<>();
                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        lines.add(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return lines;
            }

            // Other methods...

        }
                String NivelUsuario = tokens.nextToken();
                Users.add(new Users(IdUsuario, name, surname, password, NivelUsuario)); 
            }
        }
        return Users;
    }

    public boolean addUser(Users p){
        FileManager fileManager = new FileManager("Usuarios.csv");
        return fileManager.insertDataInFile(
                p.getIdUsuario() + ";" + p.getName() + ";" + p.getSurname() + ";" + p.getPassword() + ";" + p.getNivelUsuario()
        );
    }
}
