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
     * Instance variables / objects
     * (can be used by any method in this class)
     */
    // Store the computer keyboard keys that white piano keys will respond to
    private String[] whiteKeys =
        { "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\" };

    // Store the sound files that will be played when a white piano key is pressed
    private  String[] whiteNotes =
        { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };

    // Store the computer keyboard keys that black piano keys will respond to
    private String[] blackKeys =
        { "w", "e", "", "t", "y", "u", "", "o", "p", "", "]", ""}; 

    // Store the sound files that will be played when a black piano key is pressed
    private String[] blackNotes =
        { "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#", "" }; 

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);

        
    }
    
    public void act()
    {
        int i = 0;
        while (i < 12)
        {
            addObject (new Key ("g", "3a", true), i*63 + 54, 140);
            i = i + 1;
        }
    }

}