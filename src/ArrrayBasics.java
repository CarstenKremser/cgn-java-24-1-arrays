public class ArrrayBasics {

    public static void main(String[] args) {

        System.out.println("=== Step 1 ===");

        int [] numbers1 = {1,2,3,4,5,6,7,8,9,10};

        for(int number : numbers1) {
            System.out.println(number);
        }

        System.out.println("=== Step 2 ===");

        int sum = 0;
        for (int number : numbers1) {
            sum += number;
        }
        System.out.println(sum);

        System.out.println("=== Step 3 ===");

        int maxnum = numbers1[0];
        for (int i = 1; i < numbers1.length; i++) {
            if (maxnum < numbers1[i]) {
                maxnum = numbers1[i];
            }
        }
        System.out.println(maxnum);

        System.out.println("=== Step 4 ===");
        int [] numbers2 = {11,12,13,14,15,16,17,18,19,20};

        System.out.println("=== Step 5 ===");
        int [] sumNumbers = new int[10];
        for (int i = 0; i < sumNumbers.length; i++) {
            sumNumbers[i] = numbers1[i] + numbers2[i];
        }

        for(int number : sumNumbers) {
            System.out.println(number);
        }



    }
}
