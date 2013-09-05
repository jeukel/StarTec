package edu.itcr.startec.datastructs;

public interface ListInterface<K> {
    public boolean isEmpty();
    public boolean append(K pk);
    public boolean delete(K pk);
    public int length();
    public boolean exists(K pk);
    public boolean insert(int pos, K pk);
    public boolean clear();
}