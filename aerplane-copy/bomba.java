 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*******************************************
Universidad del Valle de Guatemala 
Programación Orientada a objetos
Sección: 41

Evelyn Fernanda López Peiró
Carné: 21126
Fecha: 28/07/2021
*******************************************/
public class bomba extends Actor
{
    //Propiedad
    private int speed;
    
    public bomba(int v){
        speed = v;
    }
    /**
     * Act - do whatever the bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Metodo para remover la bomba cuando el avión las esquive
        setLocation(getX(), getY() + speed);
        if( getY() >= getWorld().getHeight() - 1 ){
            Fondo2 juego = (Fondo2) getWorld();
            //Greenfoot.playSound("000923726_prev.wav");
            juego.removeObject(this);
            juego.puntuacion(2); //esto aumenta los puntos de 2 en 2 con forme las bombas van pasando
            juego.rivales();
            juego.adelantar(); 
        }
    }
}
