import java.util.Scanner;

public class LetterPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (String line = sc.nextLine(); !line.equals(""); line = sc.nextLine()) {
            for (int i = 0; i < line.length(); i++) {
                System.out.println(line.charAt(i));
            }
        }
    }

}
