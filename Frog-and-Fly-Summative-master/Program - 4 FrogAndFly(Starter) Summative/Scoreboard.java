import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    //points is a variable for the scoreboard that changes when ever a fruit is eaten
    private int points;
    //myFont is the font of the scoreboard (Comic Sans MS)
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    } 
    
    /**
     * Scoreboard puts the scoreboard on
     * the window in the top left of the screen
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }
    
    /**
     * addToScore makes the scoreboard on the screen 
     * go up by one when ever a fruit is eaten
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("Score: " + points, 5,25);         
    } 
}
