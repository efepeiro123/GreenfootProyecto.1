import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Salir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salir extends Actor
{
    /**
     * Act - do whatever the Salir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Salir()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*1/2;
        int myNewWidth = (int)myImage.getWidth()*1/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
