public class Jellyfish{
    private String colour;
    private int lives;
    private boolean alive;
    public Jellyfish(String colour,int lives){
        this.colour=colour;
        this.lives=lives;
        if(lives>0){
            alive= true;
        }
    }
}