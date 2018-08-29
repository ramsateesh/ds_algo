/**
 * 
 */
package com.interviewcake.linkedlist;

/**
 * @author talarira
 *
 */
public class LinkedListNode {
	
	private Integer value;
	private LinkedListNode next;

	public LinkedListNode() {
		super();
	}

	public LinkedListNode(Integer value) {
		this.setValue(value);
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

}
