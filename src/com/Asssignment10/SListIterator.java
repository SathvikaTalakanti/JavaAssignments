package com.Asssignment10;

public class SListIterator
{
  SList list;
  public SListIterator(SList head)
  {
      list=head;
  }
  public void add(int data)
  {
      Node node=new Node(data);
      node.next=null;
      if(list.head==null)
      {
          list.head=node;
      }
      else
      {
          Node last=list.head;
          while(last.next!=null)
          {
               last =last.next;
          }
          last.next=node;
      }
  }
  public void delete(int val)
  {

      Node curr = list.head, prev = null;

      if (curr != null && curr.data== val) {
          list.head = curr.next; // Changed head
          System.out.println(val + " found and deleted");
          return;
      }
      while (curr != null && curr.data != val) {
          prev = curr;
          curr = curr.next;
      }
      if (curr != null) {
          prev.next = curr.next;
          System.out.println(val+ " found and deleted");
      }
      if (curr == null) {
          System.out.println(val + " not found");
      }
      return ;
  }
}
