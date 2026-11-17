import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GetIn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GetIn extends World
{

    /**
     * Constructor for objects of class GetIn.
     * 
     */
    public GetIn()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("Get to the ship", getWidth()/2, 60);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ship ship = new Ship();
        addObject(ship,417,321);
        ship.setLocation(421,298);
        removeObject(ship);
        Ship ship2 = new Ship();
        addObject(ship2,415,342);
    }
}
