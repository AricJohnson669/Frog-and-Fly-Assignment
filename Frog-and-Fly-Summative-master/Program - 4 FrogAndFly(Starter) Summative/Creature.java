import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creature extends Actor
{
    /**
     * atEdgeOfWorld makes a barrier on the
     * world so that an object cant go off screen
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public boolean atEdgeOfWorld()
    {
        return getX()<5 || getY()<5 || getX()>getWorld().getWidth()-5 || getY()>getWorld().getHeight()-5;
    }   
}
