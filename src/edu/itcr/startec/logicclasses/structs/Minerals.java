package edu.itcr.startec.logicclasses.structs;

import edu.itcr.startec.datastructs.serializing.Queue;
import edu.itcr.startec.logicclasses.units.Harvester;

public class Minerals {
	protected Queue<Harvester> myUnits;
	protected int x ;
	protected int y;
	
	public Minerals( int px , int py){
		this.x = px;
		this.y = py;
	}
	
	public void enqueueHarvester(Harvester harvester){
		myUnits.Enqueue(harvester);
	}
	
	public void dequeueHarvester(){
		myUnits.Dequeue();
	}
	public int getPosX(){
		return this.x;
	}
	public int getPosY(){
		return this.y;
	}
	}
