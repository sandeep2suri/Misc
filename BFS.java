import java.util.*;

public class BFS {
	private static int V;	// no. of vertices
	private static LinkedList<Integer> []graph;
	
	public BFS(int i) {
		V = i;
		graph = new LinkedList[V];
		for (int l=0; l<V; ++l)
			graph[l] = new LinkedList<Integer>();
	}

	public static void main(String[] args) {
		BFS g = new BFS(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        doBFS(2); 
	}
	
	private void addEdge(int v1, int v2) {
		graph[v1].add(v2);
	}
	
	private static void doBFS(int v) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> edgeConnections = new LinkedList<Integer>();
		
		int c = v;
		do {
			if (visited[c] == false) {
				System.out.print(c + ", ");
				visited[c] = true;
				LinkedList<Integer> l = graph[c];
				while(l.isEmpty() != true) {
					edgeConnections.add(l.pop());
				}
			}
			if (edgeConnections.isEmpty() == true)
				break;
			
			c = edgeConnections.pop();
		} while(true);
	}
}
