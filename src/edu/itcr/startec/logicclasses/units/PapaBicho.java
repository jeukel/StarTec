package edu.itcr.startec.logicclasses.units;

import edu.itcr.startec.observer.iObserver;


/**
 *
 * @author Luis Angel Simon Barrantes
 */
public class PapaBicho implements iObserver {
/**
* General class to create different units.
*/
    protected int _strenght;
    protected int _price;
    protected int _hitpoints;
    protected int _movespeed;
    protected int _weightlimit;
    protected int _weight;
    protected int _mana;
    protected int _intelligence;
    protected int _resistance;
    protected int _maxHitPoints;
    protected int x;
    protected int y;
    protected String _level;
    protected String isActive;
    
    public PapaBicho (String pLevel, int pPrice,int pIntelligence,int pStrenght,
    				  int pWeight,int pResistance, int pMovespeed,int pHitpoints
    				  ,int pWeightLimit, int pMana,int pMaxHitPoints ){
        /**This is meant to be used with XML Parsing to set the attributes. So, 
    	*each one of the parameters are methods to get the attribute of the unit
    	*/
        this._hitpoints=pHitpoints;
	this._maxHitPoints= pMaxHitPoints;
        this._intelligence=pIntelligence;
        this._mana=pMana;
        this._movespeed=pMovespeed;
        this._resistance=pResistance;
        this._strenght=pStrenght;
        this._weight=pWeight;
        this._weightlimit=pWeightLimit;
        this._price=pPrice;
        this._level=pLevel;
    }

    public void move (int px , int py){
    /**This is going to move the unit to the coordinates clicked. 
    *@param px position in x
    * @param py position in y
    */
        this.x = px;
        this.y = py;
    }

    public void takeDamage(int pDamage){
    /**Method to make a unit receive damage from another one.
    * @param pDamage This would be the _strenght from the enemy unit.
    */
        if ((pDamage+this._resistance) < this._hitpoints){
                this._hitpoints = this._hitpoints- (pDamage-this._resistance);
        }else{
                this._hitpoints = 0;
        }		
    }
    
    public String getAttributes(){
		StringBuilder result = new StringBuilder();
		result.append("Attributes: ");
		result.append("\n");
		result.append(String.format("Strenght: %d\n",this._strenght));
		result.append(String.format("Intelligence: %d\n",this._intelligence));
		result.append(String.format("Cost: %d\n",this._price));
		result.append(String.format("Movement speed: %d\n",this._movespeed));
		result.append(String.format("Resistance: %d\n",this._resistance));
		result.append(String.format("Hitpoints: %d\n",this._hitpoints));
		result.append(String.format("MaxHitPoints: %d\n",this._maxHitPoints));
		result.append(String.format("Weight: %d\n",this._weight));
		result.append(String.format("Weight limit: %d\n",this._weightlimit));
		result.append(String.format("Level: %s\n",this._level));
		result.append(String.format("Mana: %d\n",this._mana));
		return result.toString();
	}
    
    public void attack(PapaBicho pBicho){
    /**
     * This is going to execute takeDamage of the enemy.
     * @param pk id the enemy unit we are attacking.
     */
        pBicho.takeDamage(this._strenght);
    }

    public void stop(){
    /**
     * This will set the unit IDLE.
     */
        this.isActive = "IDLE";
    }

    public int getPositionX(){
    /**Gets the value of the X position of the unit.
     * @return value for x.
     */
        return this.x;
    }

    public int getPositionY(){
    /**Gets the value of the Y position of the unit.
     * @return Value for y.
     */
        return this.y;
    }

    public String getStatus(){
    /**Return the current value of isActive. For example , it would return 
     * "Moving " , "Harvesting"...
     * @return Current status.
     */
        return this.isActive;		
    }

    public void setStatus( String pStatus){
    /**This will just set the value of the variable isActive.
     * @param pStatus is the string we are gonna set as this.status fo the unit.
     */
        this.isActive= pStatus;
    }

    public int getMoveSpeed(){
    /**Will return the value of the unit movement speed.
     * @return Value of movespeed.
     */
        return this._movespeed;
    }
    
    public void setMoveSpeed(int pMoveSpeed){
    	this._movespeed= pMoveSpeed;
    }
    
    public int getIntelligence(){
    	return this._intelligence;
    }
    
    public void setIntelligence(int pIntelligence){
    	this._intelligence= pIntelligence;
    }
    
    public int getMana(){
    	return this._mana;
    }
    
    public void setMana(int pMana){
    	this._mana=pMana;
    }
    @Override
    public void update(int x,int y) {        
    /**
     * This is a method of the Observer pattern.And it will set the new x and y.
     * @param x Current position of the unit in x.
     * @param y Current position of the unit in y.
     */
        this.x=x;
        this.y=y;
    }
}
