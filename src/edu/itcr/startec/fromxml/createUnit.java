package edu.itcr.startec.fromxml;

import edu.itcr.startec.datastructs.serializing.Queue;
import edu.itcr.startec.logicclasses.units.Harvester;
import edu.itcr.startec.logicclasses.units.Healer;
import edu.itcr.startec.logicclasses.units.Kamikaze;
import edu.itcr.startec.logicclasses.units.Monk;
import edu.itcr.startec.logicclasses.units.PapaBicho;
import edu.itcr.startec.logicclasses.units.ProHarvester;

public class createUnit {
	UnitsFromXML units;
	Queue <String> list;
	String pLevel;
	int pPrice;
	int pIntelligence;
	int pStrenght;
	int pWeight;
	int pResistance;
	int pMovespeed;
	int pHitpoints;
	int pWeightLimit;
	int pMana;
	int pMaxHitPoints;
	
	public createUnit(){
		units = new UnitsFromXML();
		list = new Queue<String>();
	}
	
	public PapaBicho Factory (String pBicho){
		if(pBicho == "tank"){
			list = units.tanqueXMLUnit();
			setVar();
			PapaBicho tank = new PapaBicho(pLevel,pPrice,pIntelligence,pStrenght
										  ,pWeight,pResistance,pMovespeed,
										  pHitpoints,pWeightLimit,pMana,
										  pMaxHitPoints);
			return tank;			
		}else if(pBicho == "panzer" ){
			list = units.panzerXMLUnit();
			setVar();
			PapaBicho scout = new PapaBicho(pLevel,pPrice,pIntelligence,
											pStrenght,pWeight,pResistance,
											pMovespeed,pHitpoints,pWeightLimit,
											pMana,pMaxHitPoints);
			return scout;			
		}else if(pBicho == "warrior" ){
			list = units.soldadoXMLUnit();
			setVar();
			PapaBicho warrior = new PapaBicho(pLevel,pPrice,pIntelligence,
											  pStrenght,pWeight,pResistance,
											  pMovespeed,pHitpoints,pWeightLimit
											  ,pMana,pMaxHitPoints);
			return warrior;			
		}else if (pBicho == "specialforce"){
			list = units.dobleAgenteXMLUnit();
			setVar();
			PapaBicho specialforce = new PapaBicho(pLevel,pPrice,pIntelligence,
												   pStrenght,pWeight,pResistance
												   ,pMovespeed,pHitpoints,
												   pWeightLimit,pMana,
												   pMaxHitPoints);
			return specialforce;			
		}else if(pBicho == "harvester"){
			list = units.peonXMLUnit();
			setVar();
			Harvester harvester = new Harvester(pLevel,pPrice,pIntelligence,
												pStrenght,pWeight,pResistance,
												pMovespeed,pHitpoints,
												pWeightLimit,pMana,
												pMaxHitPoints);
			return harvester;			
		}else if (pBicho == "proharvester"){
			list = units.peonEliteXMLUnit();
			setVar();
			ProHarvester proharvester = new ProHarvester(pLevel,pPrice,
														 pIntelligence,pStrenght
														 ,pWeight,pResistance,
														 pMovespeed,pHitpoints,
														 pWeightLimit,pMana,
														 pMaxHitPoints);
			return proharvester;			
		}else if (pBicho == "monk"){
			list = units.shamanXMLUnit();
			setVar();
			Monk monk = new Monk(pLevel,pPrice,pIntelligence,pStrenght,pWeight,
								 pResistance,pMovespeed,pHitpoints,pWeightLimit,
								 pMana,pMaxHitPoints);
			return monk;			
		}else if (pBicho=="healer"){
			units.enfermeroXMLUnit();
			setVar();
			Healer healer = new Healer(pLevel,pPrice,pIntelligence,pStrenght,
									   pWeight,pResistance,pMovespeed,pHitpoints
									   ,pWeightLimit,pMana,pMaxHitPoints);
			return healer;			
		}else if (pBicho == "kamikaze"){
			units.kamikazeXMLUnit();
			setVar();
			Kamikaze kamikaze = new Kamikaze(pLevel,pPrice,pIntelligence,
											 pStrenght,pWeight,pResistance,
											 pMovespeed,pHitpoints,pWeightLimit,
											 pMana,pMaxHitPoints);
			return kamikaze;			
		}else{
			units.escoltaXMLUnit();
			setVar();
			PapaBicho scout = new PapaBicho(pLevel,pPrice,pIntelligence,
											pStrenght,pWeight,pResistance,
											pMovespeed,pHitpoints,pWeightLimit,
											pMana,pMaxHitPoints);
			return scout;
		}
	}
	
	private void setVar(){
		pLevel = list.Peek();
		list.Dequeue();
		pPrice = Integer.parseInt(list.Peek());
		list.Dequeue();
		pIntelligence = Integer.parseInt(list.Peek());
		list.Dequeue();
		pStrenght = Integer.parseInt(list.Peek());
		list.Dequeue();
		pWeight  = Integer.parseInt(list.Peek());
		list.Dequeue();
		pResistance = Integer.parseInt(list.Peek());
		list.Dequeue();
		pMovespeed = Integer.parseInt(list.Peek());
		list.Dequeue();
		pHitpoints = Integer.parseInt(list.Peek());
		list.Dequeue();
		pWeightLimit = Integer.parseInt(list.Peek());
		list.Dequeue();
		pMana = Integer.parseInt(list.Peek());
		list.Dequeue();
		pMaxHitPoints = Integer.parseInt(list.Peek());
	}
}
