import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flecha extends Actor
{
    /**
     * Act - do whatever the Flecha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Metodo para definir el tamaño de la flecha
    public Flecha()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2/8;
        int myNewWidth = (int)myImage.getWidth()*2/8;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    //Metodo para 
}
