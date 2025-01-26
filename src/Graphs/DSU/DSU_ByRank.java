package Graphs.DSU;

import java.util.Arrays;

public class DSU_ByRank {

    int[] rank, parent;

    DSU_ByRank(int n){   // for 0 to n-1 node
        rank = new int[n];
        parent = new int[n];

        Arrays.fill(rank,1);

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int getParent(int node){
        if(parent[node] == node) return node;
        return parent[node] = getParent(parent[node]);
    }

    void union(int node1 , int node2){

        int p1 = getParent(node1);
        int p2 = getParent(node2);

        if( p1 == p2) return;

        if ( rank[p1] > rank[p2]){
            parent[p2] = p1;
            rank[p1] += rank[p2];
        }
        else{
            parent[p1] = p2;
            rank[p2] += rank[p1];
        }
    }
}
