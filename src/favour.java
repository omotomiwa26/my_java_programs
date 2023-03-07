import java.util.Scanner;
public class favour {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n = 0 ;
	System.out.println("Enter n number");

	Scanner input = new Scanner(System.in);
	n = input.nextInt();
	int a = 0;
	for(a = 0; a<= n ; a+= 2){
		System.out.println("even number is : " +a);
		int sum = 0 ;
		sum += a ;
		if (sum>n){
			System.out.println("sum is greater than inputed value ");
			break;
		}}

	}}

	

