import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0; 
    //0 = jugar,  1= salir
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Se define el tamaño del fondo
        super(580, 550, 1);
        //Se llama al metodo colocarPiezasMundo para colocar la imagen de "jugar", "salir", y
        //"flecha" en la imagen de Menú
        colocarPiezasMundo();
    }
    
    //Metodo colocarPiezasMundo para definir la posición de cada pieza
    private void colocarPiezasMundo(){
        addObject(new TituloJuego(), 290, 140);
        addObject(new Jugar (), 290, 300);
        addObject(new Salir (), 290, 400);
        addObject(flecha, 150,300);
    }
    
    public void act(){
        //Esto es para el movimiento de la felcha, si se preciona en el teclado la flecha de
        //arriba entonces la flecha subira en la pantalla y viceversa si se presiona la fecha
        //de abajo en el teclado de la computadora
        if (Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion =0;//Se coloca la condicion que sea distinto de cero para que no suba la flecha arriba de jugar
        if (opcion<0) opcion =1; //Se colocar la condicion que sea distinto de 1 para que no baje despeus de salir
        
        //Se coloca la posicioń inicial de la flecha que es 150, 300 y se coloca opcion * 100 
        //para que baje la flecha justo en la opcion de salir
        flecha.setLocation(150, 300 + (opcion*100));
        
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
