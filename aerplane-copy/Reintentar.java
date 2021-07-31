import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*******************************************
Universidad del Valle de Guatemala 
Programación Orientada a objetos
Sección: 41

Evelyn Fernanda López Peiró
Carné: 21126
Fecha: 28/07/2021
*******************************************/
public class Reintentar extends Actor
{
    /**
     * Act - do whatever the Reintentar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    //Metodo para definir el tamaño de la palabra reintentar
    public Reintentar()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2/3;
        int myNewWidth = (int)myImage.getWidth()*2/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
