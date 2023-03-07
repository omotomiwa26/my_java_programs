import java.util.Scanner;

class calculator {
		public static void main(String args[]){
			@SuppressWarnings("resource")
			Scanner tommy = new Scanner(System.in);
			double fnum;
			double snum;
			double addition,subtraction,multiplication,division;
			System.out.println("Enter first num:");
			fnum = tommy.nextDouble();
			System.out.println("Enter second num:");
			snum = tommy.nextDouble();
			addition = fnum + snum;
 			System.out.println("addition is"+addition);
			subtraction = fnum - snum;
			System.out.println("subtracton is"+subtraction);
			multiplication = fnum * snum;
 			System.out.println("multiplication is"+multiplication);
 			division = fnum / snum;
 			System.out.println("division is"+division);
	}
}		