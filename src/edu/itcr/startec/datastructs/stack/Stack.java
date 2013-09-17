package edu.itcr.startec.datastructs.stack;

import edu.itcr.startec.datastructs.StackInterface;

public class Stack<K> implements StackInterface<K>{

    public boolean push(K pk) {
        return insert(pk);
    }

    public String top() {
        return describe();
    }

    public boolean pop() {
        return delete();
    }

    @Override
    public int length() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean append(K pk) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(K pk) {
		// TODO Auto-generated method stub
		return false;
    }

    @Override
    public boolean exists(K pk) {
		// TODO Auto-generated method stub
		return false;
    }

    @Override
    public boolean insert(int pos, K pk) {
		// TODO Auto-generated method stub
		return false;
    }

	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(K pk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public K getHead() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K getTail() {
		// TODO Auto-generated method stub
		return null;
	}

}
