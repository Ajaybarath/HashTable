package com.bridgeLabz.hashTable;

public class MyMapNode<K, V> implements INode<K> {
	
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}
	
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	public void setValue(V value) {
		// TODO Auto-generated method stub
		this.value = value;
	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		// TODO Auto-generated method stub
		this.next = (MyMapNode<K, V>) next;
	}
	
	public String toString() {
		StringBuilder myStringBuilder = new StringBuilder();
		myStringBuilder.append("MyMapNode( K =").append(key).append(" V=").append(value).append("}");
		
		if (next != null ) {
			myStringBuilder.append("-->").append(next);
		}
		
		return myStringBuilder.toString();
	}

}
