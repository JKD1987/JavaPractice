import java.util.*;
class graph_BFS{
	private int V;
	private static LinkedList<Integer> adj[];
	boolean visited[];
	graph_BFS(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++)
			adj[i] = new LinkedList();
		this.visited = new boolean[v];
	}

	void add_edge(int u, int v){
		adj[u].add(v);
	}

	void BFS(int s){
		LinkedList<Integer> queue  =  new  LinkedList<Integer>();
		this.visited[s]=true;
		queue.add(s);
		while(queue.size() != 0){
			s=queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!this.visited[n]){
					this.visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String[] args){
		graph_BFS g = new graph_BFS(4);
		g.add_edge(0, 1);
		g.add_edge(0, 2);
		g.add_edge(1, 2);
		g.add_edge(2, 0);
		g.add_edge(2, 3);
		g.add_edge(3, 3);
		g.BFS(2);
	}
}