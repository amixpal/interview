import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Amit on 6/12/15.
 */
public class DetectCycleInGraph {
    static int arr[][] = {{0, 0, 0, 1, 0},
            {1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {0, 0, 1, 0, 0}};
    static int[] visited= new int[arr.length+1];
    static int source = 0;
    static int[][]adjanceyMatrix;
    static Stack<Integer> stack;
    public static void main(String[] args){
        findCycle(arr, arr.length);
    }

    public static void findCycle(int[][] arr, int size){
        adjanceyMatrix = new int[size][size];
        stack = new Stack<Integer>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                adjanceyMatrix[i][j] = arr[i][j];
            }
        }

        int element = source;
        int destination = source;
        stack.push(source);

        while (!stack.isEmpty()){
            element = stack.peek();
            destination = element;
            while (destination < size){
                if(adjanceyMatrix[element][destination]==1 && visited[destination]==1){
                   if( stack.contains(destination));
                    {
                        System.out.println("Circle");
                        return;
                    }
                }

                if(adjanceyMatrix[element][destination]==1 && visited[destination]==0){
                    stack.push(destination);
                    visited[destination]=1;
                    adjanceyMatrix[element][destination]=0;
                    element=destination;
                }



            }

        }

    }
}
