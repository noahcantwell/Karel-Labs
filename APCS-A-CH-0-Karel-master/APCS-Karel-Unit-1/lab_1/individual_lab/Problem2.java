package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        backS();
        regS();
    }
   
    public void backS() {
        turnLeft();
        move();
        rightM2();
        rightM2();
        leftM2();
        leftM2();
    }
    
    public void regS() {
        leftM2();
        leftM2();
        rightM2();
        turnRight();
        move();
        turnRight();
    }
    
    public void rightM2() {
        turnRight();
        move2();
    }
    
    public void leftM2() {
        turnLeft();
        move2();
    }
    
    public void move2() {
        move();
        move();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}