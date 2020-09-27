import java.util.Scanner;
class Third{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=sc.nextInt();

       int y = (x*x) + (3*x) - 7;
        System.out.println("A. Value of y "+y);

        y = x++ + ++x;
        System.out.println("B. Value of X = "+x+" Value of Y= "+y);

        int z = x++ - --y - --x  +  x++;
        System.out.println("C. Value of X = "+x+" Value of Y = "+y+" Value Of Z = "+z);

        System.out.println("Enter the Value True and false of X And Y");
        
        boolean x1=sc.nextBoolean();
        boolean y1=sc.nextBoolean();

        boolean z1 = x1 && y1 || !(x1 || y1); 
        System.out.println("D. Value Of z = "+z1);
        

    }
}