package com.bridgeLabz.hashTable;

public class MyLinkedList<K extends Comparable <K>> {

	INode<K> head;
	INode<K> tail;

//	public static void main(String args[]) {
//
//		MyLinkedList<Integer> addLinkedList = new MyLinkedList<>();
//		MyLinkedList<Integer> appendLinkedList = new MyLinkedList<>();
//		MyLinkedList<Integer> addInBetweenLinkedList = new MyLinkedList<>();
//
//		INode<Integer> node1 = new MyNode<>(56);
//		INode<Integer> node2 = new MyNode<>(30);
//		INode<Integer> node3 = new MyNode<>(70);
//
//		addLinkedList.add(node3);
//		addLinkedList.add(node2);
//		addLinkedList.add(node1);
//
//		appendLinkedList.append(node1);
//		appendLinkedList.append(node2);
//		appendLinkedList.append(node3);
//
//		addInBetweenLinkedList.add(node3);
//		addInBetweenLinkedList.add(node1);
//		addInBetweenLinkedList.addInBetween(node2, node3);
//
//		addLinkedList.printNode();
//
//		appendLinkedList.printNode();
//
//		addInBetweenLinkedList.printNode();
//
//	}

	public void add(INode<K> newNode) {

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}

	}

	public void append(INode<K> newNode) {

		if (tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = tail.getNext();
		}

	}

	public void addInBetween(INode<K> newNode, INode<K> prevNode) {

		INode<K> tempNode = head;

		while (tempNode != null) {

			if (tempNode.getKey().equals(prevNode.getKey())) {
				INode nextNode = tempNode.getNext();
				newNode.setNext(nextNode);
				tempNode.setNext(newNode);
			}

			tempNode = tempNode.getNext();
		}

	}

	public void pop() {
		head = head.getNext();
	}

	public void popLast() {

		INode<K> tempNode = head;

		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}

		tempNode.setNext(null);

		tail = tempNode;

	}

	public INode findNode(K key) {

		INode<K> tempNode = head;

		while (tempNode != null) {

			if (tempNode.getKey().equals(key))
				return tempNode;

			tempNode = tempNode.getNext();
		}

		return null;
	}

	public int size() {

		int size = 0;

		INode<K> tempNode = head;

		while (tempNode != null) {

			tempNode = tempNode.getNext();
			size++;
		}

		return size;

	}

	public void deleteNode(INode node) {

		if (tail.equals(node)) {
			popLast();
		} else {
			INode<K> tempNode = head;

			while (tempNode.getNext() != node) {
				tempNode = tempNode.getNext();
			}

			INode nextNode = tempNode.getNext().getNext();

			tempNode.setNext(nextNode);
		}

	}
	
	public void addSortedOrder(INode<K> newNode) {
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else if(head.getNext() == null) {
			if (head.getKey().compareTo(newNode.getKey()) > 0) {
				add(newNode);
			}
			else {
				append(newNode);
			}
			
		}
		else if (head.getKey().compareTo(newNode.getKey()) > 0) {
			add(newNode);
		}
		else {
			INode<K> tempNode = head;
			INode<K> prevNode = head;

			while (tempNode != null) {
				
				if (tempNode.getKey().compareTo(newNode.getKey()) > 0) {
					addInBetween(newNode, tempNode);
					break;
				}
				
				System.out.println(tempNode.getKey());
				tempNode = tempNode.getNext();
			}
		}
		
	}

	public void printNode() {

		INode<K> tempNode = head;
		while (tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + " -> ");
			tempNode = tempNode.getNext();
		}

		System.out.println(tempNode.getKey());

	}

}
