package Graphs.DSU;

/*
 used to get the minimum spanning tree of the Graph
 uses DSu,
 Sorts the graph by the weights in increasing order
 checks if two nodes   are already connected via same parent or not
 if not , adds weight and unions two nodes
 else ignores the weight of the node
*/

import java.util.*;

public class KruskalsAlgo {

    public int mst(int n ,int[][] graph){ // [] --> { a, b , wei} bidirectional edge between a and b

        Arrays.sort( graph , (a,b) -> a[2] - b[2]);

        DSU_BySize dsu = new DSU_BySize(n);
        int min = 0;

        for (int i = 0; i < graph.length; i++) {

            if (dsu.getParent(graph[i][0]) != dsu.getParent(graph[i][1])){
                min += graph[i][2];
                dsu.union(graph[i][0] , graph[i][1]);
            }
        }

        return min;
    }
}
