import java.util.*;

public class WebPageClicks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of web pages
        List<Integer>[] adjList = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            int L = scanner.nextInt(); // Number of links on this page
            adjList[i] = new ArrayList<>();
            for (int j = 0; j < L; j++) {
                int linkedPage = scanner.nextInt();
                adjList[i].add(linkedPage);
            }
        }

        int startPage = scanner.nextInt();
        int endPage = scanner.nextInt();
        scanner.close();

        int minClicks = findMinClicks(adjList, startPage, endPage);

        if (minClicks == -1) {
            System.out.println("-1");
        } else {
            System.out.println(minClicks);
        }
    }

    static int findMinClicks(List<Integer>[] adjList, int startPage, int endPage) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adjList.length];
        int[] clicks = new int[adjList.length];

        queue.add(startPage);
        visited[startPage] = true;

        while (!queue.isEmpty()) {
            int currentPage = queue.poll();

            if (currentPage == endPage) {
                return clicks[currentPage];
            }

            for (int linkedPage : adjList[currentPage]) {
                if (!visited[linkedPage]) {
                    queue.add(linkedPage);
                    visited[linkedPage] = true;
                    clicks[linkedPage] = clicks[currentPage] + 1;
                }
            }
        }

        return -1; // If end page cannot be reached from the start page
    }
}