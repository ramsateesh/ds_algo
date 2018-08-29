/**
 * 
 */
package com.interviewcake.linkedlist;

import java.util.ArrayList;

/**
 * @author talarira
 *
 */
public class LinkedList {

	private LinkedListNode head;

	public LinkedList(LinkedListNode head) {
		this.head = head;
	}

	public LinkedListNode getHead() {
		return head;
	}

	public void addNode(LinkedListNode node) {
		node.setNext(null);
		LinkedListNode tNode = head;
		while(tNode.getNext() != null) {
			tNode = tNode.getNext();
		}
		tNode.setNext(node);
	}

	public Object[] toArray() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedListNode node = head;
		while(node!=null) {
			list.add(node.getValue());
			node = node.getNext();
		}
		return list.toArray();
	}

	public void setHead(LinkedListNode newHead) {
		this.head = newHead;
	}

}
