import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlechaBlanca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlechaBlanca extends Actor
{
    /**
     * Act - do whatever the FlechaBlanca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public FlechaBlanca()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2/14;
        int myNewWidth = (int)myImage.getWidth()*2/14;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
