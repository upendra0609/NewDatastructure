package com.sikku.Demo;

public class StackUsingArray<T> {
    private T[] array;
    private int topIndex = -1;

    public StackUsingArray() {
        this.array = (T[]) new Object[10];
    }

    public T push(T t) {
        if (topIndex == array.length - 1) {
            T[] newArray = (T[]) new Object[(int) (array.length * 1.5)];
            int i = 0;
            for (T t1 : this.array) {
                newArray[i] = t1;
                i++;
            }
            this.array = newArray;
        }
        return this.array[++topIndex] = t;
    }

    public T top() throws Exception {
        if (topIndex >= 0) {
            return this.array[topIndex];
        } else {
            throw new Exception("Empty Stack");
        }
    }

    public T pop() throws Exception {
        if (topIndex >= 0) {
            T ans = this.array[topIndex];
            this.array[topIndex] = null;
            topIndex -= 1;
            return ans;
        } else {
            throw new Exception("Empty Stack");
        }
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int size() {
        return topIndex + 1;
    }
}
