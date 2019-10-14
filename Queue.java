package com.week7;

public interface Queue<E> {
  void add (E element);
  E remove();
  int size();
}
