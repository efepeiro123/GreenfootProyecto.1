import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*******************************************
Universidad del Valle de Guatemala 
Programación Orientada a objetos
Sección: 41

Evelyn Fernanda López Peiró
Carné: 21126
Fecha: 28/07/2021
*******************************************/
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
        int myNewHeight = (int)myImage.getHeight()*1/5;
        int myNewWidth = (int)myImage.getWidth()*1/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
     
}
