

public  class basic {

  static void   print2Table(){

      for(int i = 2; i<=10; i++){

        int ans = 2*i;

        System.out.println(ans);

      }

    }

       static  void printSum(int x, int y){
         
         int sum = x +y;

         System.out.println("sum"+ sum);

       }

       static int add(int p, int q){
          int sum = p +q;
          return sum;
       }

    public static void main(String[] args) {

      int result =   add(23,67);

      System.out.println(" sum " + result);

        // printSum(47,57);

        // System.out.println("chotti");
        // print2Table();
        // System.out.println("mal");
        
        

    }
    
}
