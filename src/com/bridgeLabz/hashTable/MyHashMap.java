package com.bridgeLabz.hashTable;

public class MyHashMap<K extends Comparable<K>, V> {
	
	MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}
	
	public V get(K key) {
		MyMapNode<K, V> myMapNode =  (MyMapNode<K, V>) this.myLinkedList.findNode(key);
		if (myMapNode == null )
			return null;
		else {
			return myMapNode.getValue();
		}
	}
	
	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.findNode(key);
		if (myMapNode == null ) {
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkedList.append(myMapNode);
		}			
		else {
			myMapNode.setValue(value);
		}		
	}
	
	public String toString() {
		return ("MyhashMapNodes { " + myLinkedList + "}");
	}

}
