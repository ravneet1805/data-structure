// 5. Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.


class CircularTour {
    static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0, totalSurplus = 0, surplus = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];
            totalSurplus += petrol[i] - distance[i];

            if (surplus < 0) {
                start = i + 1;
                surplus = 0;
            }
        }

        return (totalSurplus >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPump(petrol, distance);
        System.out.println("Start at petrol pump: " + start);
    }
}
