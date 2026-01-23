 
class Graph {
    int[][] adjmatrix;
    int numvertices;

    public Graph(int numvertices) {
        this.numvertices = numvertices;
        adjmatrix = new int[numvertices][numvertices];
    }

    public void addEdge(int i, int j) {
        adjmatrix[i][j] = 1;
        adjmatrix[j][i] = 1; // undirected graph
    }

    public void removeEdge(int i, int j) {
        adjmatrix[i][j] = 0;
        adjmatrix[j][i] = 0;
    }

    public void addVertex() {
        int[][] newAdj = new int[numvertices + 1][numvertices + 1];

        for (int i = 0; i < numvertices; i++) {
            for (int j = 0; j < numvertices; j++) {
                newAdj[i][j] = adjmatrix[i][j];
            }
        }

        adjmatrix = newAdj;
        numvertices++;
    }

    public void removeVertex(int v) {
        int[][] newAdj = new int[numvertices - 1][numvertices - 1];
        int newI = 0, newJ;

        for (int i = 0; i < numvertices; i++) {
            if (i == v) continue;

            newJ = 0;
            for (int j = 0; j < numvertices; j++) {
                if (j == v) continue;

                newAdj[newI][newJ] = adjmatrix[i][j];
                newJ++;
            }
            newI++;
        }

        adjmatrix = newAdj;
        numvertices--;
    }

    public void printGraph() {
        for (int i = 0; i < numvertices; i++) {
            for (int j = 0; j < numvertices; j++) {
                System.out.print(adjmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
