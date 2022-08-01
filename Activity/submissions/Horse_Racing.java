import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] nums = new int[N];
        int[] diffOfNums = new int[N-1];

        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            nums[i] = pi;
        }

        Arrays.sort(nums);

        for(int i = 0; i < N; i++){
            if((i + 1) != N){
                int difference = nums[i+1] - nums[i];
            if(difference != 0){
                    diffOfNums[i] = difference;
             }      
            }
            
        }

        Arrays.sort(diffOfNums);


        

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(diffOfNums[0]);
    }
}
