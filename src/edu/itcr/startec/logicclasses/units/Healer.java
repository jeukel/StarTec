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

    public Healer(String pLevel, int pPrice,int pIntelligence,int pStrenght,
			  int pWeight,int pResistance, int pMovespeed,int pHitpoints
			  ,int pWeightLimit, int pMana,int pMaxHitPoints ){
    	
    	super(pLevel,pPrice,pIntelligence,pStrenght,pWeight,pResistance,
				pMovespeed,pHitpoints,pWeightLimit,pMana,pMaxHitPoints);
    }
    
    public void heal(PapaBicho pUnit){
        while (pUnit._hitpoints != pUnit._maxHitPoints){
            pUnit._hitpoints=pUnit._hitpoints+10;
        }

    }
}
