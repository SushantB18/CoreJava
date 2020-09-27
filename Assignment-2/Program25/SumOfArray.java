class SumOfArray{
   public static void main(String args[]){
       int[][] array =
      {
         { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 },
         { 11, 21, 31 }, {20,30,56,32,32}
      };
      int sum = 0;
      
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}