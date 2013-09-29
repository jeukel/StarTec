/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Luis Angel Simon Barrantes
 */
package edu.itcr.startec.graphiclasses;

import java.util.ArrayList;
import javax.swing.ImageIcon;

import edu.itcr.startec.observer.iObserver;
import edu.itcr.startec.observer.iSubject;


public class GraphicUnit implements iSubject{
    
    private ArrayList<iObserver> _observers = new ArrayList<iObserver>  ();
    private int _x;
    private int _y;
    private ImageIcon i;

    public GraphicUnit(String path){
        this._x= 16;
        this._y= 1;
        this.i = new ImageIcon(path);
    }
    
//    public void getPath(){
//        try{
//            this.path=new File(".").getCanonicalPath(); 
//        }catch{
//            
//        }
//    }
    
    public void Move(int px,int py,int pMoveSpeed){
        /**This is to move the unit step by step in the GUI. This needs to know 
         * the LogicUnit _MoveSpeed attribute because it has to simulate some 
         * sort of speed. So if the movespeed is low , then the GUI is gonna 
         * make it look slow.
        *@param px x position.
        *@param py y position.
        *@param pMovespeed speed that the Unit has.
        */
        while(this._x<px && this._y<py){
            this._x= px + (20* (pMoveSpeed/10));
            this._y= py + (20* (pMoveSpeed/10));
        }
    }
    
    @Override
    public void registerObserver(iObserver pObserver) {
        /**
         * @param pObserver This is meant to be the observer that is actually 
         * watching the subject and that is gona get added to the list.
         */
        this._observers.add(pObserver);
    }

    @Override
    public void unregisterObserver(iObserver pObserver) {
        /**This is meant to remove the observer from the list of observers.
         *@param pObserver This is meant to be the observer that is actually 
         *watching the subject and that is gona get removed from the list.
         */
         
        
        this._observers.remove(pObserver);
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
