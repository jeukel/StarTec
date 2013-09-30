/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Luis Angel Simon Barrantes
 */
package edu.itcr.startec.graphiclasses;

import javax.swing.ImageIcon;

import edu.itcr.startec.datastructs.simplelist.SimpleList;
import edu.itcr.startec.observer.iObserver;
import edu.itcr.startec.observer.iSubject;

public class GraphicStructs implements iSubject{
    
    private SimpleList<iObserver> _observers = new SimpleList<iObserver>  ();
    private int _x;
    private int _y;
    private ImageIcon i;

    public GraphicStructs(String pCanonicalPath, String pPath){
        this._x= 16;
        this._y= 1;
        this.i = new ImageIcon(pCanonicalPath + pPath);
    }
     
    @Override
    public void registerObserver(iObserver pObserver) {
        /**
         * @param pObserver This is meant to be the observer that is actually 
         * watching the subject and that is gonna get added to the list.
         */
        this._observers.append(pObserver);
    }

    @Override
    public void unregisterObserver(iObserver pObserver) {
        /**This is meant to remove the observer from the list of observers.
         *@param pObserver This is meant to be the observer that is actually 
         *watching the subject and that is gona get removed from the list.
         */
         
        
        this._observers.delete(pObserver);
    }

    @Override
    public void notifyObservers() {
        /**
         * This is the way the observers get the information they are waiting 
         * for.
         */
        for(iObserver ob :_observers){
            ob.update(this._x,this._y);
            }
    }
}
