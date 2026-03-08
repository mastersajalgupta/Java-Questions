import java.util.Scanner;

class Vigenere_Cipher {
    public static void main(String args[]) {

        Cipher obj = new Cipher();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the option:");
        System.out.println("1) Encryption");
        System.out.println("2) Decryption");

        int op = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter the text: ");
        String text = sc.nextLine().toUpperCase();

        System.out.print("Enter the key: ");
        String key = sc.nextLine().toUpperCase();

        switch (op) {
            case 1:
                System.out.println("Encrypted Text: " + obj.encrypt(text, key));
                break;

            case 2:
                System.out.println("Decrypted Text: " + obj.decrypt(text, key));
                break;

            default:
                System.out.println("Invalid Option");
        }

        sc.close();
    }
}

class Cipher {

    public String encrypt(String text, String key) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char k = key.charAt(i % key.length());

            char e = (char) ((c - 'A' + k - 'A') % 26 + 'A');
            sb.append(e);
        }

        return sb.toString();
    }

    public String decrypt(String citext, String key) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < citext.length(); i++) {
            char c = citext.charAt(i);
            char k = key.charAt(i % key.length());

            char d = (char) ((c - k + 26) % 26 + 'A');
            sb.append(d);
        }

        return sb.toString();
    }
}