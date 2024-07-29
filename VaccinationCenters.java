import java.util.Arrays;
import java.util.Scanner;

public class VaccinationCenters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt(); // Average time for the first center
        int m2 = sc.nextInt(); // Average time for the second center
        int N = sc.nextInt(); // Number of villages in the constituency
        int[] populations = new int[N]; // Population of villages

        for (int i = 0; i < N; i++) {
            populations[i] = sc.nextInt();
        }

        // Create an array of villages with their populations and sort them in descending order
        Village[] villages = new Village[N];
        for (int i = 0; i < N; i++) {
            villages[i] = new Village(i, populations[i]);
        }
        Arrays.sort(villages, (v1, v2) -> Integer.compare(v2.population, v1.population));

        // Initialize the total time for each center
        long total_time_center1 = 0;
        long total_time_center2 = 0;

        // Assign villages to centers to minimize the total time
        for (Village village : villages) {
            if (total_time_center1 <= total_time_center2) {
                total_time_center1 += (long) village.population * m1;
            } else {
                total_time_center2 += (long) village.population * m2;
            }
        }

        // The maximum time taken is the answer
        long answer = Math.max(total_time_center1, total_time_center2);
        System.out.print(answer);
    }

    static class Village {
        int index;
        int population;

        public Village(int index, int population) {
            this.index = index;
            this.population = population;
        }
    }
}