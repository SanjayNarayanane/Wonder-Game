import java.util.Scanner;

class Snake {
    String name;
    int startRow, startCol, endRow, endCol;
    boolean isVertical;

    public Snake(String name, int startRow, int startCol, int endRow, int endCol) {
        this.name = name;
        this.startRow = startRow;
        this.startCol = startCol;
        this.endRow = endRow;
        this.endCol = endCol;
        this.isVertical = startCol == endCol;
    }

    public boolean isInside(int row, int col) {
        if (isVertical) {
            return startRow <= row && row <= endRow && startCol == col;
        } else {
            return startRow == row && startCol <= col && col <= endCol;
        }
    }
}

public class SnakeAndPriest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Snake[] snakes = new Snake[M];

        for (int i = 0; i < M; i++) {
            String name = scanner.next();
            String[] startBlock = scanner.next().split(",");
            String[] endBlock = scanner.next().split(",");
            int startRow = Integer.parseInt(startBlock[0]);
            int startCol = Integer.parseInt(startBlock[1]);
            int endRow = Integer.parseInt(endBlock[0]);
            int endCol = Integer.parseInt(endBlock[1]);
            snakes[i] = new Snake(name, startRow, startCol, endRow, endCol);
        }

        String priestInput = scanner.next();
        char direction = priestInput.charAt(0);
        int row = Integer.parseInt(priestInput.substring(1));
        int col = (direction == 'E') ? N : 1;

        while (true) {
            if (direction == 'N') {
                row--;
            } else if (direction == 'S') {
                row++;
            } else if (direction == 'E') {
                col++;
            } else if (direction == 'W') {
                col--;
            }

            if (row < 1 || row > N) {
                row = (row < 1) ? 1 : N;
            }

            if (col < 1 || col > N) {
                col = (col < 1) ? 1 : N;
            }

            boolean isPriestAlive = true;

            for (Snake snake : snakes) {
                if (snake.isInside(row, col)) {
                    isPriestAlive = false;
                    System.out.println(snake.name + " " + row + "," + col);
                    break;
                }
            }

            if (!isPriestAlive) {
                break;
            }

            if (row == 1 && direction == 'N') {
                direction = 'S';
            } else if (row == N && direction == 'S') {
                direction = 'N';
            } else if (col == 1 && direction == 'W') {
                direction = 'E';
            } else if (col == N && direction == 'E') {
                direction = 'W';
            }
        }

        if (row == N) {
            System.out.println("NIRVANA");
        }
    }
}