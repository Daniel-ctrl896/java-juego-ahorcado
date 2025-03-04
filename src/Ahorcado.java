import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "murcielago";
        int vidas = 5;
        boolean adivino = false;

        char[] palabraGuiones = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraGuiones.length; i++) {
            palabraGuiones[i] = '_';
        }
        while (adivino == false && vidas > 0) {
            System.out.println("Palabra a advinar: ");
            System.out.println(String.valueOf(palabraGuiones) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Ingrese una letra: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraGuiones[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (letraCorrecta == false) {
                vidas--;
                System.out.println("Te quedan " + vidas + " vidas");
            }
            System.out.println(palabraGuiones);
            if (String.valueOf(palabraGuiones).equals(palabraSecreta)) {
                adivino = true;
            }
            
        }
        if (adivino == true) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
            
        }

    }
}
