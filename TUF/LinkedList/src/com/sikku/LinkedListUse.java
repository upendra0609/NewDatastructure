package com.sikku;

import java.util.HashSet;
import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        n1.next = n2;
        Node<Integer> n3 = new Node<>(30);
        n2.next = n3;
        Node<Integer> n4 = new Node<>(40);
        n3.next = n4;
        n4.next = new Node<>(50);
        return n1;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void printRecursive(Node<Integer> head) {
        if (head != null) {
            System.out.println(head.data);
            printRecursive(head.next);
        }
    }

    public static void reversePrintRecursive(Node<Integer> head) {
        if (head != null) {
            printRecursive(head.next);
            System.out.println(head.data);
        }
    }

    public static Node<Integer> reverse(Node<Integer> head) {
        Node<Integer> newHead = null;
        while (head != null) {
            Node<Integer> next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static Node<Integer> reverseRecursive(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            Node<Integer> smallHead = reverseRecursive(head.next);
            head.next.next = head;
            head.next = null;
            return smallHead;
        }
    }

    public static int get(Node<Integer> head, int position) {
        Node<Integer> temp = head;
        int i = 0;
        int result = 0;
        while (temp != null) {
            if (i == position) {
                result = temp.data;
                break;
            }
            i++;
            temp = temp.next;
        }
        return result;
    }

    public static void increment(Node<Integer> head) {
        while (head != null) {
            head.data++;
            head = head.next;
        }
    }

    public static int size(Node<Integer> head) {
        int n = 0;
        Node<Integer> temp = head;
        while (temp.next != null) {
            n++;
            temp = temp.next;
        }
        return n;
    }

    public static Node<Integer> insert(Node<Integer> head, int value, int position) {
        if (position == 0) {
            Node<Integer> n = new Node<>(value);
            n.next = head;
            //returning new head
            return n;
        }

        Node<Integer> temp = head;
        int tempPosition = 1;
        while (tempPosition <= position && temp != null) {
            if (position == tempPosition) {
                Node<Integer> n = new Node<>(value);
                n.next = temp.next;
                temp.next = n;
                return head;
            }
            tempPosition++;
            temp = temp.next;
        }
        return head;
    }

    public static Node<Integer> insertRecursive(Node<Integer> head, int value, int position) {
        if (position == 0) {
            Node<Integer> n = new Node<>(value);
            n.next = head;
            //returning new head
            return n;
        } else {
            if (head != null) {
                //most important line head.next
                head.next = insertRecursive(head.next, value, position - 1);
            }
            return head;
        }
    }

    public static Node<Integer> deleteNode(Node<Integer> head, int position) {
        if (position == 0) {
            return head.next;
        }

        Node<Integer> temp = head;
        int tempPosition = 1;
        while (tempPosition <= position && temp != null) {
            if (position == tempPosition) {
                temp.next = temp.next.next;
                return head;
            }
            tempPosition++;
            temp = temp.next;
        }
        return head;
    }

    public static Node<Integer> takeInput() {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        Node<Integer> head = null;
        Node<Integer> tail = null;

        while (num != -1) {
            Node<Integer> node = new Node<>(num);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
            System.out.println("Enter number");
            num = sc.nextInt();
            count++;
        }
//        System.out.println(count);
        return head;
    }

    public static boolean linkedListCycle(Node<Integer> head) {
        HashSet<Node<Integer>> hash = new HashSet<>();
        while (head.next != null) {
            if (!hash.contains(head)) {
                hash.add(head);
                head = head.next;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean linkedListCycleOptimal(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static int lengthOfLoop(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = slow.next;
                int count = 1;
                while (slow != fast) {
                    slow = slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    public static Node<Integer> oddEvenValueList(Node<Integer> head) {
        Node<Integer> oddHead = head;
        Node<Integer> evenHead = head;
        while (oddHead != null && oddHead.data % 2 == 0) {
            oddHead = oddHead.next;
        }

        while (evenHead != null && evenHead.data % 2 != 0) {
            evenHead = evenHead.next;
        }

        Node<Integer> tempEven = evenHead;
        Node<Integer> tempOdd = oddHead;
        Node<Integer> i = oddHead;
        Node<Integer> j = evenHead;

        while (j != null && i != null) {
            j = j.next;
            i = i.next;

            while (i != null && i.data % 2 == 0) {
                i = i.next;
            }

            while (j != null && j.data % 2 != 0) {
                j = j.next;
            }
            if (i != null) {
                oddHead.next = i;
                oddHead = i;
            }

            if (j != null) {
                evenHead.next = j;
                evenHead = j;
            }
        }
        oddHead.next = tempEven;
        evenHead.next = null;
        return tempOdd;
    }

    public static Node<Integer> removeNthFromEnd(Node<Integer> head, int n) {
        if (head == null || head.next == null) return null;

        Node<Integer> slow = head;
        Node<Integer> fast = head;
        int count = 1;
        while (count <= n && fast != null) {
            fast = fast.next;
            count++;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow != null) {
            slow.next = slow.next.next;
        }
        return head;
    }

    public static Node<Integer> sort(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> middle = middle(head);
        Node<Integer> left = head;
        Node<Integer> right = middle.next;
        middle.next = null;
        left = sort(left);
        right = sort(right);
        return mergeTwoSorted(left, right);
    }

    public static Node<Integer> middle(Node<Integer> head) {
        Node<Integer> slow = null;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            if (slow == null) {
                slow = head;
            } else {
                slow = slow.next;
            }
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> mergeTwoSorted(Node<Integer> first, Node<Integer> second) {
        Node<Integer> tempHead = null;
        Node<Integer> head = null;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                if (head == null) {
                    head = first;
                } else {
                    head.next = first;
                    head = head.next;
                }
                first = first.next;
            } else {
                if (head == null) {
                    head = second;
                } else {
                    head.next = second;
                    head = head.next;
                }
                second = second.next;
            }
            if (tempHead == null) {
                tempHead = head;
            }
        }

        if (head != null && first != null) {
            head.next = first;
        }
        if (head != null && second != null) {
            head.next = second;
        }
        return tempHead;
    }

    public static Node<Integer> sortListZeroOneTwo(Node<Integer> head) {
        if (head == null || head.next == null) return head;

        Node<Integer> zero = null;
        Node<Integer> zeroHead = null;
        Node<Integer> one = null;
        Node<Integer> oneHead = null;
        Node<Integer> two = null;
        Node<Integer> twoHead = null;

        while (head != null) {
            if (head.data == 0) {
                if (zero == null) {
                    zero = head;
                    zeroHead = zero;
                } else {
                    zero.next = head;
                    zero = zero.next;
                }
            } else if (head.data == 1) {
                if (one == null) {
                    one = head;
                    oneHead = one;
                } else {
                    one.next = head;
                    one = one.next;
                }
            } else {
                if (two == null) {
                    two = head;
                    twoHead = two;
                } else {
                    two.next = head;
                    two = two.next;
                }
            }

            head = head.next;
        }
        if (zero != null) {
            zero.next = oneHead;
        }
        if (one != null) {
            one.next = twoHead;
        }
        if (two != null) {
            two.next = null;
        }
        return zeroHead;
    }

    public static void main(String[] args) {
//        Node<Integer> head = createLinkedList();
//        increment(head);
//        print(head);
//        System.out.println(size(head));

//        System.out.println(print(head, 2));
//        Node<Integer> head = takeInput();
//        head = insert(head, 1, 5);
//        print(head);
//        head = insert(head, 1, 16);
//        head = deleteNode(head, 14);
//        print(head);
//        printRecursive(head);

//        Node<Integer> n = null;
//
//        head = insertRecursive(n, 12, 2);
//        print(head);
//        head = reverseRecursive(head);
//        Node<Integer> head = takeInput();
//        print(head);
//        head = removeNthFromEnd(head, 2);

//        Node<Integer> first = takeInput();
//        Node<Integer> second = takeInput();
//        Node<Integer> head = mergeTwoSorted(first, second);

        Node<Integer> head = takeInput();
//        head = middle(head);
        head = sortListZeroOneTwo(head);
//        System.out.println(head.data);
        print(head);


    }
}
