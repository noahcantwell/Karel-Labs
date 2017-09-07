package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        //goes into first room
        move();
        turnLeft();
        move();
        //attempts to carpet the 8 rooms
        carpeter();
        nextRoom();
        carpeter();
        nextRoom();
        carpeter();
        nextRoom();
        carpeter();
        nextRoom();
        carpeter();
        nextRoom();
        carpeter();
        nextRoom();
        carpeter();
        nextRoom();
        carpeter();
        //leaves last room
        move();
        turnLeft();
        move();
    }
    
    public void carpeter() {
        if(climbUp()) {
            layCarpet();
        }
        else {
            returnToGround();
        }
    }
    
    public boolean climbUp() {
        //goes up levels while checking walls
        if(areWalls()) {
            //if there is a roof and it has no wall breaks, it returns and
            //lays carpet
            if (isRoof()) {
                return true;
            }
            else {
                move();
                climbUp();
            }
        }
        else {
            return false;
        }
    }
    
    public boolean areWalls() {
        turnLeft();
        if(frontIsClear()) {
            turnLeft();
            turnLeft();
            if(frontIsClear()) {
                turnLeft();
                return true;
            }
            else {
                turnLeft();
                return false;
            }
        }
        else {
            turnRight();
            return false;
        }
    }
    
    public boolean isRoof() {
        if(frontIsClear()) {
           return true;
        }
    }
    
    public void layCarpet() {
        turnLeft();
        turnLeft();
        carpetUntilBottom();
    }
    
    public void carpetUntilBottom() {
        putBeeper();
        if(frontIsClear()) {
            putBeeper();
            move();
            carpetUntilBottom();
        }
    }
    
    public void returnToGround() {
        turnLeft();
        turnLeft();
        if(frontIsClear()) {
            move();
            returnToGround();
        }
    }
}

