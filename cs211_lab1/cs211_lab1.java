
/**
 * Write a description of class cs211_lab1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class cs211_lab1
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");

        int n = scanner.nextInt();

        int[] height = new int[n];

       

        System.out.println("Enter the heights: ");

        for (int i = 0; i < n; i++) {

            height[i] = scanner.nextInt();

        } 

    scanner.close();

    System.out.println("Maximum water: " + maxArea(height));

    }
    public static int maxArea(int [] height)
    {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right)
        {
            int current=Math.min(height[left],height[right])*(right-left);
            maxarea=Math.max(maxarea,current);
            
            if(height[left]<height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}
