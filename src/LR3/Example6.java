package LR3;
import java.util.Arrays;
import java.util.Scanner;
public class Example6 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] nums = new int[0];
            int i = 0, b = 0, num = 0;
            nums = new int[scan.nextInt()];
            num = nums.length;
            while (num != 0) {
                for (i = (i + 1); !(i % 5 == 2); i++) {
                }
                nums[b] = i;
                b++;
                //i++;
                num--;
            }
            System.out.println(Arrays.toString(nums));
        }

    }

