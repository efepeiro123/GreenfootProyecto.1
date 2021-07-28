import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomba extends Actor
{
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
        // Add your action code here.
        setLocation(getX(), getY() + speed);
        if( getY() >= getWorld().getHeight() - 1 ){
            Fondo2 juego = (Fondo2) getWorld();
            juego.removeObject(this);
            juego.puntuacion(2);
            juego.rivales();
            juego.adelantar(); 
        }
    }
}
