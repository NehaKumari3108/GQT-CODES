import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		System.out.println("Enter two Numbers:");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c = a+b;
		System.out.println("Addition of two Number:"+c);

	}

}
