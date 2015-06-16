import java.util.Stack;

/**
 * Created by Amit on 6/8/15.
 */
public class LargestSum {

    public static void main(String[] args){
        LargestSum ls = new LargestSum();
        int arr[] = {2,1,5,6,2,3};
        System.out.println(ls.largestRectangleArea(arr));
    }

    public int largestRectangleArea(int[] height) {
        if ( height==null||height.length==0){
            return 0;
        }

        Stack<Integer> stack=new Stack<Integer>();

        int max=0;
        int i=0;

        while(i<height.length){


            if (stack.isEmpty()||height[i]>=height[stack.peek()]){
                stack.push(i);
                i++;
            }
            else{

                int h=height[stack.pop()];
                int wid=stack.isEmpty()?i:i-stack.peek()-1;
                max=Math.max(h*wid, max);
            }

        }

        while (!stack.isEmpty()){
            int h=height[stack.pop()];
            int wid=stack.isEmpty()?i:i-stack.peek()-1;
            max=Math.max(h*wid, max);
        }

        return max;
    }
}
