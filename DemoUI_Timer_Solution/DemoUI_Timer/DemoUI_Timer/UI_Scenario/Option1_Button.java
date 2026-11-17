import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Option1_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Option1_Button extends Actor
{
    /**
     * Act - do whatever the Option1_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Option1_Button_Highlighted.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Option1_Button.png");
        }

        if (Greenfoot.mouseClicked(this))
        {

           Display display = null;
            if (getWorld().getObjects(Display.class) != null) // Is there a display in the world
            {
                display = getWorld().getObjects(Display.class).get(0);
            }
            else  // if not we create one.
            {
                display = new Display();
                getWorld().addObject( display, 100, 100 );
            }
            display.setImage(new GreenfootImage("You have selected Option 1 ", 35, Color.WHITE, Color.BLACK, Color.YELLOW));
            Greenfoot.setWorld(new WelcomeScreen());
        }
    }    

}
