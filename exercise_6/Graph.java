public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 13;
        int noEdges = 13;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Jap";
        myGraph.edge[0].dest = "Richael";
        

        // Edge 2
        myGraph.edge[1].src = "Jap";
        myGraph.edge[1].dest = "Ronelyn";

        // Edge 3
        myGraph.edge[2].src = "Jap";
        myGraph.edge[2].dest = "Luis";

        myGraph.edge[3].src = "Jap";
        myGraph.edge[3].dest = "Tristan";

        // Edge 4
        myGraph.edge[4].src = "Jap";
        myGraph.edge[4].dest = "Winna";


        // Edge 5
        myGraph.edge[5].src = "Jap";
        myGraph.edge[5].dest = "Marianne";

        // Edge 6
        myGraph.edge[6].src = "Jap";
        myGraph.edge[6].dest = "Rizjake";

        myGraph.edge[7].src = "jap";
        myGraph.edge[7].dest = "Florence";

        // Edge 7
        myGraph.edge[8].src = "jap";
        myGraph.edge[8].dest = "Neal";

        // Edge 8
        myGraph.edge[9].src = "Jap";
        myGraph.edge[9].dest = "Andrei";

        //Edge 9
        myGraph.edge[10].src = "Richael";
        myGraph.edge[10].dest = "Ronelyn";

        //Edge 10
        myGraph.edge[11].src = "Tristan";
        myGraph.edge[11].dest = "Luis";

        //Edge 11
        myGraph.edge[12].src = "Richael";
        myGraph.edge[12].dest = "Gab";

       

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}