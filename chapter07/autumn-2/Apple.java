import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    private int speed;
    
    public Apple()
    {
        speed = Greenfoot.getRandomNumber(3) + 1;      // random speed: 1 to 3
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isAtEdge())
        {
            turn(90);
        }
        
        move(speed);
        
        if (Greenfoot.getRandomNumber(100) < 50) 
        {
            turn(Greenfoot.getRandomNumber(5) - 2);   // -2 to 2
        }
    }    
}
