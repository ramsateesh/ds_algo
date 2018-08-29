package com.interviewcake.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.interviewcake.linkedlist.LinkedList;
import com.interviewcake.linkedlist.LinkedListNode;

class DSUtilsTest {

	private LinkedList linkedList;

	@BeforeEach
	void setUp() throws Exception {
		linkedList = new LinkedList(new LinkedListNode(1));
		for (int i = 2; i <= 20; i++) {
			linkedList.addNode(new LinkedListNode(i));
		}
	}

	@Test
	void test() {

		Object[] before = linkedList.toArray();

		DSUtils.traverse(linkedList.getHead());
		linkedList.setHead(DSUtils.reverse(linkedList.getHead()));
		DSUtils.traverse(linkedList.getHead());
		
		Object[] after = linkedList.toArray();

		assertEquals(before.length, after.length);

		for (int i = 0; i < before.length; i++) {
			assertEquals(before[i], after[after.length - i - 1]);
		}

		linkedList = new LinkedList(null);
		before = linkedList.toArray();

		assertEquals(before.length, 0);
		DSUtils.traverse(linkedList.getHead());
		linkedList.setHead(DSUtils.reverse(linkedList.getHead()));
		DSUtils.traverse(linkedList.getHead());
		
		after = linkedList.toArray();

		assertEquals(before.length, after.length);
		for (int i = 0; i < before.length; i++) {
			assertEquals(before[i], after[after.length - i - 1]);
		}
	}

}
