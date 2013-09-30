/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itcr.startec.logicclasses.units;

import edu.itcr.startec.players.Player;

/**
 *
 * @author Luis Angel Simon Barrantes
 */
public class Monk extends PapaBicho {
	public boolean status;

	public Monk(String pLevel, int pPrice,int pIntelligence,int pStrenght,
			  int pWeight,int pResistance, int pMovespeed,int pHitpoints
			  ,int pWeightLimit, int pMana,int pMaxHitPoints){		

		super(pLevel,pPrice,pIntelligence,pStrenght,pWeight,pResistance,
				pMovespeed,pHitpoints,pWeightLimit,pMana,pMaxHitPoints);
		this.status = false;
	}    	
    
    public void convert(PapaBicho pBicho , Player<?>  pPlayer){
        /**This should add an enemy unit to the actual player´s list of units.
         * @param pk this parameter can be understood to be any unit of the 
         * enemy except buildings.
         */
    	if (this._intelligence > pBicho.getIntelligence() || 
    		this._mana > pBicho.getMana()){    		
    		pPlayer.getUnitsList().delete(this);
    	}
    }
    
    public void meditate(){
        /**
         * This is meant to make the monk unable to convert again for the next
         * seconds.
         */
    	int counter = 40;
    	while (counter != 0){
    		this.status = true;
    		counter--;
    	}
    	this.status = false;
    }
}
