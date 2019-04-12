import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variable
     */
    //Tracks whether the piano down image is already set or not
    private boolean isDown;

    /**
     * Create a new key.
     */
    public Key()
    {
        //Key begins in the up position
        isDown = false;
        
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if (isDown == false && Greenfoot.isKeyDown("g"))
        {
            setImage("white-key-down.png");
            isDown = true;
            play();
        }
        if (isDown == true && Greenfoot.isKeyDown("g") == false)
        {
            setImage("white-key.png");
            isDown = false;
        }
    }
    
    /**
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");
    }
}

