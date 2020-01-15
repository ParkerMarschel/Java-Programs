import java.util.Scanner;

public class TimeCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number of seconds: ");
		int seconds = in.nextInt();
		int beg_seconds = seconds;
		int days = 0;
		int hours = 0;
		int minutes = 0;

	if (seconds >= 86400) {
		days = seconds / 86400;
		seconds = seconds - (days *86400);
	}
	if (seconds >= 3600) {
		hours = seconds / 3600;
		seconds = seconds - (hours * 3600);
	}
	if (seconds >= 60) {
		minutes = seconds / 60;
		seconds = seconds - (minutes * 60);

	}
	if(days >0 && hours > 0)
		System.out.println(beg_seconds + " seconds is equal to "+ days + " day(s) "+ hours + " hour(s) " + minutes + " minutes(s) " + seconds + " Seconds(s).");
	else if( hours > 0)
			System.out.println(beg_seconds + " seconds is equal to "+ hours + " hour(s) " + minutes + " minutes(s) " + seconds + " Seconds(s).");
	else if(days >0)
		System.out.println(beg_seconds + " seconds is equal to "+ days + " day(s) " + minutes + " minutes(s) " + seconds + " Seconds(s).");
	else
		System.out.println(beg_seconds + " seconds is equal to " + minutes + " minutes(s) " + seconds + " Seconds(s).");

	}
}