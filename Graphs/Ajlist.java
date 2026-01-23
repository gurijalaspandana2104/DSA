 import java.util.*;

class AdjacencyListGraph {

    private Map<Integer, List<Integer>> adj;

    public AdjacencyListGraph() {
        adj = new HashMap<>();
    }

    // Add vertex
    public void addVertex(int v) {
        adj.putIfAbsent(v, new ArrayList<>());
    }

    // Remove vertex
    public void removeVertex(int v) {
        adj.remove(v);
        for (List<Integer> neighbors : adj.values()) {
            neighbors.remove(Integer.valueOf(v));
        }
    }

    // Add edge (undirected)
    public void addEdge(int u, int v) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.putIfAbsent(v, new ArrayList<>());
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Remove edge
    public void removeEdge(int u, int v) {
        if (adj.containsKey(u)) adj.get(u).remove(Integer.valueOf(v));
        if (adj.containsKey(v)) adj.get(v).remove(Integer.valueOf(u));
    }

    // Print graph
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> e : adj.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    // BFS (iterative)
    public void bfs(int start) {
        if (!adj.containsKey(start)) return;

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int nei : adj.get(node)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    q.add(nei);
                }
            }
        }
        System.out.println();
    }

    // DFS (iterative)
    public void dfsIterative(int start) {
        if (!adj.containsKey(start)) return;

        Set<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.push(start);

        while (!st.isEmpty()) {
            int node = st.pop();
            if (visited.contains(node)) continue;

            visited.add(node);
            System.out.print(node + " ");
            for (int nei : adj.get(node)) {
                if (!visited.contains(nei)) {
                    st.push(nei);
                }
            }
        }
        System.out.println();
    }

    // DFS (recursive)
    public void dfsRecursive(int start) {
        Set<Integer> visited = new HashSet<>();
        dfs(start, visited);
        System.out.println();
    }

    private void dfs(int node, Set<Integer> visited) {
        if (!adj.containsKey(node) || visited.contains(node)) return;

        visited.add(node);
        System.out.print(node + " ");
        for (int nei : adj.get(node)) {
            dfs(nei, visited);
        }
    }
}
