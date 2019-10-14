package com.week7;

import java.time.LocalDate;
import java.util.*;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> products = new HashMap<>();
    products.put("Notebook",1000);
    products.put("Phone",2000);
    products.put("Keyboard", 3000);

    for (Map.Entry<String, Integer> product : products.entrySet()) {
      System.out.println(product);
    }

    SortedMap<LocalDate, String> events = new TreeMap<>();
    events.put(LocalDate.of(2019,10,10), "Today");
    events.put(LocalDate.of(2019,10,9), "Yesterday");
    events.put(LocalDate.of(2019,10,11), "Tomorrow");

    LocalDate fromInclusive = LocalDate.of(2019,10,9);
    LocalDate fromExclusive = LocalDate.of(2019,10,11);

    System.out.println(events.subMap(fromInclusive, fromExclusive));

    LinkedList<Integer> numbers = new LinkedList<>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);

    System.out.println(numbers);

  }

}

