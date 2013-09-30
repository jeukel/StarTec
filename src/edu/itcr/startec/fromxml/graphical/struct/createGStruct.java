package edu.itcr.startec.fromxml.graphical.struct;

import java.io.File;
import java.io.IOException;

import edu.itcr.startec.graphiclasses.GraphicStructs;

public class createGStruct {
	GStructuresFromXML gstruct;
	String Canonicalpath;
	
	public createGStruct() throws IOException{
		this.Canonicalpath = new File(".").getCanonicalPath();
		this.gstruct = new GStructuresFromXML();
	}
	
	public GraphicStructs Factory (String pBicho){
		if(pBicho == "mina"){
			GraphicStructs minaG = new GraphicStructs(Canonicalpath,
													  gstruct
													  .minaXMLGStructure());
			return minaG;
			
		}else if(pBicho == "metropoli" ){
			gstruct.metropoliXMLGStructure();
			GraphicStructs metropoliG = new GraphicStructs(Canonicalpath,
														   gstruct
														  .minaXMLGStructure());
			return metropoliG;
			
		}else{
			gstruct.minaXMLGStructure();
			GraphicStructs mezquitaG = new GraphicStructs(Canonicalpath,
														  gstruct
														  .minaXMLGStructure());
			return mezquitaG;
		}
	}
}
