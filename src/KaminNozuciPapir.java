import java.util.Random;
import java.util.Scanner;

public class KaminNozuciPapir {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Hi let's play the game ‘1-Rock 2-Scissors 3-Paper’");
        System.out.println("Guess what I wished for 1 , 2 , 3 ? ");
        int guessedNumber = rnd.nextInt(3) + 1 ;
        int user = scanner.nextInt();
        if (user==guessedNumber) {
            System.out.println("Oh, it was a great draw " + guessedNumber + " Happy yes ");
        }else if (user == 2) {
            System.out.println(" Congratulations, you have won  " + "Cosplayer chose happy " + guessedNumber);
        }else {
            System.out.println("Unfortunately, you lost the computer you won ");
        }
    }
}
