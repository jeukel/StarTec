/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itcr.startec.logicclasses.units;

/**
 *
 * @author Luis Angel Simon Barrantes
 */
public class Healer extends PapaBicho{

    public Healer(int pMaxHitPoints,int pStr,int pPrice, int pHitPoints, 
    			  int pMoveSpeed, int pWeightLimit,int pWeight, int pMana,
    			  int pIntelligence,int pResist,String pLevel){
    	
    	super(pResist, pResist, pResist, pResist, pResist, pResist, pResist, 
    		  pResist, pResist, pResist);
    }
    
    public void heal(PapaBicho pUnit){
        while (pUnit._hitpoints != pUnit._maxHitPoints){
            pUnit._hitpoints=pUnit._hitpoints+10;
        }

    }
}
