import greenfoot.*;

/**
 * This is a stick man. Make him move.
 */
public class Stickman extends Actor
{
    public void act() 
    {
        if (Greenfoot.getMicLevel() > 5)
        {
            move(-10);
        }
        
        move(5);
        
        if (isAtEdge())
        {
            Greenfoot.stop();
        }
    }    
}
