package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        rightM2();
        leftM2();
        turnLeft();
        pickMove4();
        turnLeft();
        pickMove();
        move();
        turnLeft();
        move();
        moveDrop();
        turnLeft();
        moveDrop4();
        rightM2();
        rightM2();
        turnRight();
        
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void move2() {
        move();
        move();
    }
    
    public void pickMove() {
        pickBeeper();
        move();
    }
    
    public void moveDrop() {
        move();
        putBeeper();
    }
    
    public void pickMove4() {
        pickMove();
        pickMove();
        pickMove();
        pickMove();
    }
    
    public void moveDrop4() {
        moveDrop();
        moveDrop();
        moveDrop();
        moveDrop();
    }
    
    public void rightM2() {
        turnRight();
        move2();
    }
    
    public void leftM2() {
        turnLeft();
        move2();
    }
}