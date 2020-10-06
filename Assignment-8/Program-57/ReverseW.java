package Practice;

public class ReveseW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Every word is reversed";
        
        String temp="";
        String[] arr= str.split(" ");
        for(String st : arr)
        {
        	StringBuffer sb = new StringBuffer(st);
        	temp+=sb.reverse()+" ";
        }
        
        System.out.println(temp);
	}

}
