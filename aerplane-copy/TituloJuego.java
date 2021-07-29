import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TituloJuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TituloJuego extends Actor
{
    /**
     * Act - do whatever the TituloJuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public TituloJuego()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*1;
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth, myNewHeight);
    }
}
