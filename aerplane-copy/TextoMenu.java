import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextoMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextoMenu extends Actor
{
    /**
     * Act - do whatever the TextoMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public TextoMenu()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*4/5;
        int myNewWidth = (int)myImage.getWidth()*4/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
