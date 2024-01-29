import java.util.*;

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Queue {
    Node[] a;
    int front=-1;
    int rear=-1;

    public Queue(int n) {
        this.a = new Node[n];
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public void add(Node p) {
        if (front==-1) {
            front = 0;
            rear = 0;
        } else 
            rear++;
        a[rear] = p;
    }

    public Node remove() {
        Node p = a[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else
            front++;
        return p;
    }
}

class Main {
    public static void main(String[] arg) {
        Scanner x = new Scanner(System.in);
        int row = x.nextInt(), col = x.nextInt();
        int[][] a = new int[20][20];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                a[i][j] = x.nextInt();
        System.out.print(maxTime(row, col, a));
    }

    static int[][] ways = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public static int search(int x, int y, int m, int n, int[][] a) {
        boolean[][] visit = new boolean[20][20];
        int[][] pathlen = new int[20][20];
        Queue queue = new Queue(m * n);
        Node start = new Node(x, y);
        queue.add(start);
        visit[x][y] = true;

        while (!queue.isEmpty()) {
            Node p = queue.remove();
            for (int i = 0; i < 4; i++) {
                int x1 = p.x + ways[i][0];
                int y1 = p.y + ways[i][1];
                if (x1 >= 0 && x1 < m && y1 >= 0 && y1 < n && !visit[x1][y1] && a[x1][y1] == 0) {
                    pathlen[x1][y1] = pathlen[p.x][p.y] + 1;
                    visit[x1][y1] = true;
                    Node node = new Node(x1, y1);
                    queue.add(node);
                }
            }
        }

        return pathlen[m - 1][n - 1];
    }

    public static int maxTime(int m, int n, int[][] a) {
        int res = 0;
        res = search(0, 0, m, n, a);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    a[i][j] = 1;
                    len = search(0, 0, m, n, ways, a);
                    res = max(res, len);
                    a[i][j] = 0;
                }
            }
        }
        return res + 1;
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

}