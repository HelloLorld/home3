package com.company.mylist;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public void add(E element) {
        addToEnd(element);
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size - 1) {
            System.out.println("Out of range");
            return;
        } else if (size == 0 || size - 1 == index) {
            addToEnd(element);
        } else if (index == 0) {
            Node<E> newFirst = new Node<>(null, element, first);
            first.prevNode = newFirst;
            first = newFirst;
            size++;
        } else {
            Node<E> cur = node(index);
            Node<E> tmp;
            if (cur == null) {
                tmp = new Node<>(null, element, first.nextNode);
                first = tmp;
            } else {
                Node<E> prev = cur.prevNode;
                tmp = new Node<>(prev, element, cur);
                cur.prevNode = tmp;
                prev.nextNode = tmp;
            }
            size++;
        }
    }

    @Override
    public void clear() {
        for (Node<E> cur = first; cur != null; ) {
            Node<E> next = cur.nextNode;
            cur.prevNode = null;
            cur.nextNode = null;
            cur.element = null;
            cur = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Out of range");
            return null;
        }
        return node(index).element;
    }

    @Override
    public int indexOf(E element) {
        int i = 0;
        for (Node<E> cur = first; cur != null; cur = cur.nextNode ) {
            if (element == null) {
                if (element == cur.element) return i;
            } else if (element.equals(cur.element)) return i;
            i++;
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Out of range");
            return null;
        }

        Node<E> removeNode = node(index);
        if (removeNode == null) {
            System.out.println("The element is missing");
            return null;
        }

        Node<E> tmp;
        E element;
        if (removeNode.prevNode == null) {
            tmp = removeNode.nextNode;
            element = removeNode.element;
            removeNode.element = null;
            removeNode.nextNode = null;
            first = tmp;
            size--;
            return element;
        } else if (removeNode.nextNode == null) {
            tmp = removeNode.prevNode;
            element = removeNode.element;
            removeNode.element = null;
            removeNode.prevNode = null;
            last = tmp;
            size--;
            return element;
        } else {
            tmp = removeNode.prevNode;
            tmp.nextNode = removeNode.nextNode;
            element = removeNode.element;
            removeNode.nextNode = null;
            removeNode.prevNode = null;
            size--;
            return element;
        }
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index > size) {
            System.out.println("Out of range");
            return null;
        }
        Node<E> cur = node(index);
        E old = cur.element;
        cur.element = element;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] res = new Object[size];
        int i = 0;
        for (Node<E> cur = first; cur.nextNode != null; cur = cur.nextNode)
            res[i++] = cur.element;
        return res;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[]) Array.newInstance(a.getClass()
                    .getComponentType(), size);
        int i = 0;
        Object[] res = a;
        for (Node<E> cur = first; cur.nextNode!=null; cur = cur.nextNode)
            res[i++] =  cur.element;
        if (a.length > size)
            a[size] = null;
        return a;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private Node<E> node(int index) {
        Node<E> cur;
        if (index < size / 2) {
            cur = first;
            for (int i = 0; i < index; i++) {
                cur = cur.nextNode;
            }
            return cur;
        } else {
            cur = last;
            for (int i = size - 1; i > index; i--) {
                cur = cur.prevNode;
            }
            return cur;
        }
    }

    private void addToEnd(E data) {
        if (size == 0) {
            first = new Node<>(null, data, null);
            last = first;
        } else if (size == 1) {
            last = new Node<>(first, data, null);
            first.nextNode = last;
        } else {
            last.nextNode = new Node<>(last, data, null);
            last = last.nextNode;
        }
        size++;
    }

    private static class Node<E> {
        E element;
        Node<E> nextNode;
        Node<E> prevNode;

        Node(Node<E> prevNode, E element, Node<E> nextNode) {
            this.prevNode = prevNode;
            this.element = element;
            this.nextNode = nextNode;
        }
    }

    private class Itr implements Iterator<E> {
        Node<E> cur = MyLinkedList.this.first;
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index == size) return false;
            else return true;
        }

        @Override
        public E next() {
            E element = cur.element;
            cur = cur.nextNode;
            index++;
            return element;
        }
    }
}
