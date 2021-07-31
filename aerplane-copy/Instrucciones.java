import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*******************************************
Universidad del Valle de Guatemala 
Programación Orientada a objetos
Sección: 41

Evelyn Fernanda López Peiró
Carné: 21126
Fecha: 28/07/2021
*******************************************/
public class Instrucciones extends World
{
    //Propiedades
    FlechaBlanca flecha = new FlechaBlanca();
    private int opcion = 0;
    /**
     * Constructor for objects of class Instrucciones.
     * 
     */
    public Instrucciones()
    {    
         // Se define el tamaño del fondo.
        super(580, 550, 1); 
        //Se llama al metodo colocarPiezasMundo para colocar la imagen de "play", "exit", etc. en la imagen de Menú
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
                    Greenfoot.setWorld(new MenuPrincipal());
                    Greenfoot.stop();
                    break;
            }
        }
    }
}
