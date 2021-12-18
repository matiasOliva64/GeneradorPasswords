package Main;

import javax.swing.*;

public class GeneratedPassword {

    static String generaPassword() {
        char[] numeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] simbols = {'!', '#', '$', '%', '&', '?', '¡', '¿'};

        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        caracteres.append(simbols);

        StringBuilder password = new StringBuilder();

        try {
            int lenghtPassword = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de caracteres", JOptionPane.CANCEL_OPTION));

            if (lenghtPassword != 0) {
                for (int i = 1; i <= lenghtPassword; i++) {
                    int cantidadCaracteres = caracteres.length();
                    int numeroRandom = (int) (Math.random() * cantidadCaracteres);
                    password.append((caracteres.toString().charAt(numeroRandom)));

                }
            }

            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "!ERROR¡ el valor ingresado es invalido \nGracias por utilizar el programa");
                System.exit(0);
            }

        return password.toString();
    }
}





