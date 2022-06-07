import java.util.Scanner;

public class Q2 {


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of lines you want to enter in");
        int numOfLines = scanner.nextInt();

        //Similar to problem 1, create an array equal to size of the int entered
        String[] entries = new String[numOfLines];
        System.out.println("Enter your string entries");
        for(int i = 0; i < numOfLines; i++){
           entries[i] = scanner.next();
        }
        sumDigitsOnly(numOfLines,entries);


    }

    public static void sumDigitsOnly(int N, String[] entries){
        //Start with a baseline sum of 0
        int sum = 0;
        int i = 0;

        while (i < N){
            String line = entries[i];
            for (char chars : line.toCharArray()){
                try{
                    String conval = Character.toString(chars);
                    sum += Integer.parseInt(conval);
                }
                catch (Exception e){

                }
            }
            System.out.println(sum);
            i++;
        }

    }
}
