import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scan.next();

        scan.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scan.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colore = scan.next();

        System.out.print("Inserisci il tuo giorno di nascita: ");
        short giornoNascita = scan.nextShort();

        System.out.print("Inserisci il tuo mese di nascita: ");
        short meseNascita = scan.nextShort();

        System.out.print("Inserisci il tuo anno di nascita: ");
        short annoNascita = scan.nextShort();

        int sommaNascita = giornoNascita + meseNascita + annoNascita;

        System.out.println("La tua password è: " + nome + "-" + cognome + "-" + colore + "-" + sommaNascita);

    }
}
