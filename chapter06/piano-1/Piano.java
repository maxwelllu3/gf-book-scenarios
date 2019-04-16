import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variables (can be used anywhere below)
     */
    //Primitive data type (int)
    int frames;
    //Object data type... square brackets [] indicate an array (a list)
    //Track the white keys and notes
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", 
            ";", "'", "\\"};
    String[] whiteNotes = {"3c", "3d", "3e" ,"3f", "3g", "3a", "3b", 
            "4c", "4d", "4e", "4f", "4g"};
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);

        //Start tracking frames
        frames = 0;

    }

    /**
     * Act - called repeatedly to create the animation
     */
    public void act()
    {
        //This block of code runs once per second till the end of the array.
        //whiteKeys array
        if (frames % 60 == 0 && frames / 60 < whiteKeys.length)
        {
            //showText("Hello" + studentNames[ frames / 60 ], 400, 170);
        }

        //Keep track of frames
        frames += 1;

        //Show current frame
        showText("" + frames, 100, 100);
        
    }
}