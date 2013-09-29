/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itcr.startec.players;

import edu.itcr.startec.datastructs.simplelist.SimpleList;
import edu.itcr.startec.logicclasses.units.PapaBicho;

/**
 *
 * @author Luis Angel Simon Barrantes.
 * Class to keep track of players information.
 * @param <K>
 */

public class Player<K> extends SimpleList<K> {
    
    private SimpleList<PapaBicho> listunits;
    private SimpleList<PapaBicho> listbuildings;
    private int totalMinerals;
    
    public Player(){
        this.listunits = new SimpleList<PapaBicho>();
        this.listbuildings = new SimpleList<PapaBicho>();
    }
    
    public SimpleList<PapaBicho> getUnitsList(){
        return this.listunits;
    }
    
    public SimpleList<PapaBicho> getBuildingList(){
        return this.listbuildings ;
    }
    
    public int getMinerals(){
        return this.totalMinerals;
    }
    
    public void setMinerals(int pMinerals){
        this.totalMinerals = pMinerals;
    }
    
    public void removeBuilding(PapaBicho pUnit){
        this.listbuildings.delete(pUnit);
    }
    
    public void removeUnit(PapaBicho pUnit){
        this.listbuildings.delete(pUnit);
    }
    
    public void start(){
    	
    }
}
