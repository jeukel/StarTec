package edu.itcr.startec.logicclasses.units;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Angel Simon Barrantes
 */
public class Harvester extends PapaBicho{

    public Harvester(String pLevel, int pPrice,int pIntelligence,int pStrenght,
			  int pWeight,int pResistance, int pMovespeed,int pHitpoints
			  ,int pWeightLimit, int pMana,int pMaxHitPoints ){

    	super(pLevel,pPrice,pIntelligence,pStrenght,pWeight,pResistance,
				pMovespeed,pHitpoints,pWeightLimit,pMana,pMaxHitPoints);
    }

    public void harvest(){
        this._weight =this._weightlimit;
        }
        
    public void deposit(){
    	this._weight=0;
    }
    	
    }

