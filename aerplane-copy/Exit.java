import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
     //Metodo para definir tamaño de la palabra exit
    public Exit()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*3/5;
        int myNewWidth = (int)myImage.getWidth()*3/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
