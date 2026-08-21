




public class string {

    public static void main(String[] args) {
        // String firstName =  "";
        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        


        // String lastName = new  String("arya");
        // System.out.println(firstName + "  " + lastName);
        // System.out.println(firstName.length());
        // System.out.println(firstName.charAt(1));


        // String movie = " Spiderman";

        // for(int i = 0; i<movie.length(); i++){

        //     System.out.print(movie.charAt(i));
        // }
        // System.out.println();

      //------------>Problem 2: Count Length Without length()
        // String language = "java";

        // int count = 0;

        // for(int i =0; i<language.length(); i++){
        //     count++;
        // }

        // System.out.println(count);

        //--------------------->Problem 3: Count Vowels

        // String name = "RiteshArya";

        // int count = 0;
        // for(int i = 0; i<name.length(); i++){
        //      char ch = name.charAt(i);

        //      if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i' || ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U')

           

        //     count++;
        // }

        // System.out.println( " vowels: " + count);


        //---------------------> Reversed the string 

    //     String leader = "Modi";

    //    String  reversed =  "";

    //     for(int i = leader.length(); i>=0; i--){
    //         reversed = reversed + leader.charAt(i);
    //     }

    //     System.out.println("reversed:" + reversed);


 String str = "hello world";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        System.out.println("Uppercase: " + result);

        
    }
}

