import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    

    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);
        wormsEaten = 0;
    }
        
    public void act()
    {
        checkKeypress();
        move(5);
        lookForWorm();
        switchImage();
    }
    

    
    /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {
        if (getImage() == image1) 
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
            
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            turn(4);
        }
    }
    
    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        if ( isTouching(Worm.class) ) 
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            
            wormsEaten = wormsEaten + 1;
            
            if (wormsEaten == 8) 
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
    }
}