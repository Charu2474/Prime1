import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner gh=new Scanner (System.in);
        int num=gh.nextInt();
        int count = 0;
        int no= 100;
        while(count<num) {
            int b=0;
            for (int i=2;i<=no/2;i++) {
                if (no%i==0) {
                    b++;
                    break;
                }
            }
            if (b==0){
                System.out.print(no+" ");
                count++;
            }
            no++;
        }
    }
}
