import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo2 extends World
{
    private counter score;
    private counter nivel;
    private int velocidad_avion;
    private int adelantar;
    private int num_nivel;
    private aerplane fer;
    private int enemigos;
    /**
     * Constructor for objects of class Fondo2.
     * 
     */
    public Fondo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(580, 550, 1); 
        adelantar = 0;
        num_nivel = 4;
        velocidad_avion = 2;
        
        score = new counter ("Score: ");
        nivel = new counter ("Nivel: ");
        nivel.add(1);
        fer = new aerplane(velocidad_avion);
        
        addObject(fer, 285, 480);
        addObject(nivel, 500, 50);
        addObject(score, 100, 50);
    }
    
    public void act(){
        dificultad();
        nuevos_enemigos();
        
    }
    
    public int getRandomNumber(int start, int end){
        int normal= Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    public void puntuacion(int valor){
        score.add(valor);
    }
    
    public void adelantar(){
        adelantar++;
    }
    
    public void rivales(){
        enemigos--;
    }
    
    public void dificultad(){
        if(adelantar == num_nivel){
            adelantar = 0;
            num_nivel = num_nivel + 2;
            velocidad_avion++;
            nivel.add(1);
            fer.velocidad();
        }
    }
    
    public void nuevos_enemigos(){
        if (enemigos == 0){
            int camino_bombas = getRandomNumber(0,6);
            
           if(camino_bombas == 0){
                addObject(new bomba(velocidad_avion), 50,90);
            }
            else if(camino_bombas == 1){
                addObject(new bomba(velocidad_avion), 150,90);
            }
            else if(camino_bombas == 2){
                addObject(new bomba(velocidad_avion), 250,90);
            }
            else if(camino_bombas == 3){
                addObject(new bomba(velocidad_avion), 350,90);
            }
            else if(camino_bombas == 4){
                addObject(new bomba(velocidad_avion), 450,90);
            }
            else{
                addObject(new bomba(velocidad_avion), 550,90);
            }
            
            //enemigos = 2;
            
            camino_bombas++;
            camino_bombas = camino_bombas % 3;
            
           if(camino_bombas == 0){
                addObject(new bomba(velocidad_avion), 50,90);
            }
            else if(camino_bombas == 1){
                addObject(new bomba(velocidad_avion), 150,90);
            }
            else if(camino_bombas == 2){
                addObject(new bomba(velocidad_avion), 250,90);
            }
            else if(camino_bombas == 3){
                addObject(new bomba(velocidad_avion), 350,90);
            }
            else if(camino_bombas == 4){
                addObject(new bomba(velocidad_avion), 450,90);
            }
            else{
                addObject(new bomba(velocidad_avion), 550,90);
            }
            
            enemigos = 2;
            
           /* camino_bombas++;
            camino_bombas = camino_bombas % 2;
            
           if(camino_bombas == 0){
                addObject(new bomba(velocidad_avion), 50,90);
            }
            else if(camino_bombas == 1){
                addObject(new bomba(velocidad_avion), 150,90);
            }
            else if(camino_bombas == 2){
                addObject(new bomba(velocidad_avion), 250,90);
            }
            else if(camino_bombas == 3){
                addObject(new bomba(velocidad_avion), 350,90);
            }
            else if(camino_bombas == 4){
                addObject(new bomba(velocidad_avion), 450,90);
            }
            else{
                addObject(new bomba(velocidad_avion), 550,90);
            }
            
            camino_bombas++;
            camino_bombas = camino_bombas % 3;
            
           if(camino_bombas == 0){
                addObject(new bomba(velocidad_avion), 50,90);
            }
            else if(camino_bombas == 1){
                addObject(new bomba(velocidad_avion), 150,90);
            }
            else if(camino_bombas == 2){
                addObject(new bomba(velocidad_avion), 250,90);
            }
            else if(camino_bombas == 3){
                addObject(new bomba(velocidad_avion), 350,90);
            }
            else if(camino_bombas == 4){
                addObject(new bomba(velocidad_avion), 450,90);
            }
            else{
                addObject(new bomba(velocidad_avion), 550,90);
            }
            
            camino_bombas++;
            camino_bombas = camino_bombas % 4;
            
           if(camino_bombas == 0){
                addObject(new bomba(velocidad_avion), 150,90);
            }
            else if(camino_bombas == 1){
                addObject(new bomba(velocidad_avion), 50,90);
            }
            else if(camino_bombas == 2){
                addObject(new bomba(velocidad_avion), 250,90);
            }
            else if(camino_bombas == 3){
                addObject(new bomba(velocidad_avion), 350,90);
            }
            else if(camino_bombas == 4){
                addObject(new bomba(velocidad_avion), 450,90);
            }
            else{
                addObject(new bomba(velocidad_avion), 550,90);
            }
           
            enemigos = 5;*/
            
        
        }
    }
}
