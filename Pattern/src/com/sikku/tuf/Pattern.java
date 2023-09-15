package com.sikku.tuf;

public class Pattern {
    public static void main(String[] args) {
//        rectangularNumber(5);
        rectangularNumber(4);
    }

    public static void triangle1(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //star
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void triangle2(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void symmetryTriangle(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void patternBinary(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    public static void blankContainer(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 1;

            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
            }
            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(--count);
            }
            System.out.println();
        }
    }

    public static void alphabet(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //alphabet
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            ch--;

            //alphabet
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(--ch);
            }
            System.out.println();
        }
    }

    public static void alphabet1(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + (n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void blankTriangularRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void doubleTriangle(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                //star
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                //space
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print(" ");
                }
                //star
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                //star
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
                //space
                for (int j = 1; j <= 2 * (i - n); j++) {
                    System.out.print(" ");
                }

                //star
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void blankRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                //space
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rectangularNumber(int n) {
        int start = 1;
        int end = 2 * n - 1;
        int num = n;
        int[][] array = new int[end][end];
        for (int i = 1; i <= n; i++) {
            for (int k = start; k <= end; k++) {
                for (int j = start; j <= end; j++) {
                    if (k == start || k == end || j == start || j == end) {
//                        System.out.print(num);
                        array[k-1][j-1]=num;
                    }
                }
                System.out.println();
            }
            start++;
            end--;
            num--;
        }

        for (int i[]: array){
            for (int j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
