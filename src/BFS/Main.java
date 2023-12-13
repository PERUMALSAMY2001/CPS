package BFS;

public class Main {

	public static void main(String[] args) {
		        Graph g = new Graph(8);
		        g.addEdge(7, 1);
		        g.addEdge(5, 3);
		        g.addEdge(7, 6);
		        g.addEdge(2, 5);
		        g.addEdge(6, 1);
		        g.addEdge(2, 5);
		        g.addEdge(7, 6);
		 
		        System.out.println("Following is Breadth First Traversal "
			            + "(starting from vertex 7)");
		            
		 
		        g.BFS(2);
		    }

	}