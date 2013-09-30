/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itcr.startec.logicclasses.structs;

import edu.itcr.startec.datastructs.serializing.Queue;
import edu.itcr.startec.logicclasses.units.Harvester;

/**
 *
 * @author Luis Angel Simon Barrantes
 */
public class Base extends PapaBuilding{
	private Queue<Harvester> _myHarvesters;

	public Base(int pHitpoints, int pResistance, int px, int py) {
		super(pHitpoints, pResistance, px, py);
		// TODO Auto-generated constructor stub
	}
	
	public void enqueueHarvesters(Harvester pharvester){
		_myHarvesters.Enqueue(pharvester);
	}
	
	public void dequeueHarvester(){
		_myHarvesters.Dequeue();		
	}

}
