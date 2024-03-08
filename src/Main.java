
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

        System.out.println("--------");

        int[][] twobytwo = new int[2][2];
        twobytwo[0][0] = 1;
        twobytwo[0][1] = 2;
        twobytwo[1][0] = 3;
        twobytwo[1][1] = 4;

        //int[][] twobytwo = {{1,2},{3,4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(twobytwo[i][j]);

            }

        }
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