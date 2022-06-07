import java.util.Arrays;
import java.util.Scanner;
public class Q1 {

    public static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {
        System.out.println("Enter how many triples will be entered");
        int numOfTriples = scanner.nextInt();
        //Create a number of arrays size 3 equal to the inputted integer
        int [][] Arrays = new int [numOfTriples] [3];
        System.out.println("Enter in the triple values");
        //For each array/value less than the number of arrays created
        for (int i = 1; i < numOfTriples + 1; i++){
            //Set the next 3 int inputs equal to the 3 values in the array
            Arrays[i][0] = scanner.nextInt();
            Arrays[i][1] = scanner.nextInt();
            Arrays[i][2] = scanner.nextInt();
        }

    }
    public void printMiddleValue(int N, int[][] Array){
        //Sort the array (which will auto set there order by least to most)
        //since its an array of 3, the middle value will always be [1]

        //For every array
        for (int i = 0; i < N; i++){
            //Sort it
            Arrays.sort(Array[i]);
            //Then print the second value of the selected array
            System.out.println(Array[i][1]);
        }
        //Print all the middle values from the array
        printMiddleValue(N,Array);





    }
}
