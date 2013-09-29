/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itcr.startec.observer;

/**
 *
 * @author Luis Angel Simon Barrantes
 */
public interface iSubject {
    public void registerObserver(iObserver pObserver);
    public void unregisterObserver (iObserver pObserver);
    public void notifyObservers();
}
