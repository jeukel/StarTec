
import GraphicClasses.GraphicUnit;
import LogicClasses.PapaBicho;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Angel Simon Barrantes
 */
public class Units {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PapaBicho bicho;
        bicho=new PapaBicho();
        bicho.setStatus("Imaginary :D");
        bicho.move(10, 10);
        System.out.println(bicho.getPositionX());
        System.out.println(bicho.getPositionY());
        System.out.println(bicho.getStatus());       
    }
}
