import edu.itcr.startec.datastructs.doublelist.DoubleList;
import edu.itcr.startec.datastructs.doublelist.DoubleListNode;
import edu.itcr.startec.facade.mapconstruction.CreateMapFromXML;


public class XMLRead {
	public static void main(String[] args) {
		CreateMapFromXML<DoubleList<DoubleList<String>>> map = new CreateMapFromXML<DoubleList<DoubleList<String>>>();
		DoubleList<DoubleList<String>> map00 = map.XMLtoMap();
		DoubleListNode<String> col01 = map00.getHead();
		col01.describe();
	}
}
