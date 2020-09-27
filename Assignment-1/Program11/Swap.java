import java.util.Scanner;
class Swap{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Two numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();

            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("After Swap " +"a :"+ a + " b :"+b);
    }
}