import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    /**
     *This is a method that makes the scoreboard 
     *in the top left go up every time a fruit is eaten
     */
    private Scoreboard score;  
    
    /**
     * Beach is the constructor that creates a beach object.
     * It adds the size of the world, Food, 
     * Fly, Frog, and the Scoreboard
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       addFood(10);

       // add a Fly object at a random position somewhere in the world
       addFly();
       
       // add a Frog object at the center of the world 
       addFrog();
       
       // Adding the scoreboard to the top left hand of the window
       score = new Scoreboard();
       addObject( score, 75, 25 );
    }
    
  
    /**
     * Adds n Food objects to the world in random locations
     * 
     * @param There is one parameter, (int n)
     * @return Nothing is returned
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    
    /**
     * addFly adds the Fly to the world in a random location
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void addFly()
    {
      int x = Greenfoot.getRandomNumber( getWidth() );
      int y = Greenfoot.getRandomNumber( getHeight() );
      addObject(new Fly(),x,y);
    }
    
    /**
     * addFrog adds the Frog to the center of the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void addFrog()
    {
       addObject( new Frog(), getWidth()/2, getHeight()/2); 
    }
    
    /**
     * update, upates the scoreboard depending on how many 
     * peaces of Food are eaten
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void update()
    {
        score.addToScore();
    }
    
    /**
     * act is the constructor that makes the food 
     * reset after it is all gone
     * 
     * @param There are no parameters 
     * @return Nothing is returned
     */
    public void act()
    {
        if(getObjects(Food.class).isEmpty() == true)
        {
          addFood(10);  
        }
    }
}
