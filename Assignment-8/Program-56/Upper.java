package Practice;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str ="Program to convert fisrt char to upper";
          
          String temp="";
          String[]arr=str.split(" ");
          StringBuffer sb= new StringBuffer();
          
          for(int i=0; i < arr.length; i++)
          {
        	  temp += Character.toUpperCase(arr[i].charAt(0));
        	  temp+=arr[i].substring(1)+" ";
        			  
          }
          System.out.println(temp);
	}

}
