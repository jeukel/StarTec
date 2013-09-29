package edu.itcr.startec.logicclasses.structs;

public class PapaBuilding {
	
	protected int _resistance;
	protected int _hitpoints;
	protected int x ;
	protected int y;
	
	public PapaBuilding(int pHitpoints , int pResistance , int px , int py){
		this._hitpoints = pHitpoints;
		this._resistance = pResistance;
		this.x = px;
		this.y = py;
	}
	
	public int takeDamage(int pDamage){
		this._hitpoints = this._hitpoints - (pDamage - this._resistance);
		return this._hitpoints;
	}
	public int getPosX(){
		return this.x;
	}
	public int getPosY(){
		return this.y;
	}
	}
