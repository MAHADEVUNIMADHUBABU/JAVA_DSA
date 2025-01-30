package Graphs.Basics;

public class BipartiteCheck {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int[] color = new int[V];
        Arrays.fill(color, -1);

        for( int i = 0 ; i  < V ; i++){
            if( color[i] == -1){
                if( !(bipar( i , 0 , color , adj))) return false;
            }
        }

        return true;
    }

    private boolean bipar(int src, int c, int[] color, ArrayList<ArrayList<Integer>> adj){

        color[src] = c;

        for( int node : adj.get(src)){
            if( color[node] == -1){
                if(!(bipar( node , 1 - color[src] , color , adj))) return false;
            }
            else if( color[src] == color[node]) return false;
        }

        return true;
    }
}
