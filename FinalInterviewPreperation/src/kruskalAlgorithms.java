/**
 * Created by Amit on 6/15/15.
 */



import java.util.*;

public class kruskalAlgorithms {

    public int number_of_vertices;
    private List<Edge> edges;
    public int visited[];
    public int[][] spanningTree;

    // create graph
    public kruskalAlgorithms(int number_of_vertices){
        this.number_of_vertices = number_of_vertices;
        edges = new LinkedList<Edge>();
        visited = new int[number_of_vertices+1];
        spanningTree = new int[number_of_vertices+1][number_of_vertices+1];
    }

    public void kruksAlgo(int [][] matrix){
        for(int source =1;source<=number_of_vertices;source++){
            for(int destination = 1; destination<=number_of_vertices;destination++){
                if(matrix[source][destination]!=999){
                    Edge e = new Edge();
                    e.sourceVertex = source;
                    e.destinationVertex = destination;
                    e.weight = matrix[source][destination];
                    matrix[destination][source] = 999;
                    edges.add(e);
                }
            }
        }
        Collections.sort(edges, new Edgeomparator());



    }

    public static void main(String[] args){
        int adjancy_matrix[][];
        int number_of_vertices;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Vertices");
        number_of_vertices = scan.nextInt();

        adjancy_matrix = new int[number_of_vertices+1][number_of_vertices+1];
        System.out.println("Enter Weight matrix for the graph");
        for(int i=0;i<number_of_vertices;i++){
            for(int j=0;j<number_of_vertices;j++){
                adjancy_matrix[i][j] = scan.nextInt();

                if(i==j){
                    adjancy_matrix[i][j] = 0;
                    continue;

                }

                if(adjancy_matrix[i][j] == 0){
                    adjancy_matrix[i][j] = 999;
                }
            }
        }
        scan.close();
        kruskalAlgorithms kruks = new kruskalAlgorithms(number_of_vertices);
        kruks.kruksAlgo(adjancy_matrix);



    }

    class Edge{
        int sourceVertex;
        int destinationVertex;
        int weight;

    }

    class Edgeomparator implements Comparator <Edge> {


        @Override
        public int compare(Edge o1, Edge o2) {
            if (o1.weight < o2.weight) {
                return -1;
            }
            if (o1.weight > o2.weight) {
                return 1;
            }
            return 0;
        }
    }





}

