package protocolo.simpleshift.cifrado;
import java.util.Scanner;

public class ProtocoloSimpleShiftCifrado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el mensaje que quiere cifrar: ");
        String mensajeOriginal = sc.nextLine();
        sc.close();
        
        String mensajeCifrado = cifrar(mensajeOriginal);
        System.out.println("Este es el Mensaje Cifrado: " + mensajeCifrado);
    }

    public static String cifrar(String mensaje) {
        StringBuilder mensajeCifrado = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char letraCifrada = (char) (base + ('Z' - Character.toUpperCase(c)));
                mensajeCifrado.append(letraCifrada);
            } else {
                mensajeCifrado.append(c);
            }
        }
        return mensajeCifrado.toString();
    }
}
