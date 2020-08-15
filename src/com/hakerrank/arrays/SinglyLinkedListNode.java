package com.hakerrank.arrays;

public class SinglyLinkedListNode {
	
	int data;
	
	SinglyLinkedListNode next;
	
	public SinglyLinkedListNode(int data, SinglyLinkedListNode node) {
		super();
		this.data = data;
		this.next = node;
	}

	
	@Override
	public String toString() {
		return "SinglyLinkedListNode [data=" + data + ", next=" + next + "]";
	}
	
	
}
