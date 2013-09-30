/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itcr.startec.players;

import java.io.IOException;

import edu.itcr.startec.datastructs.simplelist.SimpleList;
import edu.itcr.startec.fromxml.graphical.struct.createGStruct;
import edu.itcr.startec.fromxml.graphical.unit.createGUnit;
import edu.itcr.startec.fromxml.logical.struct.createStruct;
import edu.itcr.startec.fromxml.logical.unit.createUnit;
import edu.itcr.startec.graphiclasses.GraphicStructs;
import edu.itcr.startec.graphiclasses.GraphicUnit;
import edu.itcr.startec.logicclasses.structs.PapaBuilding;
import edu.itcr.startec.logicclasses.units.PapaBicho;

/**
 *
 * @author Luis Angel Simon Barrantes.
 * Class to keep track of players information.
 * @param <K>
 */

public class Player<K> extends SimpleList<K> {
    
    private SimpleList<PapaBicho> listunits;
    private SimpleList<PapaBuilding> listbuildings;
    private int totalMinerals;
    
    public Player(){
        this.listunits = new SimpleList<PapaBicho>();
        this.listbuildings = new SimpleList<PapaBuilding>();
    }
    
    public SimpleList<PapaBicho> getUnitsList(){
        return this.listunits;
    }
    
    public SimpleList<PapaBuilding> getBuildingList(){
        return this.listbuildings ;
    }
    
    public int getMinerals(){
        return this.totalMinerals;
    }
    
    public void setMinerals(int pMinerals){
        this.totalMinerals = pMinerals;
    }
    
    public void removeBuilding(PapaBuilding pUnit){
        this.listbuildings.delete(pUnit);
    }
    
    public void removeUnit(PapaBicho pUnit){
        this.listunits.delete(pUnit);
    }
    
    public void createNewUnit(String unit) throws IOException{
    	createUnit wireframe = new createUnit();
    	PapaBicho units = wireframe.Factory(unit);
    	listunits.append(units);
    	createGUnit gwireframe = new createGUnit();
    	GraphicUnit gunits = gwireframe.Factory(unit);
    	//listunits.append(gunits);
    }
    
    public void createNewStructure(String struct) throws IOException{
    	createStruct wireframe = new createStruct();
    	PapaBuilding building = wireframe.Factory(struct);
    	listbuildings.append(building);
    	createGStruct gwireframe = new createGStruct();
    	GraphicStructs gbuilding = gwireframe.Factory(struct);
    	//listunits.append(gunits);
    }
}
