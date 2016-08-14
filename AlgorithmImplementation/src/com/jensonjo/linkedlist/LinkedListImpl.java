package com.jensonjo.linkedlist;

public class LinkedListImpl {

	private Node head;
	private int size = 0;

	public void addAtEnd(int _data) {
		Node newNode = new Node(_data);
		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		size++;
	}

	public void addInFront(int _data) {
		Node newNode = new Node(_data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	public void display(LinkedListImpl list) {
		LinkedListImpl curr = list;
		while (curr.head.data != null) {
			System.out.println(curr.head.data);
			curr.head = curr.head.next;
		}

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedListImpl list = new LinkedListImpl();
		list.addAtEnd(10);
		list.addAtEnd(20);
		list.addAtEnd(30);
		list.addAtEnd(40);
		list.addInFront(5);
		list.addAtEnd(2);
		System.out.println("List created of size :" + list.getSize());
		list.display(list);
	}

	public int getSize() {
		return size;
	}
}
