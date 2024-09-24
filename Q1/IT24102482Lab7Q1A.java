import java.util.Scanner;
public class IT24102482Lab7Q1A{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Subject Mark 1: ");
	int mark_1 = sc.nextInt();

	System.out.println("Enter Subject Mark 2: ");
	int mark_2 = sc.nextInt();

	System.out.println("Enter Subject Mark 3: ");
	int mark_3 = sc.nextInt();

	System.out.println("Enter Subject Mark 4: ");
	int mark_4 = sc.nextInt();

	int avg = (mark_1+mark_2+mark_3+mark_4)/4;
	System.out.println("Average is: "+avg);

	if(avg>=75 && avg<=100)
	{
		System.out.println("Overal Grade is Distinction");
	}
	else if(avg>=50 && avg<75)
	{
		System.out.println("Overal Grade is Credit");
	}
	else{
		
		System.out.println("Overal Grade is Fail");
	}
}
}