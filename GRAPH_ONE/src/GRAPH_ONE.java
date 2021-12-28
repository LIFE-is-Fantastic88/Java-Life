import java.util.LinkedList;
public class GRAPH_ONE {

	static class Graph{
		int V;
		LinkedList<Integer> arr[];
		public Graph(int V) {
			this.V=V;
			arr=new LinkedList[V];
			for(int z=0;z<V;z++) {
				arr[z]=new LinkedList<Integer>();
			}
		}
	}
	static void addEdge(Graph graph,int num1,int num2 ) {
		graph.arr[num1].addFirst(num2);
		graph.arr[num2].addFirst(num1);
	}
	
	static void printGraph(Graph graph) {
		
		for(int z=0;z<graph.arr.length;z++) {
			System.out.println("Adjacency list of vertex "+z);
			System.out.print("head ");
			for(int x=0;x<graph.arr[z].size();x++) {
				System.out.print("-> "+graph.arr[z].get(x));
			}
			System.out.println("\n");
		}
		
		
	}
	public static void main(String[] args) {
		 int V = 5;
		 Graph graph = new Graph(V);
	        addEdge(graph, 0, 1);
	        addEdge(graph, 0, 4);
	        addEdge(graph, 1, 2);
	        addEdge(graph, 1, 3);
	        addEdge(graph, 1, 4);
	        addEdge(graph, 2, 3);
	        addEdge(graph, 3, 4);
	        printGraph(graph);
	}

}
