import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    /**
     * Fly is the constructor that makes it spawn in
     * at a random rotation
     */
    public Fly()
    {
        /*
         * modify this code to make the Fly face any random 
         * initial direction
         */
        setRotation( Greenfoot.getRandomNumber (360) );
    }
    
    /**
     * act is a constructor that makes a fly object.
     * It gives the Fly controls (left, right, and up), and 
     * it tells the Fly to eat a Food object when it 
     * touches it
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        checkKeys();
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        checkForFood();
        
        
    } 
    
    /**
     * checkKeys will allow the Fly to complete actions
     * (left, and right)
     * based on the keyboard presses
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkKeys()
    {
     // If the left arrow key is pressed...
     if ( Greenfoot.isKeyDown("a") == true )
     {
           // Turn the Fly left -5 degrees
           turn (-5);
     }
     // If the right arrow key is pressed...
     else if ( Greenfoot.isKeyDown("d") == true )
     {
          // Turn the Fly right 5 degrees
          turn (5);
     }
     // If the up arrow key is pressed...
     if ( Greenfoot.isKeyDown("w") == true )
     {
         // Make the Fly move forward
         move(4);
     }
     
    }
    
    /**
     * checkForFruit will allow the worms to complete their
     * action (disapear when the crab touches it)
     * based on the location of the Fly 
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkForFood()
    {
     // If the Fly is touching a Fruit...
     if ( isTouching(Food.class) == true)
     {
          // Eat the Fruit
          removeTouching(Food.class);
          //Call the method update from the Beach class
          ( (Beach)getWorld()).update();
     }
    }
}
