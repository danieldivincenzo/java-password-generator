import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scan.next();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scan.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colore = scan.next();

        System.out.print("Inserisci la tua data di nascita: ");
        short dataNascita = scan.nextShort();

    }
}
