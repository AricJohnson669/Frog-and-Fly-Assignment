import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    /**
     * Frog sets the frog's speed to a random number
     * in-between 4 and 8
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber ( 4 ) + 4 ;
    }
    
    /**
     * act is the constructor that makes a Frog object.
     * It tells the Frog to walk, the speed in which the Frog
     * walks, it tells the Frog to turn 7 degrees when it hits the edge 
     * of the world, and it tells the FRog to eat a Fly when they touch
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        
        
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */
        walk();
        
        
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        atEdge();
        
        
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        checkForFlys();
        
    } 
    
    /**
     * walk tellse the Frog how fast to move, and the way it moves, ( 35 percent
     * of the time it turns right or left)
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void walk()
    {
        
        // If the random number is less then 35...
        if ( Greenfoot.getRandomNumber (100) > 35 )
        {
            move(speed);
        }
            else 
            {
                if ( Greenfoot.getRandomNumber (2) < 1 ){
                //Turn counterclockwise -15 degrees
                turn (-15);
                move(speed);
                
            }
            else 
            {
                //Turn clockwise 15 degrees
                turn (15);
                move(speed);
            }
        }  
    }
    
    //tells the frog when it hits the edge of the world
    /**
     * atEdge tells the Frog to turn 7 degrees whenever 
     * it hits the edge of the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void atEdge()
    {
       if (isAtEdge() == true)
        {
            turn (7);
        } 
    }
    
    /**
     * checkForFlys makes the program stop whenever
     * the Frog touches the fly. It also removes the Fly
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void checkForFlys()
    {
        //If the Frog touches the fly...
        if ( isTouching( Fly.class ) == true )
        {
           //Eat the fly and stop the program
           removeTouching(Fly.class);
           Greenfoot.stop();
        }
    }
}
