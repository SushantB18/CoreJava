package Practice;
import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   String[] str= { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"
	};
   System.out.println("Enter the number");
   int num = sc.nextInt();
   
   if (num>=str.length || num<0) {
	   throw new MyExcept();
   }else {
	   System.out.println(str[num]);
   }
   }

}

class MyExcept extends Exception{
	@Override
	public String toString() {
		return "ArrayOutOfBoundsException";
	}
}
