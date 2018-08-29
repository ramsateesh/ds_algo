package com.interviewcake.utils;

import com.interviewcake.linkedlist.LinkedListNode;

public class DSUtils {

	public static LinkedListNode reverse(LinkedListNode head) {
		LinkedListNode previous = null;
		LinkedListNode node = head;
		LinkedListNode tempNode = null;
		
//		do {
//			tempNode = node.getNext();
//			node.setNext(previous);
//			previous = node;
//			node = tempNode;
//		} while(node.getNext() != null);		
		
		while(node != null) {
			tempNode = node.getNext();
			node.setNext(previous);
			previous = node;
			node = tempNode;
		}
		
		return previous;
	}
	
	public static void traverse(LinkedListNode node) {
		while(node != null) {
			System.out.print(node.getValue()+" --> ");
			node = node.getNext();
		} 
		
		System.out.println("null");
	}

}
