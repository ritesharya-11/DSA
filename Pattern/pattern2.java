public class pattern2 {
    
    public static void main(String[] args) {

        // int n = 5;

        // for(int row = 1; row<=n; row++){
        
        //     // for each column 

        //     for(int col = 1; col<=4; col++){

        //         System.out.print("*");
        //     }

        //     System.out.println();
        
         // -> rectangle pattern
        // int n = 5;

        // for(int row = 1; row<=n; row++){
        //     // for each roe variable column
        //     // formula -> col 1-> value of row

        //     for(int col = 1; col<=row;  col++){
        //         // print star

        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }
        
       // -> Rombous pattern
          
//         int n = 5;

//         for(int row = 1; row<=n; row++){

//             // for each row -> spacea & pattern

//             // spaces

//             for(int col= 1; col<=n-row; col++){
//               System.out.print(" ");

//               // for stars
               
//         }
//         for(int col = 1; col<=n; col++){
//             System.out.print("*");
//         }

//         Syn = stem.out.println();
//         }
// // 
           

    //    int n = 5;

    //    for(int row = 1; row<=n; row++){
         
    //     for(int col = 1; col<=n-row+1; col++){
    //         System.out.print("*");
    //     }

    //     System.out.println();

    //    }
        

    //   int n=  5;

    //   for(int row = 1; row<=n; row++){
        
    //     // each row -> spacea & stars
    //       for(int col = 1; col<=n-row; col++){
    //         // print spaes 
           
    //         System.out.print(" ");

    //       }
           
    //       // for star
    //       for(int col = 1; col<=2*row-1; col++){
    //         System.out.print("*");
    //       }

    //       // move to next line 
    //         System.out.println();

    //   }



    //   int n = 4;

    //     for (int row = 1; row <= n; row++) {

    //         // for spaces
    //         for (int col = 1; col <= row - 1; col++) {

    //             // print spaces
    //             System.out.print(" ");
    //         }

    //         // for stars
    //         for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {

    //             // print star
    //             System.out.print("*");
    //         }

    //         // move to next row
    //         System.out.println();
    //     }

       // hole pattern

        // int n = 4;

        // for (int row = 1; row <= n; row++) {

        //     // for each row -> 6 columns
        //     for (int col = 1; col <= 6; col++) {

        //         if (row == 1 || row == n) {
        //             System.out.print("*");
        //         }

        //         else {
        //             // middle rows
        //             if (col == 1 || col == 6) {
        //                 System.out.print("*");
        //             }

        //             else {
        //                 // middle columns
        //                 System.out.print(" ");
        //             }
        //         }
        //     }

        //     // move to next row
        //     System.out.println();
        // }

        // int n= 10;

        // for(int row = 1; row<=n; row++){
        //     // for each -> varible column
            
        //     if(row==1 || row==2 || row==n){
        //         for(int col = 1; col<=row; col++){
        //             System.out.print("*");

        //         }
        //     }

        //     else{
        //         // middle row
        //         // 1*
              
        //         System.out.print("*");
        //         // (row-2) spacea

        //         for(int col = 1; col<=(row-2); col++){
        //             System.out.print(" ");
        //         }

        //         // 1*

        //         System.out.print("*");
                

        //     }

        //     // MOVE TO NEXT LINE
        //     System.out.println();

        // }


        // int n  = 5;

        // for(int row = 1; row<=n; row++){
        //     // for each row -> varible col
        //     // part 1

        //     for(int col = 1; col<=n-row; col++){
        //         System.out.print(" ");
        //     }

        //     // part 2
        //     if(row==1 || row==n){
        //         for(int col = 1; col<=2*row-1; col++){
        //             System.out.print("*");
        //         }
        //     }

        //     else{
        //         // middle row
        //         // 1*

        //         System.out.print("*");
        //         //2r-3 space
        //         for(int col = 1; col<=2*row-3; col++){
        //             System.out.print(" ");
        //         }
                  
        //         //1*

        //         System.out.print("*");
                
        //     }

        //     // move to next ,line

        //   System.out.println();
        // }

       // pyrimide

      //  int n =  4;

      //  for(int row = 1; row<=n; row++){
      //   // for each row -> variable column

      //     //  spaces
      //     for(int col = 1; col<=n-row; col++){
      //       System.out.print(" ");
      //     }

      //    for(int col =  1; col<=2*row -1; col++){
      //       System.out.print("*");
      //    }
      //    // move to next line 

      //    System.out.println();

      //  }

      // int n = 4;

      // for(int row = 1; row<=n; row++){
      //   //part1
      //   for(int col= 1; col<=row; col++){
      //     System.out.print("*");
      //   }

      //   //part2
      
      //   for(int col =1; col<=2*(n-row);col++){
      //     System.out.print("  ");
      //   }
      //   //part3
      //   for(int col= 1; col<=row; col++){
      //     System.out.print("*");
      //   //pert4
      //   }
      //   System.out.println();
      // }  

      // //inverted symmetrical half

      // for(int row = 1; row<=n; row++){
      //   //part4
      //   for(int col =1; col<=n-row+1; col++){
      //     System.out.print(" *");
      //   }
      //   // part 5

      //   for(int col=1; col<=2*(row-1); col++){
      //     System.out.println(" ");
      //   }

      //   //part6
      //   for(int col =1; col<=n-row+1; col++){
      //     System.out.print(" *");
      //   }

      // }

      // System.out.println();


      // int n = 5;

      // for(int row= 1; row<=n; row++){
      //   for(int col = 1; col<=row; col++){
      //     System.out.print(col+" ");
      //   }

      //   System.out.println();
      // }

      // int n = 6;

      // int count = 1;

      // for(int row = 1; row<=n; row++){
      //   // for each row -> varible col
      //   for(int col= 1; col<=row; col++){
      //     System.out.print(count+ " ");

      //     count++;
      //   }

      //   // move to next line 

      //   System.out.println();
      // }


      int n=  5;

      for(int row=1; row<=n; row++){
        for(int col=1; col<=row; col++){
          int a = n-col;
          int b= 'A';
          int ans = a+b;
          char  finalAns  = (char)ans;

          System.out.print(finalAns + " ");
        }

        System.out.println();

      }

























    }
  }