import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/*******************************************
Universidad del Valle de Guatemala 
Programación Orientada a objetos
Sección: 41

Evelyn Fernanda López Peiró
Carné: 21126
Fecha: 28/07/2021
*******************************************/
public class counter extends Actor
{
    //Propiedades
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;

    public counter(){
        this("");
    }
    //Metodo para definir el tamaño y letra que aparecen en pantalla como "score" y "nivel"
    public counter(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 16;

        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        image.setColor(Color.BLACK);
        
        updateImage();
    }
    //Metodo para aumentar o disminuir
    public void act() {
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
    }
    public void add(int score){
        target += score;
    }
    public void subtract(int score){
        target -= score;
    }
    public int getValue(){
        return value;
    }
    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 18);
    }
}
