import java.util.Scanner;
class TaxCalculator{
	public static void main(String[] args){
		//single
		//0-7999 = 10%
		// 8000-31999 = 800 + 15%
		// 32000 and up = 4400 + 25%
		Scanner scan = new Scanner(System.in);
		double out = 0;
		boolean smart = true;
		String status = "bannana";
		while(smart){
			System.out.println("Enter your status (Single or Married):");
			status = scan.next().toLowerCase();
			if(status.equals("married") || status.equals("single"))
				smart = false;
			else
				System.out.println("Try again");
		}
		if(status.equals("single")){
			System.out.println("Enter your taxable income:");
			int income = scan.nextInt();
			if(income <8000)
				out = income * .1;
			else if(income <32000)
				out = (income-8000) * .15 + 800;
 			else
				out = (income-32000) * .25 + 4400;
		}
		else if(status.equals("married")){
			System.out.println("Enter your taxable income:");
			int income = scan.nextInt();
			if(income <16000)
				out = income * .1;
			else if(income <64000)
				out = (income-16000) * .15 + 1600;
 			else
				out = (income-64000) * .25 + 8800;
		}
		System.out.println("You owe $" + out + " in tax");

		//married
		//0-15999 = 10%
		//16000 - 63999 = 1600 +15%
		//64000 and up
	}
}