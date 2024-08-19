package com.coderscampus.testing;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] items = new Object[10];
    private int size;

    @Override
    public boolean add(T item) {
        if (size == items.length) {
            Object[] newItems = new Object[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[size] = item;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == size) {
            add(item); // add to the end of the list
        } else {
            // shift elements to the right to make room for the new item
            for (int i = size; i > index; i--) {
                items[i] = items[i - 1];
            }
            items[index] = item;
            size++;
        } return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            return (T) items[index];
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removedItem = (T) items[index];
        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }
        size--;
        return removedItem;
    }
}