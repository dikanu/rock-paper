import java.util.Random;
import java.util.Scanner;

public class rock_Papeer_Scissor {
    public static void main(String[] args) {
        System.out.println("Rock Paper and Scissor Using java");

        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        System.out.printf("Enter Your Name :- ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Your Choice is from 0, 1 and 2 :- ");
        int x = scan.nextInt();

        if(x==0){
            System.out.println("Rock\n");
        }

        else if(x==1){
            System.out.println("Paper\n");
        }

        else{
            System.out.println("Scissor\n");
        }

        System.out.println("Now Computer Choice is :- ");
        Random ran = new Random();
        int com = ran.nextInt(3);

        if(com==0){
            System.out.println("Rock\n");
        }

        else if(com==1){
            System.out.println("Paper\n");
        }

        else{
            System.out.println("Scissor\n");
        }

        if(x==1 && com==0 || x==2 && com==1 || x==0 && com==2){
            System.out.println(name +" Win the Match");
        }

        else if(x==com){
            System.out.println("Draw");
        }

        else{
            System.out.println("Computer Won the match");
        }
        scan.close();
        System.out.println("Thanks For Playing");
    }
}