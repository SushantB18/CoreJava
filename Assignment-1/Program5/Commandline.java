import java.util.Scanner;

class Commandline{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter the Name ");
            String name=sc.nextLine();
            
            System.out.println("Welcome "+name);
            
        }
}