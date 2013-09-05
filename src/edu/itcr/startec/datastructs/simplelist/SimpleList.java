package edu.itcr.startec.datastructs.simplelist;

import java.util.Iterator;

import edu.itcr.startec.datastructs.ListInterface;

class SimpleListNode<K> {
    
    protected K elem;
    protected SimpleListNode<K> next;
    
    public SimpleListNode(K elem) {
        this.elem = elem;
        this.next = null;
    }
    public SimpleListNode(K elem, SimpleListNode<K> next) {
        this.elem = elem;
        this.next = next;
    }
    
    public void setNext(SimpleListNode<K> next) {
        this.next = next;
    }

    public SimpleListNode<K> getNext() {
        return this.next;
    }
    
    public K getElem() {
        return this.elem;
    }
}

class SimpleListIterator<K> implements Iterator<K> {

    SimpleList<K> list;
    SimpleListNode<K> current;
    
    public SimpleListIterator(SimpleList<K> list) {
        this.list = list;
        this.current = null;
    }
    
    @Override
    public boolean hasNext() {
        
        if(this.current == null) {
            if(this.list.isEmpty()) {
                return false;
            }
            this.current = this.list.head;
            return true;
        }
        
        this.current = this.current.getNext();
        return this.current != null;
    }

    @Override
    public K next() {
        if(this.current == null) {
            return null;
        }
        return this.current.getElem();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

public class SimpleList<K> implements ListInterface<K>, Iterable<K> {
    
    protected int length;
    protected SimpleListNode<K> head;
    protected SimpleListNode<K> tail;

    public SimpleList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    
    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public boolean append(K pk) {
        
        SimpleListNode<K> n = new SimpleListNode<K>(pk);
        
        if(isEmpty()) {
            this.head = n;
            this.tail = n;
            this.length += 1;
            return true;
        }
        
        this.tail.setNext(n);
        this.tail = n;
        this.length += 1;
        return true;
    }

    @Override
    public boolean delete(K pk) {
        
        if(isEmpty()) {
            return false;
        }
        
        // Search node
        SimpleListNode<K> previous = null;
        SimpleListNode<K> current = this.head;
        while(current != null) {
            if(current.getElem().equals(pk)) {
                break;
            }
            previous = current;
            current = current.getNext();
        }

        // If not found
        if(current == null) {
            return false;
        }

        // Found, check head
        if(current == this.head) {
            this.head = current.getNext();
        }
        // Found, check tail
        if(current == this.tail) {
            this.tail = previous;
        }

        // Remove node
        if(previous != null) {
            previous.setNext(current.getNext());
        }
        current.setNext(null);
        current = null;
        this.length -= 1;
        return true;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public boolean exists(K pk) {
        for(K ck : this) {
            if(ck.equals(pk)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean insert(int pos, K pk) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean clear() {
        SimpleListNode<K> temp = null;
        while(this.head != null) {
            temp = this.head.getNext(); 
            this.head.setNext(null);
            this.head = temp;
        }
        this.tail = null;
        this.length = 0;
        return true;
    }
    
    @Override
    public Iterator<K> iterator() {
        return new SimpleListIterator<K>(this);
    }
}

