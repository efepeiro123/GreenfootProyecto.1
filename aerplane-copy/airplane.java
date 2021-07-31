import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*******************************************
Universidad del Valle de Guatemala 
Programación Orientada a objetos
Sección: 41

Evelyn Fernanda López Peiró
Carné: 21126
Fecha: 28/07/2021
*******************************************/
public class airplane extends Actor
{
    //Propiedades
    private int speed;
    
    //Metodo para definir el tamaño del avión junto con la velocidad
    public airplane(int v){
        speed= v;
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2/4;
        int myNewWidth = (int)myImage.getWidth()*2/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public airplane()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2/4;
        int myNewWidth = (int)myImage.getWidth()*2/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    
    /**
    Aerplane
     */

    public void act()
    {
        //Esta parte hace que el avión siempre este a 90 grados cuando inicia
        //el juego
        if(getRotation()!=270)
            setRotation(270);
        //Con las letras w,s,a,d se moverá el avión 
        if(Greenfoot.isKeyDown("w")){
            if(getY() > 100)//los numeros que se indican en cada if como en este caso indican el limite hasta el cual puede llegar el avión
            setLocation(getX() , getY() - speed);
        }
        if(Greenfoot.isKeyDown("s")){
            if(getY()< 490)
            setLocation(getX() , getY() + speed);
        }
        if(Greenfoot.isKeyDown("a")){
            if(getX() > 50)
            setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            if(getX() < 540)
            setLocation(getX() + speed, getY());
        }
                
        choque();
    }
    //Con este metodo sucede que si el avión toca una bomba. el juego termina o para
    //porque chocaron la bomba y el avión
    public void choque(){
        Actor collided = getOneIntersectingObject(bomba.class);
        if (collided != null)
        {
            Greenfoot.playSound("GameOver (mp3cut.net).wav");
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Final());
            //Greenfoot.stop();
        }
    }
    // Con este metodo la velocidad del avión va aumentando con el tiempo y niveles
    public void velocidad(){
        speed++;
    }
}
