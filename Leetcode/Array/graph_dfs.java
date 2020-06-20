package leetcode.Array;

import java.util.Iterator;
import java.util.LinkedList;

public class graph_dfs {
	int vert;
	static boolean[] visited; 
	LinkedList< Integer> list[];
	graph_dfs(int vert){
		visited = new boolean[vert];
		this.vert = vert;
		list = new LinkedList[vert];
		for(int i = 0; i < vert; i++) {
			list[i] = new LinkedList();
		}
	}
	void DFSUtils(int v, boolean[] visited) {
		visited[v] = true;
		System.out.println(v);
		Iterator<Integer> i = list[v].listIterator();
		while(i.hasNext()) {
			int next = i.next();
			if(!visited[next]) {
				DFSUtils(next, visited);
			}
		}
	}
//	void DFS(int v) {
	//	DFSUtils(v, visited);
//	}
	void addEdge(int v, int w) {
		list[v].add(w);  
	}
	public static void main(String[] args) {
		graph_dfs dfs = new graph_dfs(4);
        dfs.addEdge(0, 1); 
        dfs.addEdge(0, 2); 
        dfs.addEdge(1, 2); 
        dfs.addEdge(2, 0); 
        dfs.addEdge(2, 3); 
        dfs.addEdge(3, 3); 
		
        dfs.DFSUtils(2, visited);
	}

}
