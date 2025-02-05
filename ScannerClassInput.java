import java.util.Scanner;
class ScannerClassInput 
{
	public static void main(String  args [] )
	{
		Scanner sc = new Scanner (System.in);	
		System.out.println("Enter Value :" );
		int a = sc.nextInt();
		System.out.println("Enter Value : ");
		int b =sc.nextInt();
		System.out.println(a+b);
	}
}