package edu.itcr.startec.fromxml.graphical.unit;

import java.io.File;
import java.io.IOException;

import edu.itcr.startec.graphiclasses.GraphicUnit;


public class createGUnit {
	GUnitsFromXML units;
	String Canonicalpath;
    
    public createGUnit() throws IOException{
    	this.units = new GUnitsFromXML();
    	this.Canonicalpath = new File(".").getCanonicalPath();
    }
	
	public GraphicUnit Factory (String pBicho){
		if(pBicho == "tank"){
			GraphicUnit tank = new GraphicUnit(Canonicalpath,
											units.tanqueXMLUnit());
			return tank;			
		}else if(pBicho == "panzer" ){
			GraphicUnit scout = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return scout;			
		}else if(pBicho == "warrior" ){
			GraphicUnit warrior = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return warrior;			
		}else if (pBicho == "specialforce"){
			GraphicUnit specialforce = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return specialforce;			
		}else if(pBicho == "harvester"){
			GraphicUnit harvester = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return harvester;			
		}else if (pBicho == "proharvester"){
			GraphicUnit proharvester = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return proharvester;			
		}else if (pBicho == "monk"){
			GraphicUnit monk = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return monk;			
		}else if (pBicho=="healer"){
			GraphicUnit healer = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return healer;			
		}else if (pBicho == "kamikaze"){
			GraphicUnit kamikaze = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return kamikaze;			
		}else{
			GraphicUnit scout = new GraphicUnit(Canonicalpath,
											units.panzerXMLUnit());
			return scout;
		}
	}
}
