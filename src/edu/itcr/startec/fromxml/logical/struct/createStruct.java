package edu.itcr.startec.fromxml.logical.struct;

import edu.itcr.startec.logicclasses.structs.PapaBuilding;

public class createStruct {
	StructuresFromXML struct;
	
	public createStruct(){
		struct = new StructuresFromXML();
	}
	
	public PapaBuilding Factory (String pBicho){
		if(pBicho == "mina"){
			struct.minaXMLStructure();
			PapaBuilding mina = new PapaBuilding(0, 0, 0, 0);
			return mina;
			
		}else if(pBicho == "metropoli" ){
			struct.metropoliXMLStructure();
			PapaBuilding metropoli = new PapaBuilding(0, 0, 0, 0);
			return metropoli;
			
		}else{
			struct.mezquitaXMLStructure();
			PapaBuilding mezquita = new PapaBuilding(0, 0, 0, 0);
			return mezquita;
		}
	}
}
