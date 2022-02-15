package com.Asssignment10;

public class SList
{
  Node head;
  public String toString()
  {
      return "SList{"+"head="+head+'}';
  }
  public SListIterator iterator()
  {
      return new SListIterator(this);
  }
}
