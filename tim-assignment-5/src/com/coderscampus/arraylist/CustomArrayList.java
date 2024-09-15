package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	
	Integer size=0;
	

	@Override
	public boolean add(T item) {
		if (size < items.length) {
			items[size] = item;
			size++;
			return true;
		} else {
			Object[] newArray = new Object[items.length*2];
			System.arraycopy(items, 0, newArray, 0, items.length);
			newArray[size] = item;
			items = newArray;
			size++;
			return true;
		}
		
	}

	@Override
	public int getSize() {
		
		return size;
	}

	
	
	@Override
	public T get(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index: "+ index+ ", Size: "+size);
		} return(T) items[index];
		}
	}
	
	

