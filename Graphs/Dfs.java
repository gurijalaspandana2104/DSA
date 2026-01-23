 import java.util.*;

class Dfs {
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

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        stack.push(start);

        while (!stack.isEmpty()) {
            int vis = stack.pop();

            if (!visited[vis]) {
                System.out.print(vis + " ");
                visited[vis] = true;

                for (int i = graph[vis].size() - 1; i >= 0; i--) {
                    stack.push(graph[vis].get(i));
                }
            }
        }
    }
}
