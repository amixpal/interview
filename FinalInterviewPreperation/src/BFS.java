import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Amit on 6/12/15.
 */
public class BFS {
    static int arr[][]={{0,1,1,0,0},
            {0,0,0,1,1},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}};
    static Queue<Integer> queue;

    BFS(){
        queue =new LinkedList<Integer>();
    }

    public static void main(String[] args){
        BFS dn = new BFS();
        printBFS();
    }

    public static void printBFS(){
        int source =0;
        int numberOfNodes = arr[source].length;
        int [] visited = new int[numberOfNodes];
        int v;

        queue.add(source);
        while (!queue.isEmpty()){
            v = queue.remove();
            System.out.println(v);
            visited[v]=1;

            for(int i=0;i<numberOfNodes;i++){
                if(arr[v][i]==1 && visited[i]==0){
                    queue.add(i);
                    visited[v]=1;
                }
            }
        }
    }
}
