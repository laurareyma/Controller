package Gestor.persistence;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class FileManager {
    
    private String fileName;
    public FileManager(String fileName){
        this.fileName = fileName;
    }
    public static void createFile(String nameFile){
        File file = new File(nameFile);

        try {
            PrintWriter output = new PrintWriter(file);
            output.close();
            System.out.println("El archivo fue creado con exito");
        } catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }

    public static void writeFile(String nameFile, String content){
        File file = new File(nameFile);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, true));
            output.println(content);
            output.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void readFile(String nameFile){
        File file = new File(nameFile);
        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            while (line != null){
                System.out.println(line);
                line = input.readLine();
            }
            System.out.println("El archivo fue leido con exito");
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void deleteFile(String nameFile){
        File file = new File(nameFile);
        if (file.exists()){
            file.delete();
            System.out.println("El archivo fue eliminado con exito");
        }else{
            System.out.println("¡El archivo no fue encontrado!");
        }
    }

    public static void updateFile(String nameFile, String content){
        File file = new File(nameFile);
        if (file.exists()){
            file.delete();
            try {
                PrintWriter output = new PrintWriter(file);
                output.println(content);
                output.close();
            }catch (FileNotFoundException ex){
                ex.printStackTrace(System.out);
            }
            System.out.println("El archivo fue actualizado con exito");
        }else{
            System.out.println("¡El archivo no fue encontrado!");
        }
    }
    public ArrayList<String> getDataOfFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataOfFile'");
    }
    public boolean insertDataInFile(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertDataInFile'");
    } 
}

