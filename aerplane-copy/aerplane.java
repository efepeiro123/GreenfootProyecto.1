import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aerplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aerplane extends Actor
{
    private int speed;

    
    public aerplane(int v){
        speed= v;
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2/4;
        int myNewWidth = (int)myImage.getWidth()*2/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public aerplane()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2/4;
        int myNewWidth = (int)myImage.getWidth()*2/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    
    /**
     * Act - do whatever the aerplane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        if(getRotation()!=270)
            setRotation(270);
        // Add your action code here.
        if(Greenfoot.isKeyDown("w")){
            if(getY() > 100)
            setLocation(getX() , getY() - speed);
        }
        if(Greenfoot.isKeyDown("s")){
            if(getY()< 490)
            setLocation(getX() , getY() + speed);
        }
        if(Greenfoot.isKeyDown("a")){
            if(getX() > 50)
            setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            if(getX() < 540)
            setLocation(getX() + speed, getY());
        }
        /* if(Greenfoot.isKeyDown("up")){
            setVelocidad(speed+2);
            
        }
        if(Greenfoot.isKeyDown("down")){
            setVelocidad(speed-2);
            
        }*/
        
        choque();
    }
    public void choque(){
        Actor collided = getOneIntersectingObject(bomba.class);
        if (collided != null)
        {
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void velocidad(){
        speed++;
    }
}
