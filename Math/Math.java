
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



   //-------->Print digit of the number 
     
   
       static void  printDigi(int number){
        // agar mere number = 0 hao to rukungs
      //agar mere number!= 0 to proccessing krunga
         while(number!=0){

          int digit = number % 10;
          System.out.println(digit);
          // digit remove krne ke liye
          number = number / 10;
         }
          
        
        }

        //--------> Count digit of the number

        static int countDigi(int num){

          int count = 0;
          while(num!=0){
            int digit = num % 10;
            count++;
            System.out.println(digit);

            // remove the digit
            num = num / 10;

          }
          return count;

        }

        //------------->Print number in reverse

        static int reverseNum(int num){
           int revNum = 0;
           while(num!=0){
            int digit = num % 10;
            // reverse num calculate as per formula
            revNum = revNum*10 + digit;
            // last digit remove krna padega num me se
              num = num / 10;
           }

           return  revNum;
        }

        //------------------> Check number is palindrome or not
        static boolean  isPalindrome(int num){
          int originalNum = num;
          int reverseNum = reverseNum(num);
          if(originalNum == reverseNum){
            System.out.println("it is palindromr");
            return true;

          }
          else{
            System.out.println("It is not a palindrome");
            return false;
          }
        }


      //--------------------->print reverse number
      
      static int printReverse(int num){
        int rev = 0;
        while(num!=0){
          int digit = num%10;
          rev =rev*10 +digit;
          System.out.println(rev);
        
          // remove number

          num = num/10;

        }
        return  rev;
      }

      //------------>
      static boolean Palindrome(int num){
          int originalNum = num;
          int reverseNum = reverseNum(num);
          if(originalNum == reverseNum){
            System.out.println("It is palindrome");
            return  true;

          }

          else{
            System.out.println("It is note palindrome");
            return false;
          }

          
      }

      //------------>Print prime or not
      // static boolean isPrimeOrNot(int num){
      //   for(int i = 2; i<=num-1; i++){
      //      if(num%i== 0){
      //       // not a prime number
      //       return false;
      //      }
      //   }
     
        // yaha tab pahuchega jab loop se bahar nikelega
        // or loot tab bahar 
    

      //--->Find GCD of rwo number
            
      static int getGCD(int a, int b){
     //gcd(a,b) = gcd(b,a%b)

     while(b!=0){
      int oldValue = b;
      b = a%b;
      a = oldValue;
     }

     //jab mere b =0 hga tab a ki place pr gcd milega
     int ans = a;
     return ans;


      }

      //--------->LCM 
      static int getLCM(int a, int b){
        int gcd = getGCD(a,b);
        //gcd(18,12) = 6
        int prod  = a * b;
        // prod(a,b) -> 216

        int lcm  =  prod/gcd;
        // 216/6
        return lcm;
      
      }

      //--------->Armsromr number
      static  boolean isArmstrongNumber(int num){
        int sum  = 0;

        int originalNum = num;
        while(num!=0){
          int digit = num%10;
          int cubeDigit = digit*digit*digit;

          sum = sum +cubeDigit;

          //digit remove from num
          num = num /10;

        } 

        if(sum == originalNum){
          return true;
        }
        else{
          return false;
        }
      }


    public static void main(String[] args) {

      System.out.println(isArmstrongNumber(123));




      // System.out.println(getLCM(18,12));
  





      // boolean ans = Palindrome(1234);
      // System.out.println(ans);
      // int num = 54321;

      // int result = printReverse(num);
      // System.out.println(result);

      // boolean ans = isPalindrome(2344);
      // System.out.println(ans);


      // int num = 123566;
      // int revNum  = reverseNum(num);
      // System.out.println(revNum);


      // int num = 23456;
      
      // int result = countDigi(num);
      // System.out.println(result);

      //   int num = 4537;
      //  int ans = counttDigit(num);
      //  System.out.println(ans);

        
    }
    
}
