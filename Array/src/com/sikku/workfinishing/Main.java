package com.sikku.workfinishing;

public class Main {
    public static void main(String[] args) {
        int[] array = {33, 55, 2, 7, 1, 9, 4, 115};

//        int n = minimumTime(array, 1);
//        System.out.println(n);

        System.out.println(noOfWorker(array, 33));

    }

    public static int minimumTime(int[] array, int worker) {
        int minimumTime = max(array);
        int maximumTime = sum(array);
        int mid = (minimumTime + maximumTime) / 2;


        while (minimumTime <= maximumTime) {
            int wor = noOfWorker(array, mid);
            if (wor < worker) {
                maximumTime = mid - 1;
            } else if (wor > worker) {
                minimumTime = mid + 1;
            } else {
                break;
            }
            mid = (minimumTime + maximumTime) / 2;
        }

        int time = mid;

        if (mid <= max(array)) {
            return max(array);
        }


        while (true) {
            int wor = noOfWorker(array, time);
            if (wor != worker) {
                time++;
                break;
            } else if (time == max(array)) {
                break;
            }
            time--;
        }
        return time;
    }

    public static int noOfWorker(int[] array, int time) {

        int worker = 0;
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            if (t == time) {
                i--;
                worker++;
                t = 0;
            } else if (t > time && i != 0) {
                i -= 2;
                worker++;
                t = 0;
            } else {
                t += array[i];
            }
        }

        if (t <= time) {
            worker++;
        } else {
            worker += 2;
        }

        return worker;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
