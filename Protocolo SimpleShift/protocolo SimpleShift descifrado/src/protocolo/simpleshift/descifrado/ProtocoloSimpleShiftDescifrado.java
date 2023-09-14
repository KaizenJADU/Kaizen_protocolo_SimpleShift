package protocolo.simpleshift.descifrado;
import java.util.Scanner;
public class ProtocoloSimpleShiftDescifrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el mensaje que quiere descifrar: ");
        String mensajeCifrado = sc.nextLine();
        sc.close();

        String mensajeDescifrado = descifrar(mensajeCifrado);
        System.out.println("Este es el mensaje descifrado: " + mensajeDescifrado);
    }

    public static String descifrar(String mensajeCifrado) {
        StringBuilder mensajeDescifrado = new StringBuilder();
        for (int i = 0; i < mensajeCifrado.length(); i++) {
            char c = mensajeCifrado.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char letraDescifrada = (char) (base + ('Z' - Character.toUpperCase(c)));
                mensajeDescifrado.append(letraDescifrada);
            } else {
                mensajeDescifrado.append(c);
            }
        }
        return mensajeDescifrado.toString();
    }
}
