import java.util.Scanner;
public class calculate{
	public static void main(String[]args){
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a numN");
		int numN = inp.nextInt();
		System.out.println("Enter a numR");
		int numR = inp.nextInt();
		int numD = numN - numR;
		long container1 = 1;
		long container2 = 1;

		if (numN < numR ){
			System.out.println("invalid input");
		}
		else{
				for (int q=1;q<=numN ;q++ ){
					container1 *=q;
		}
			for (int a=1;a<=numD ;a++ ){
				container2 *=a;
		}

	}
	Long result= container1 / container2;
	System.out.println(result);
	}
}	