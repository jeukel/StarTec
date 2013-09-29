package edu.itcr.startec.fromxml;

import edu.itcr.startec.logicclasses.units.Harvester;
import edu.itcr.startec.logicclasses.units.Healer;
import edu.itcr.startec.logicclasses.units.Kamikaze;
import edu.itcr.startec.logicclasses.units.Monk;
import edu.itcr.startec.logicclasses.units.PapaBicho;
import edu.itcr.startec.logicclasses.units.ProHarvester;

public class createUnit {
	UnitsFromXML units= new UnitsFromXML();
	
	public PapaBicho Factory (String pBicho){
		if(pBicho == "tank"){
			units.tanqueXMLUnit();
			PapaBicho tank = new PapaBicho(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			return tank;
			
		}else if(pBicho == "panzer" ){
			units.panzerXMLUnit();
			PapaBicho scout = new PapaBicho(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			return scout;
			
		}else if(pBicho == "warrior" ){
			units.soldadoXMLUnit();
			PapaBicho warrior = new PapaBicho(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			return warrior;
			
		}else if (pBicho == "specialforce"){
			units.dobleAgenteXMLUnit();
			PapaBicho specialforce = new PapaBicho(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			return specialforce;
			
		}else if(pBicho == "harvester"){
			units.peonXMLUnit();
			Harvester harvester = new Harvester(0, 0, 0, 0, 0, 0, 0, 0, 0, pBicho);
			return harvester;
			
		}else if (pBicho == "proharvester"){
			units.peonEliteXMLUnit();
			ProHarvester proharvester = new ProHarvester(0, 0, 0, 0, 0, 0, 0, 0, 0, pBicho);
			return proharvester;
			
		}else if (pBicho == "monk"){
			units.shamanXMLUnit();
			Monk monk = new Monk(0, 0, 0, 0, 0, 0, 0, 0, 0);
			return monk;
			
		}else if (pBicho=="healer"){
			units.enfermeroXMLUnit();
			Healer healer = new Healer(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, pBicho);
			return healer;
			
		}else if (pBicho == "kamikaze"){
			units.kamikazeXMLUnit();
			Kamikaze kamikaze = new Kamikaze(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, pBicho);
			return kamikaze;
			
		}else{
			units.escoltaXMLUnit();
			PapaBicho scout = new PapaBicho(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			return scout;
		}
	}
}
