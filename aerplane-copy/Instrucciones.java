import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucciones extends World
{
    FlechaBlanca flecha = new FlechaBlanca();
    private int opcion = 0;
    /**
     * Constructor for objects of class Instrucciones.
     * 
     */
    public Instrucciones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(580, 550, 1); 
        
        colocarPiezasMundo();
    }
    private void colocarPiezasMundo(){
        addObject(new TituloInstrucciones(), 300, 60);
        addObject(new Textodeinstrucciones(), 295, 310);
        addObject(new Play(), 295, 440);
        addObject(new Exit(), 290, 490);
        addObject(flecha, 180,440);
    }
     public void act(){
        //Esto es para el movimiento de la felcha, si se preciona en el teclado la flecha de
        //arriba entonces la flecha subira en la pantalla y viceversa si se presiona la fecha
        //de abajo en el teclado de la computadora
        if (Greenfoot.isKeyDown("W") && opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("S") && opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion =0;//Se coloca la condicion que sea distinto de cero para que no suba la flecha arriba de jugar
        if (opcion<0) opcion =1; //Se colocar la condicion que sea distinto de 1 para que no baje despeus de salir
        
        //Se coloca la posicioń inicial de la flecha que es 150, 300 y se coloca opcion * 100 
        //para que baje la flecha justo en la opcion de salir
        flecha.setLocation(180, 440 + (opcion*50));
        
        //En esta parte si el usuario preciona space o enter escogera la opcion en la que la 
        //flecha lo indique y el juego iniciara o terminara
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0: //Esta opcion es para jugar
                    Greenfoot.setWorld(new Fondo2()); //new MyWorld creara el nuevo mundo, es decir, el mundo en donde esta el juego
                    break;
                case 1: //Esta opcion es para salir del juego
                    Greenfoot.stop();
                    break;
            }
        }
    }
}
