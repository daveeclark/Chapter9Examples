package com.week7;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
  public static void main(String[] args) {
    LinkedHashSet<String> demo = new LinkedHashSet<>();
    demo.add("A");
    demo.add("B");
    demo.add("C");
    demo.add("D");

    // Duplicates will not be added
    demo.add("A");
    demo.add("E");

    boolean exist = demo.contains("C");

    System.out.println(demo);
    System.out.println("Is the element 'C' present: " + exist);
    }
  }
