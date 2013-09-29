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
	public Kamikaze(int pMaxHitPoints,int pStr,int pPrice, int pHitPoints, 
		      		int pMoveSpeed, int pWeightLimit,int pWeight, int pMana,
		      		int pIntelligence,int pResist,String pLevel){

		super(pResist, pResist, pResist, pResist, pResist, pResist, pResist, 
			  pResist, pResist, pResist);
	}
	
	@Override
	public void attack(PapaBicho pBicho){
	    pBicho.takeDamage(super._strenght);
	    super._hitpoints=0;
	}
}
