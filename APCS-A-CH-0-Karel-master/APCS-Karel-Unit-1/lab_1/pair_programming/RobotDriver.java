package lab_1.pair_programming;

import kareltherobot.*;
import java.awt.Color;

public class RobotDriver implements Directions
{
    public static void main(String args[])  {
        BeeperBot DudeMcRude = new BeeperBot(4,1,West,0);
        DudeMcRude.findAllBeepers();
        DudeMcRude.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/lab-1-pair.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(5);  
        World.setVisible(true);
    }
}