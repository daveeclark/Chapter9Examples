package com.week7;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
  public static void main(String[] args) {
    Map<String, Employee> staff = new HashMap<>();
    staff.put("144-25-5464", new Employee("Amy Lee"));
    staff.put("567-24-2546", new Employee("Harry Hacker"));
    staff.put("157-62-7935", new Employee("Gary Copper"));
    staff.put("456-62-5527", new Employee("Francesa Cruz"));

    System.out.println(staff);

    staff.remove("567-24-2546");

    staff.put("456-62-5527", new Employee("Francesa Miller"));

    System.out.println(staff.get("157-62-7935"));

    staff.forEach((k, v) ->
      System.out.println("key=" +k + ", value=" + v));
  }
}
