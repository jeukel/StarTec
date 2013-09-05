package edu.itcr.startec.datastructs.doublelist;

import java.util.Iterator;

import edu.itcr.startec.datastructs.ListInterface;

class DoubleListNode<K> {
    
    protected K elem;
    protected DoubleListNode<K> next;
    protected DoubleListNode<K> previous;
    
    public DoubleListNode(K elem) {
        this.elem = elem;
        this.next = null;
        this.previous = null;
    }
    public DoubleListNode(K elem, DoubleListNode<K> next) {
        this.elem = elem;
        this.next = next;
        this.previous = null;
    }
    
    public void setNext(DoubleListNode<K> next) {
        this.next = next;
    }

    public DoubleListNode<K> getNext() {
        return this.next;
    }
    
    public DoubleListNode<K> getPrevious() {
        return this.previous;
    }
    
    public K getElem() {
        return this.elem;
    }
}

class DoubleListIterator<K> implements Iterator<K> {

	DoubleList<K> list;
	DoubleListNode<K> current;
    
    public DoubleListIterator(DoubleList<K> list) {
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

public class DoubleList<K> implements ListInterface<K>, Iterable<K> {
    
    protected int length;
    protected DoubleListNode<K> head;
    protected DoubleListNode<K> tail;

    public DoubleList() {
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
        
    	DoubleListNode<K> node = new DoubleListNode<K>(pk);
        
        if(isEmpty()) {
            this.head = node;            
        } else {
            this.tail.setNext(node);
        }        
        this.tail = node;
        this.length += 1;
        return true;
    }

    @Override
    public boolean delete(K pk) {
        
        if(isEmpty()) {
            return false;
        }
        
        if(this.length == 1) {
            if(this.head.getElem().equals(pk)) {
                clear();
                this.length -= 1;
                return true;
            }
            return false;
        }
        
        DoubleListNode<K> previous = this.head;
        DoubleListNode<K> current = this.head.getNext();
        while(current != null) {
            if(current.getElem().equals(pk)) {
                // Remove node
                previous.setNext(current.getNext());
                current.setNext(null);
                current = null;
                this.length -= 1;
                return true;
            }
            
            previous = current;
            current = current.getNext();
        }
        
        return false;
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
    	DoubleListNode<K> temp = null;
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
        return new DoubleListIterator<K>(this);
    }
}
