import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader br;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        List<Task> tasks = new ArrayList<>();
        Map<Integer, Integer> times = new HashMap<>();

        int n = getInt();
        int timeNeeded = getInt();


        for (int i = 0; i < n; i++) {
            int startTime = getInt();
            boolean special = getInt() == 1;
            tasks.add(new Task(special, startTime, i, timeNeeded));
        }


        PriorityQueue<Task> queue = new PriorityQueue<>(new TaskComparator());

        int currentIndex = 0;
        Task currentTask = null;
        int minute = 0;


        while (currentIndex < tasks.size() || !queue.isEmpty() || currentTask != null) {


            while (currentIndex < tasks.size() && tasks.get(currentIndex).getTi() <= minute) {
                queue.add(tasks.get(currentIndex));
                currentIndex++;
            }

            if (currentTask == null && !queue.isEmpty()) {
                currentTask = queue.poll();
            }


            if (currentTask != null) {
                currentTask.timeLeft--;

                if (currentTask.timeLeft == 0) {
                    times.put(currentTask.getIndex(), minute + 1);
                    currentTask = null;
                }
            }

            minute++;
        }


        for (int i = 0; i < n; i++) {
            System.out.print(times.get(i) + " ");
        }
    }

    public static int getInt() {
        int toReturn = 0;
        try {
            int c = toReturn;
            boolean neg = false;
            boolean done = false;
            while ((c = br.read()) != -1) {
                if (c == '-') neg = true;
                if (c < 48 || c > 57) continue;
                c = c - 48;
                int d = 0;
                while ((d = br.read()) != -1) {
                    if (!(d < 48 || d > 57)) c = c * 10 + (d - 48);
                    else {
                        done = true;
                        break;
                    }
                }
                if (done) break;
            }
            if (neg) toReturn = -c;
            else toReturn = c;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return toReturn;
    }


    private static class Task {
        private boolean isSpecial;
        private int ti;
        private int index;
        private int timeLeft;

        public Task(boolean isSpecial, int ti, int index, int timeLeft) {
            this.isSpecial = isSpecial;
            this.ti = ti;
            this.index = index;
            this.timeLeft = timeLeft;
        }

        public boolean isSpecial() {
            return isSpecial;
        }

        public int getTi() {
            return ti;
        }

        public int getIndex() {
            return index;
        }
    }

    private static class TaskComparator implements Comparator<Task> {
        @Override
        public int compare(Task o1, Task o2) {
            if (o1.isSpecial() && !o2.isSpecial()) return -1;
            if (!o1.isSpecial() && o2.isSpecial()) return 1;
            return o1.getIndex() - o2.getIndex();
        }
    }
}
