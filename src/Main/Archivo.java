package Main;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static Main.GeneratedPassword.generaPassword;

public class Archivo {

    public void CrearArchivo() {

        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("passwords.txt");


        String uso = JOptionPane.showInputDialog(null,"Para que desea usar la contraseña? " +
                "\n!Si no decea agregar el uso simplemente deje vacio" +
                "\n y precione OK¡","Bienvenido a GenPass",JOptionPane.OK_CANCEL_OPTION);
        try{
            if(uso == null){
                JOptionPane.showMessageDialog(null, "!ERROR¡ el valor ingresado es invalido \nGracias por utilizar el programa");
                System.exit(0);
            }else{


            }
        }catch(NumberFormatException e){


        }
        if(uso != null){
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo);
                    linea = new PrintWriter(escribir);
                    linea.println("Password: " + generaPassword() + " Uso: " + uso);
                    linea.close();
                    escribir.close();
                } catch (IOException e) {
                    System.err.println("No se a podido crear el archivo");
                }
            } else {
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    linea.println("Password: " + generaPassword() + " Uso: " + uso);
                    linea.close();
                    escribir.close();
                } catch (IOException e) {
                    System.err.println("No se a podido crear el archivo");
                }
            }

        }else{
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo);
                    linea = new PrintWriter(escribir);
                    linea.println("Password: " + generaPassword() + " Uso: ");
                    linea.close();
                    escribir.close();
                } catch (IOException e) {
                    System.err.println("No se a podido crear el archivo");
                }
            } else {
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    linea.println("Password: " + generaPassword() + " Uso: ");
                    linea.close();
                    escribir.close();
                } catch (IOException e) {
                    System.err.println("No se a podido crear el archivo");
                }
            }
        }
        JOptionPane.showMessageDialog(null, "!La contraseña se gernero con exito¡ " +
                "\n!!Ver passwords.txt¡¡\nGracias por utilizar el programa");






    }
}
