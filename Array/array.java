


public class array {
   static void printString(String str){
      int n = str.length();
      for(int i = 0; i<=n; i++){
         char ch  = str.charAt(i);
         System.out.println(ch);
      }
   }


   //----------->COUNT VOWLES I STRING
   static int getVowelCount(String str){
      int count = 0;
      for(int i = 0; i<str.length(); i++){
         char ch = str.charAt(i);
         if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||  ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            count++;
         }
      }

      return  count;
   }



   // -------> Reverse the string

   static String reverseString(String str){
      string reverse = "";
      int n = str.length();
      for(int i=n-1; i>=0; i--){
         char ch = str.charAt(i);
         reverse = reverse + ch;
      }

      return reverse;
   }


   public static void main(String[] args) {

       String str  = "ritesh";
      System.out.println(reverseString(str));







        // // decleration 
        // int arr[];
        // // allocation
        // arr = new int [5];
        // // initilization

        // int brr[] = {1,2,3,45,66,77,8,8,99};

        //  int n = brr.length;

        //   for(int index = 0; index<=n-1; index++){
        //     System.out.println("value of each arary"+ brr[index]);
        //   }

    //   int arr[] = new int[6];
    //   Scanner sc = new  Scanner(System.in);

    //   int n = arr.length;
    //   // for input 
    //     for(int i = 0; i<=n-1; i++){
    //        System.out.println(" Provide input from index " + i);
    //        arr[i] = sc.nextInt();
    //     }
          
    //     // print 
    //     for(int val: arr){
    //         System.out.println(val);
    //     }

        // int arr[] = new int[5];
        // Scanner sc  = new Scanner(System.in);

        // int n = arr.length;

        // for(int i = 0; i<=n-1; i++){
        //     System.out.println(" provide input for index " +i);
        //     arr[i] = sc.nextInt();
        // }
        // // print 
        // for(int val: arr ){
        //     System.out.println(val);
        // }

        // int arr[] = {23,56,77,88};

        // int n = arr.length;
        // for(int index = 0; index<=n-1; index++){
        //     System.out.println("value of every index" + arr[index]);
        // }

        // int arr[] = {34,56,67,78};

        // int sum = 0;
        // int n = arr.length;
        // for(int i = 0; i<=n-1; i++){
        //     int value = arr[i];

        //     sum = sum +value;
        // }
        // System.out.println(sum);


        // ------------------>multilicaton of array


        // int arr[] = {10,20,30};

        // int n = arr.length;

        // int ans = 1;

        // for(int i = 0; i<=n-1; i++ ){

        //     int value = arr[i];

        //     ans = ans *value;


        // }

        
        //     System.out.println(ans);


        //------------------------> find maximum number of the array

        // int arr[] = {2,3,12,3,35,21,20};

        // int n = arr.length;

        // int MaxValue = arr[0];

        // for(int i = 0; i<=n-1; i++){
        //     if(arr[i]>MaxValue){
        //         // update

        //         MaxValue = arr[i];
        //     }
        // }


        // System.out.println(MaxValue);


     //---------------------> Find minimum value in array

    //  int arr[] = {3,5,6,-7,10};

    //  int n = arr.length;
    //  int MinValue = arr[0];

    //  for(int i = 0; i<=n-1; i++){

    //     if(arr[i]<MinValue){
    //         // upadte

    //         MinValue = arr[i];
    //     }

    //  }

    //   System.out.println(MinValue);
   //----------------------------------------->2D ARRAY

    // decaralation
    // int[][] arr;
    // //ALLOCATION
    // arr = new int[3][5];
    // // init
    // int[][] brr = {
    //     {1,2},
    //     {3,4},
    //     {5,5},
    //     {6,7}
    
    // };
    // int rowLength = brr.length;
    // int colLength = brr[0].length;

    // for(int rowIndex = 0; rowIndex<=rowLength-1; rowIndex++ ){
    //     for(int colIndex = 0; colIndex<=colLength-1; colIndex++){
    //         System.out.print(brr[rowIndex][colIndex] + " ");
    //     }
    //    System.out.println(); 
    // }


    // // traversal 2-D array

    // for(int rowIndex = 0; rowIndex<=brr.length-1; rowIndex++){
    //     for(int colIndex = 0; colIndex<=brr[rowIndex].length-1; colIndex++ ){

    //         System.out.println();
             
    //     }
    // }

     
         

     // input for 2D-array
    //  int arr[][] = new int[3][4];
    //  Scanner sc = new Scanner(System.in);
    //  // input
    //  for(int i = 0; i<=arr.length-1; i++){
    //     for(int j = 0; j<=arr.length-1; j++){
    //         System.out.print("Provide value for row =" +i + "provide vaue for j=" +j);
    //         arr[i][j] = sc.nextInt();
    //     }
    //  }
    //     // print 

    //     for(int rowIndex = 0; rowIndex<=arr.length-1; rowIndex++){
    //         for(int colIndex = 0; colIndex<=arr[rowIndex].length-1;colIndex++){
    //             System.out.println(arr[rowIndex][colIndex]);
    //         }
    //     }


    //----------------> sum of 2D array

    // int arr[][] = {{1,2,3},{1,2,3}};

    // int sum  = 0;

    // for(int i = 0; i<arr.length; i++){
    //     for(int j = 0; j<arr.length; j++){
    //         int value = arr[i][j];

    //         sum = sum +value;

    //     }
    // }
    // System.out.println(sum);
     
     //-------------------> multilplication of the 2D array


   //   int arr[][] = {{1,2,3},{1,2,3}};

   //   int ans = 1;
   //   for(int i = 0; i<arr.length; i++){
   //      for(int j =0; j<arr[i].length; j++){
   //          int value  = arr[i][j];

   //          ans = ans * value;
       

     
   //-----------> sum of array

   // int arr[] = {2,4,5,6,78};

   // int n = arr.length;
   // int sum = 0;

   // for(int i = 0; i<arr.length; i++){

   //  int value = arr[i];

   //    sum = sum + value;
   // }
   
   // System.out.println(sum);

      // int arr[] = {2,4,5,6,78};

      // int n = arr.length;

      // int MaxValue = arr[0];

      //   for(int i = 0; i<arr.length; i++){
      //    if(arr[i]>MaxValue){

      //       MaxValue = arr[i];
      //    }
      //   }

      //   System.out.println(MaxValue);


      //     int[] arr = {10, 20, 30, 40, 50};

      //   int start = 0;
      //   int end = arr.length - 1;

      //   while (start < end) {

      //       int temp = arr[start];
      //       arr[start] = arr[end];
      //       arr[end] = temp;

      //       start++;
      //       end--;
      //   }

      //   System.out.println("Reverse Array:");

      //   for (int i = 0; i < arr.length; i++) {
      //       System.out.print(arr[i] + " ");
      //   }

      //----------------------> Liner search

   //  int[] arr = {10, 20, 30, 40, 50};

   //      int target = 30;

   //      for (int i = 0; i < arr.length; i++) {

   //          if (arr[i] == target) {
   //              System.out.println("Element found at index: " + i);
   //              return;
   //          }
   //      }

   //      System.out.println("Element not found");

   //-----------------> 2D Array Traversing

   //  int arr[][] ={{1,2,3},{4,5,6}};
      
   //     for(int i = 0; i<arr.length; i++){
   //       for(int j = 0; j<arr[i].length; j++){

   //       System.out.print(arr[i][j] + "  ");

   //       }
   //       System.out.println();
   //     }
        
   //  Scanner sc = new Scanner(System.in);
   //  System.out.println("Provide  the strnf content: ");
   //  String str = sc.nextLine();
   //  System.out.println("vlue " + str );
    
   //----------------> Some method of string

   // String  str = "Ritesh";
   // System.out.println(str);
   // System.out.println(str.charAt(2));
   // System.out.println("");

   //  String name = "RITESH";
   //  System.out.println(str.equals(name));
   //  System.out.println(str.equals(name));

   
    //empty -> length = 0
    //blanks-> empty or sirf spaces h string
   //   String str = " ";
   //   System.out.println(str.length());
   //   System.out.println(str.isEmpty());
   //   System.out.println(str.isBlank());

   //   String name = "  love  ";
   //   System.out.println(name.length());
   //  name =  name.trim();
   //  System.out.println(name.length());

   // String name = "ritesh";
   // System.out.println(name.toUpperCase());
   // System.out.println(name.toLowerCase());

   // String name = " my name is ritesh ";
   
   //0 -> m
   //1 -> y
   //2 space and so on
   // //begin index -> 3 
   //  System.out.println(name.substring(3,7));\

   // int num = 23445;
   // String str = String.valueOf(num);
   // System.out.println(num +1);
   // System.out.println(str +1);

   // String name = " my name is ritesh ";
   // System.out.println(name.startsWith("my"));
   // System.out.println(name.endsWith("ritesh"));

   // String input = "my, name, is, love, ritesh";
   // String[] words = input.split(",");
      
   // for(String str: words){
   //    System.out.println(str);

   }

    





     
    }

    
        

        
   
    

