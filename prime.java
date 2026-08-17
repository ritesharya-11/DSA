
import java.util.*;

public class prime {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt();
    int high = scn.nextInt();

    for(int n = low; n<=high; n++){
        int count = 0;
        //try to divode and increment count
        for(int div = 2; div*div<=n; div++){
            if(n%div==0){
                count++;
                break;
            }
        }
        //try to divode and increment count
        if(count == 0){
 System.out.println(n);
        }

       
    }
    }
    
}
