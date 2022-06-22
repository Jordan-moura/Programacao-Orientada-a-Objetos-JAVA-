package lista04.exercicio06;

import java.util.*;
import java.lang.*;

/**D
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Exercicio06 {

    public static void main(String[] args) {

        //Password informada pela linha de comando, ao invés
        // de ser digitada pelo usuário
        String password = "ABcd123";

        //Se codec = 0, programa codifica senha
        // Se codec = 1, programa decodifica senha
        int codec = 0;

        //
        if (codec == 0) {
            System.out.println("Password: " + password);
            mod1Code(password);
        } else if (codec == 1) {
            System.out.println("Code password: " + password);
            mod1Decode(password);
        }
    }

    private static String mod1Code(String password) {

        char[] charArray1 = password.toCharArray();
        char[] charArray2 = new char[password.length()];

        for (int i = 0; i < charArray1.length; i++) {
            charArray1[i] = (char) (charArray1[i] - 1);
            charArray2[i] = (char) (i * i + 40);
        }

        String password21 = new String(charArray1);
        String password22 = new String(charArray2);
        String password2 = password21 + password22;
        mod2Code(password2);
        return password2;
    }

    private static String mod2Code(String password2) {
        String password3 = new StringBuilder(password2).reverse().toString();
        mod3Code(password3);
        return password3;

    }

    private static void mod3Code(String password3) {
        char[] charArray = password3.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] >= 65 && charArray[i] < 91) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else if (charArray[i] >= 97 && charArray[i] < 124) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        String password4 = new String(charArray);
        System.out.println("Code password: " + password4);
    }

    private static String mod1Decode(String password) {
        char[] charArray = password.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] >= 65 && charArray[i] < 91) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else if (charArray[i] >= 97 && charArray[i] < 124) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        String password2 = new String(charArray);
        mod2Decode(password2);
        return password2;
    }

    private static String mod2Decode(String password2) {

        String password3 = new StringBuilder(password2).reverse().toString();
        mod3Decode(password3);
        return password3;
    }

    private static void mod3Decode(String password3) {
        int n = password3.length() / 2;
        String passwordAux = password3.substring(0, n);

        char[] charArray = passwordAux.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + 1);
        }

        String password4 = new String(charArray);
        System.out.println("Decode password: " + password4);

    }
}
