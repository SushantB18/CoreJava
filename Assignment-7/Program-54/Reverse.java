package Practice;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);

System.out.println("Enter the string to reverse");

String str = sc.next();


char ch []= str.toCharArray();
String rev="";

for(int i=ch.length-1; i>=0;i--)
{
	rev=rev+ch[i];
}
System.out.println(rev);
	}

}
