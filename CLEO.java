import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CLEO {
	
	static String[] words = {"kintamani", "libreville", "dilemma" , "dream" , "owlet" , "anticipation" , "concentric" , "montblanc" , "navigation" , "vinson"};
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("START TYPING THE FOLLOWING:");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		for(int i = 0; i < 10; i++)
		
		{
			System.out.print(words[rand.nextInt(10)] + " ");
		}  
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		int numChars = typedWords.length();
		
		//  (x characters / 5) / 1min = y  WPM
		double numChars1 = 0;
		int wpm = (int) ((((double) numChars / 5)/ seconds) * 60);
		//  (x characters / 1min) = y CPM
		int cpm = (int) (((double) numChars / seconds) * 60 );
		
		
		System.out.println("Your wpm " + " is " + wpm + "!");
		
		System.out.println("Your cpm " + " is " + cpm + "!");
		
		{
			if (wpm<=48)
			System.out.println("You are an Average Typist");
			else if (wpm>40 && wpm<=60)
				System.out.println("You are a Good Typist");
			else if (wpm>60 && wpm<=100)
				System.out.println("You are an Excellent Typist");
			else
				System.out.println("You are an Elite Typist");
		
		}
		
		
		
		
		
		
	}

}