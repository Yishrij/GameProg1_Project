import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainScreen extends World
{

    /**
     * Constructor for objects of class MainScreen.
     * 
     */
    public MainScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Option1_Button option1_Button = new Option1_Button();
        addObject(option1_Button,487,200);
        Option2_Button option2_Button = new Option2_Button();
        addObject(option2_Button,490,291);
        Option3_Button option3_Button = new Option3_Button();
        addObject(option3_Button,482,393);
        Display display = new Display();
        addObject(display,182,99);
        display.setLocation(489,506);
        option1_Button.setLocation(576,216);
        option1_Button.setLocation(576,216);
        option1_Button.setLocation(492,194);
    }
}
