/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itcr.startec.logicclasses.units;

/**
 *
 * @author Luis Angel Simon Barrantes
 */

public class Kamikaze extends PapaBicho{
	public Kamikaze(String pLevel, int pPrice,int pIntelligence,int pStrenght,
			  int pWeight,int pResistance, int pMovespeed,int pHitpoints
			  ,int pWeightLimit, int pMana,int pMaxHitPoints ){

		super(pLevel,pPrice,pIntelligence,pStrenght,pWeight,pResistance,
				pMovespeed,pHitpoints,pWeightLimit,pMana,pMaxHitPoints);
	}
	
	@Override
	public void attack(PapaBicho pBicho){
	    pBicho.takeDamage(super._strenght);
	    super._hitpoints=0;
	}
}
