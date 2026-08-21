
public class Math {
   //---------------->Print digit of the number
   static void printDigit(int num){
    //  agar mere nu,= 0 ho to mai rukunga
    // agar mere num! = 0 hao to proceesing krta rahunga
      while(num!=0){
        int digit = num % 10;
        System.out.println(digit);
        //Last digit remove
        num = num/10;
      }
   }

   //--------------> count digit of number
    
    static int counttDigit(int num){
    //  agar mere nu,= 0 ho to mai rukunga
    // agar mere num! = 0 hao to proceesing krta rahunga

       int count = 0;
      while(num!=0){
        int digit = num % 10;
        count++;
        System.out.println(digit);
        //Last digit remove
        num = num/10;
      }
      return count;
   }


    public static void main(String[] args) {

        int num = 4537;
       int ans = counttDigit(num);
       System.out.println(ans);

        
    }
    
}
