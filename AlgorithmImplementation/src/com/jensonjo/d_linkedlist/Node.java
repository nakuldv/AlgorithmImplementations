package com.jensonjo.d_linkedlist;

public class Node {
	Integer data;
	Node next, previous;

	Node(int _data) {
		data = new Integer(_data);
		next = null;
		previous = null;
	}
}
