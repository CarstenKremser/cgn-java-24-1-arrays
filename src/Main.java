
public class Main {
    public static void main(String[] args) {

        // [] -> Array    0,  1, 2
        int [] numbers = {5, 10, 4};

        //printNumbers(numbers);

        int [] nums = new int[4];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 4;
        nums[3] = 20;

        printNumbers(nums);
    }

    public static void printNumbers (int[] numbers) {
        //   Zähler;    Läuft solange x;    Mache nach jedem Durchlauf
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("===========");

        // Erstelle für jeden Eintrag in
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}