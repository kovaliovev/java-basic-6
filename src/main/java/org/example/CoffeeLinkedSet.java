package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CoffeeLinkedSet implements Set<Coffee> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<Coffee> head;
    private Node<Coffee> tail;
    private int size;

    // Constructor 1: Empty collection
    public CoffeeLinkedSet() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Constructor 2: Single Coffee object
    public CoffeeLinkedSet(Coffee coffee) {
        this();
        add(coffee);
    }

    // Constructor 3: Collection of Coffee objects
    public CoffeeLinkedSet(Collection<Coffee> collection) {
        this();
        for (Coffee coffee : collection) {
            add(coffee);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node<Coffee> current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            private Node<Coffee> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Coffee next() {
                Coffee data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int index = 0;
        for (Node<Coffee> current = head; current != null; current = current.next) {
            array[index++] = current.data;
        }
        return array;
    }

    @Override
    public boolean add(Coffee coffee) {
        if (contains(coffee)) {
            return false;
        }
        Node<Coffee> newNode = new Node<>(coffee);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<Coffee> current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Coffee> c) {
        boolean modified = false;
        for (Coffee coffee : c) {
            if (add(coffee)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Iterator<Coffee> it = iterator();
        while (it.hasNext()) {
            Coffee element = it.next();
            if (!c.contains(element)) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object element : c) {
            if (remove(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        }
        int index = 0;
        Object[] result = a;
        for (Node<Coffee> current = head; current != null; current = current.next) {
            result[index++] = current.data;
        }
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }
}
