import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*******************************************
Universidad del Valle de Guatemala 
Programación Orientada a objetos
Sección: 41

Evelyn Fernanda López Peiró
Carné: 21126
Fecha: 28/07/2021
*******************************************/
public class Fondo2 extends World
{
    //Propiedades del mundo Fondo2
    private counter score;
    private counter nivel;
    private int velocidad_avion;
    private int adelantar;
    private int num_nivel;
    private airplane fer;
    private int enemigos;
    
    /**
     INICIO DE MÉTODOS
     */
    public Fondo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //Tamaño del fondo
        super(580, 550, 1); 
        
        //Variables
        adelantar = 0;
        num_nivel = 4;
        velocidad_avion = 2;
        
        //Constructores
        score = new counter ("Score: ");
        nivel = new counter ("Nivel: ");
        nivel.add(1);
        fer = new airplane(velocidad_avion);
        
        
        addObject(fer, 285, 480);
        addObject(nivel, 500, 50);
        addObject(score, 100, 50);
        
    }
    
    // Método que llama a otros metodos para funcionar
    public void act(){
        dificultad();
        nuevos_enemigos();
        
    }
    
    //Metodo para obtener un numero random que se utilizar para escoger la 
    //cantidad de bombas que caerán o se mostraran en pantalla
    public int getRandomNumber(int start, int end){
        int normal= Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    //Metodo para obtener los puntos, se van contando conforme las bombas se esquivan
    public void puntuacion(int valor){
        score.add(valor);
    }
    
    //Metodo para aumentar la velocidad
    public void adelantar(){
        adelantar++;
    }
    
    //Metodo para disminuir la cantidad de enemigos, para que desaparezcan de la pantalla
    public void rivales(){
        enemigos--;
    }
    
    
    //Metodo para umentar la velocidad del avión por cada nivel 
    public void dificultad(){
        if(adelantar == num_nivel){
            Greenfoot.playSound("000923726_prev.wav");
            adelantar = 0;
            num_nivel = num_nivel + 2;
            velocidad_avion++;
            nivel.add(1);
            fer.velocidad();
        }
    }
    
    
    //Metodo para encontrar un numero random de enemigos y mostrarlo en pantalla
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
        
        }
    }
}

