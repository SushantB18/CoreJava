package Practice;
import java.util.Scanner;
public class format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Numbers in string");
		String str=sc.nextLine();
		
		String arr[]=str.split(",");
		for(String ar:arr)
		{
			sum+=Integer.parseInt(ar);
		}
		
		System.out.println("Sum of all integers in string is "+sum);
	}

}