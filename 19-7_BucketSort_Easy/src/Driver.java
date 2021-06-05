import java.util.Random;

public class Driver {

    public static void main(String[] args) {


        Random randomNumber = new Random();

        for(int i = 0; i < 10; i++){
            int[] randomArray = new int[randomNumber.nextInt((15 - 2) + 1) + 0];
            for(int n = 0; n < randomArray.length; n++){
                randomArray[n] = randomNumber.nextInt((200 - 1) + 1);
            }
            System.out.print("Random Array: ");
            for(int value : randomArray){
                System.out.print(value + ", ");
            }
            System.out.println("");

            BucketSort sort = new BucketSort(randomArray);
            int[] sortedArray = sort.sort();

            System.out.print("Sorted Array: ");
            for(int value2 : sortedArray){
                System.out.print(value2 + ", ");
            }
            System.out.println("");
            System.out.println("---------------------------------");
        }
    }
}
