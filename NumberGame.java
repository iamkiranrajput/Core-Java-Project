
import java.util.*;

public class NumberGame {
	
	public static void main(String[] args) {
		
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int score=0;
		boolean flag;
		int matches=1;

		while(true) {
			flag=false;
			int randNum=r.nextInt(100);
		
			System.out.println("Enter the number between 1 to 100");

		for(int i =1; i<10; i++) {
			int userGuess=s.nextInt();
			
			if(randNum<userGuess) {
				System.out.println("your entered number is too high..");
				System.out.println("Enter the small number:");
			
			}else if(randNum>userGuess) {
				System.out.println("your entered number is too small");
				System.out.println("Enter the big number");
			}
			else if(randNum==userGuess) {
				System.out.println("great.. you guess the number in "+i+" iteration..");
				score++;
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("you reach the max iteration your score is: "+score+"/"+matches);
		}
		System.out.println("Do you want to play again ?");
		char dec=s.next().charAt(0);
		if(dec=='N'|| dec=='n') {
			break;
		}
		
		matches++;
		}
		
		System.out.println("Your score is: "+score+"/"+matches);
		
        s.close();
	}

}
