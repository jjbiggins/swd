import java.util.Scanner;

public class OneTimePad {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a message: ");
        System.out.print("Enter an encryption key: ");

        String message = input.nextLine();
        message = message.toUpperCase();

        int encryptionKey = input.nextInt();

        Cypher newCypher = new Cypher(message.toUpperCase(), encryptionKey);

        newCypher.encrypt(newCypher.getCharMessage(), encryptionKey);
        System.out.println(newCypher.getCharMessage());

        newCypher.decrypt(newCypher.getCharMessage(), encryptionKey);
        System.out.println(newCypher.getCharMessage());
    }
}

