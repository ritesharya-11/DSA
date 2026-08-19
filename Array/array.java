







public class array {

   public static void main(String[] args) {
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


     int arr[][] = {{1,2,3},{1,2,3}};

     int ans = 1;
     for(int i = 0; i<arr.length; i++){
        for(int j =0; j<arr[i].length; j++){
            int value  = arr[i][j];

            ans = ans * value;
        }

     }

     System.out.println(ans);





        }

        
   }
    

