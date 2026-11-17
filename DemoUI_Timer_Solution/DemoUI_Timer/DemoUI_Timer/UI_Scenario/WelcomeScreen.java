import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeScreen extends World
{
    
    double timeWelcomeScreenCreation = System.currentTimeMillis();
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        showText("W E L C O M E    TO   T H I S    G A M E", getWidth()/2, 60);
        showText("Press Space Bar or wait 9 secvonds", getWidth()/2, 110);
        timeWelcomeScreenCreation = System.currentTimeMillis();
    }

    public void act()
    {
        Display display = new Display();
        addObject(display , 280,500);
        
        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;
        display.setImage(new GreenfootImage("Timer Value :" + timerValue , 35, Color.WHITE, Color.BLACK, Color.YELLOW));
        
        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (9 * 1000)) || Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new GetIn()); 
        }
    }
}
