import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(900, 600, 1);
        setUp();
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 450, 300);
        
        for (int i = 1; i <= 18; i += 1)
        {
            Leaf aLeaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(aLeaf, x, y);
        }
    }
}
