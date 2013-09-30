import edu.itcr.startec.datastructs.doublelist.DoubleList;
import edu.itcr.startec.fromxml.MapFromXML;
import edu.itcr.startec.fromxml.GStructuresFromXML;
import edu.itcr.startec.fromxml.UnitsFromXML;


public class XMLRead {
	public static void main(String[] args) {
		MapFromXML<DoubleList<DoubleList<String>>> map = 
				new MapFromXML<DoubleList<DoubleList<String>>>();
		map.XMLtoMap();
		
		UnitsFromXML units= new UnitsFromXML();
		units.dobleAgenteXMLUnit();
		units.enfermeroXMLUnit();
		
		GStructuresFromXML structs= new GStructuresFromXML();
		structs.metropoliXMLGStructure();
	}
}
