package com.sikku;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee e) {
//        System.out.println(this.id);
//        System.out.println(e.id);
        if (this.id > e.id) {
            return 1;
        } else if (this.id < e.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(11, "aaa");
        Employee e2 = new Employee(22, "bbb");
        Employee e3 = new Employee(33, "ccc");

//        TreeSet<Employee> t = new TreeSet<>();
//        t.add(e1);
//        t.add(e2);
//        t.add(e3);


        PriorityQueue<Employee> p = new PriorityQueue<>(Employee::compareTo);
        p.add(e1);
        p.add(e3);
        p.add(e2);

        for (Employee e : p) {
            System.out.println(e);
        }

    }
}
