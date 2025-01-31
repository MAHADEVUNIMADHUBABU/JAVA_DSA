package Graphs.DSU;

import java.util.Arrays;

public class DSU_BySize {

    int[] size, parent;

    DSU_BySize(int n){   // for 0 to n-1 node
        size = new int[n];
        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
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

        if ( size[p1] > size[p2]){
            parent[p2] = p1;
            size[p1] += size[p2];
        }
        else {
            parent[p1] = p2;
            size[p2] += size[p1];
        }
    }
}
