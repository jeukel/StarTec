package edu.itcr.startec.facade.mapconstruction;

import edu.itcr.startec.datastructs.doublelist.DoubleList;

public class MapConstruction<K>{
	private DoubleList<DoubleList<char[]>> map;
	
	public MapConstruction(){
		this.map = new DoubleList<DoubleList<char[]>>();
	}

	public void createMap(XMLFile mapFile){
		int x, y;
		
		/*************PARSE TO DO*************/
		/*
		 * Have the parse set i and j as x and y.
		 */
		
		//adjudicarlas primero o setearlas primero?
		for(int i = 1; i <= x; i++){
			DoubleList<char[]> column = new DoubleList<char[]>();
			this.map.append(column);
			for(int j = 1; j <= y; j++){
				//char pk = mapFile.Node[i].getPath[j]
				column.append(pk);
			}
		}
	}
	
}
