 import java.util.*;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        int start = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int vis = queue.poll();
            System.out.print(vis + " ");

            for (int adj : graph[vis]) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
    }
}
