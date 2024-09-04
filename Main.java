import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in); 
		int secretNumber = (int) (Math.random()*100 + 1);
		
		System.out.println("press S to start");
		
		char ch = sc.next().charAt(0);
		
		int guess = -1;
		if (ch == 's'|| ch == 's'){
		    while(guess != secretNumber){
		        System.out.println("guess a Number");
		        guess = sc.nextInt();
		        
		        if (guess > secretNumber){
		            System.out.println("guessed number is greater");
		        }else if (guess < secretNumber){
		            System.out.println("guessed number is smaller");
		        }else{
		            System.out.println("guessed number is correct");
		        }
		        }
		        
		}else{
		    System.out.println("game ends");
		
		}
	}
}