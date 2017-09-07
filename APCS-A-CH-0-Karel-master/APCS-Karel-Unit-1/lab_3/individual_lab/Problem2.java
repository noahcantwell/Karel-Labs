package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        //sets up first room check
        move();
        turnLeft();
        move();
        //checks 8 rooms
        checkRoom();
        nextRoom();
        checkRoom();
        nextRoom();
        checkRoom();
        nextRoom();
        checkRoom();
        nextRoom();
        checkRoom();
        nextRoom();
        checkRoom();
        nextRoom();
        checkRoom();
        nextRoom();
        checkRoom();
        //leaves next room
        move();
        turnLeft();
        move();
    }
    
    public void nextRoom() {
        //moves from one room to the next
        move();
        turnLeft();
        move();
        turnLeft();
        move();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void checkRoom() {
        //starts facing right, turns from right to left checking 3 walls
        turnRight();
        if(!frontIsClear()) {
            turnLeft();
            if(!frontIsClear()) {
                turnLeft();
                if(!frontIsClear()) {
                    turnLeft();
                    putBeeper();
                }
                else {
                    turnLeft();
                }
            }
            else {
                turnLeft();
                turnLeft();
            }
        }
        else {
            turnRight();
        }
    }
}

