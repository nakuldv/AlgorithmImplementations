package com.jensonjo.d_linkedlist;

import com.jensonjo.linkedlist.LinkedListImpl;

public class D_LinkedList {
	Node head;

	public void addAtEnd(int _data) {
		Node new_node = new Node(_data);
		if (head == null) {
			head = new_node;
		} else {
			Node last = head;
			while (!(last.next == null)) {
				last = last.next;
			}
			new_node.previous = last;
			last.next = new_node;

		}
	}

	public void display(D_LinkedList list) {
		D_LinkedList curr = list;
		while (curr.head.data != null) {
			System.out.println(curr.head.data);
			curr.head = curr.head.next;
		}

	}

	public static void main(String[] args) {
		D_LinkedList list = new D_LinkedList();

		list.addAtEnd(10);
		list.addAtEnd(20);
		list.addAtEnd(30);
		list.addAtEnd(40);
		list.display(list);
		System.out.println("Done");

	}

}
