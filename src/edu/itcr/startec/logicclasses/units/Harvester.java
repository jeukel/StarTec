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

    public Harvester(int pStr,int pPrice, int pHitPoints, int pMoveSpeed, 
    				 int pWeightLimit,int pWeight, int pMana,int pIntelligence,
    				 int pResist,String pBicho){

    	super(pResist, pResist, pResist, pResist, pResist, pResist, pResist, 
    		  pResist, pResist, pResist);
    }

    public void harvest(){
        this._weight =this._weightlimit;
        }
        
    public void deposit(){
    	this._weight=0;
    }
    	
    }
