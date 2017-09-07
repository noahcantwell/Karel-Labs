package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        //sets pins rown by row, moving up
        rowOne();
        rowTwo();
        rowThree();
        rowFour();
    }
    
    public void rowOne() {
        move();
        putBeeper();
        rightMove();
        leftMove();
    }
    
    public void rowTwo() {
        turnLeft();
        putBeeper();
        moveMovePut();
        move();
        rightMove();
    }
    
    public void rowThree() {
        turnRight();
        putBeeper();
        moveMovePut();
        moveMovePut();
        move();
        leftMove();
    }
    
    public void rowFour() {
        turnLeft();
        putBeeper();
        moveMovePut();
        moveMovePut();
        moveMovePut();
        move();
    }
    
    public void moveMovePut() {
        move();
        move();
        putBeeper();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void  rightMove() {
        turnRight();
        move();
    }
    
    public void leftMove() {
        turnLeft();
        move();
    }
}
