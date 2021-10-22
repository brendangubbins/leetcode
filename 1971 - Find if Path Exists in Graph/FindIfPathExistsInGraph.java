class Solution {
  public boolean validPath(int n, int[][] edges, int start, int end) {
    if (start == end) {
      return true;
    }
    
    List<Integer>[] adj = new List[n];
    boolean[] seen = new boolean[n];
    
    for (int i = 0; i < n; i++) {
      adj[i] = new LinkedList<>();
    }
    
    for (int i = 0; i < edges.length; i++) {
      adj[edges[i][0]].add(edges[i][1]);
      adj[edges[i][1]].add(edges[i][0]);
    }
    
    return dfs(adj, seen, start, end);
  }
  
  public boolean dfs(List<Integer>[] adj, boolean[] seen, int start, int end) {
    if (seen[start]) {
      return false;
    }
    
    seen[start] = true;
    
    for (int i = 0; i < adj[start].size(); i++) {
      if (adj[start].get(i) == end) {
        return true;
      }
      if (dfs(adj, seen, adj[start].get(i), end)) {
        return true;
      }
    }
    
    return false;
  }
}
