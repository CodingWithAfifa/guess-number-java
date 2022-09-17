import java.util.Random;
import java.util.Scanner;


public class GuessNumberDynamic {
    public static void main(String[] args) {
        int uNum,cNum, attempt = 5;
        String yesNo;
        Random rd = new Random();
        cNum = rd.nextInt(50);

        Scanner sc = new Scanner(System.in);

        boolean rightWrong = true;
        boolean playAgain = true;

       do {
        while(rightWrong != false && attempt !=0)
        {
            System.out.println("\nEnter your guess between [1 - 50] :\n ");
            uNum = sc.nextInt();

            if(uNum == cNum)
            {
                System.out.println("You guessed correct : " + uNum);
                rightWrong = false;
                break;
                
            }else if(uNum > cNum)
            {
                System.out.println("\nYou guessed high");
                attempt--;
                System.out.println("Attempt left : " + attempt);
               
            }else if(uNum < cNum)
            {
                System.out.println("\nYou guessed low");
                attempt--;
                System.out.println("Attempt left : " + attempt);
            }
        }
        if(attempt > 0 && rightWrong == false)
        {
            System.out.println("\nYou have " + attempt + " attempt left ");
        }else if(attempt == 0 && rightWrong == true)
         {
	        System.out.println("\nYou have " + attempt + " attempt left\n ");
         }	

        System.out.println("Do you want to play again? [ Y/N]");
        yesNo = sc.next();
        yesNo = yesNo.toUpperCase();
        char ch = yesNo.charAt(0);
        
        if(ch == 'Y')
        {
            playAgain = true;
            attempt = 5;
        }else if(ch == 'N')
        {
            playAgain = false;
        }
        
       } while (playAgain);
       System.out.println("\n-----------Game End ------------\n");
        

    }
}
