import java.util.Stack;

public class DFSDetectCycle{
    static int arr[][]={{0,1,1,0,0,0},
            {0,0,0,1,1,0},
            {0, 0,0,0,0,1},
            {0, 0, 0, 0, 0,0},
            {0, 0, 0, 0, 0,0},
            {0,0,0,0,0,0}};
    static Stack<Integer> stack;

    DFSDetectCycle(){
        stack = new Stack<Integer>();
    }

    public static void main(String[] args){
        DFSDetectCycle df = new DFSDetectCycle();
        PrintDFS();

    }
    public static void PrintDFS(){
        int source = 0;
        int numberOfNodes = arr[source].length;
        int [] visited = new int[numberOfNodes];
        int v;

        stack.push(source);
        while (!stack.isEmpty()){
            v = stack.pop();
            if(visited[v]==0){
                System.out.println(v+1);
                visited[v] = 1;
            }

            for(int i=0;i<numberOfNodes;i++){
                if(arr[v][i] == 1 && visited[i]==1){
                    stack.contains(i);
                    System.out.println("Cycle is detect");
                    return;
                }
                if(arr[v][i]==1 && visited[i]==0){
                    stack.push(v);
                    System.out.println(i+1);
                    arr[v][i]=0;
                    visited[i]=1;
                    v = i;
                }
            }
        }
    }
}