import java.util.Iterator;
import java.util.LinkedList;

public class GRAPH_TWO {

	static class Graph {
		int sum;
		LinkedList<Integer>arr[];
		
		public Graph(int sum) {
			this.sum=sum;
			arr=new LinkedList[sum];
			for(int z=0;z<sum;z++) {
				arr[z]=new LinkedList();
			}
		}
		void addEdge(int num1,int num2) {
			arr[num1].add(num2);
		}
		void BFS(int start) {
			
			boolean visited[]=new boolean[sum];
			LinkedList<Integer>latest=new LinkedList<Integer>();
			
			visited[start]=true;
			latest.add(start);
			while(latest.size()!=0) {
				int s=latest.poll();
				System.out.print(" "+s);
				
				Iterator<Integer> check=arr[s].listIterator();
				while(check.hasNext()) {
					int y=check.next();
					if(visited[y]==false) {
						visited[y]=true;
						latest.add(y);
					}
				}
			}
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Graph g = new Graph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);

	}

}
