import java.util.ArrayList;
import java.util.Random;

interface Operations{
    public boolean spawn(int chance);
    public boolean delete();
}

public class World implements Operations{
    private ArrayList<Entity> world_entities = new ArrayList<Entity>();
    public boolean spawn(int chance){
        
    }
    public boolean delete(int chance){ 

    }

    World(){

    }
}

public class Entity{
    Random random = new Random();
    private int reproduction_odds;
    private int death_odds;

    Entity(){
        this.reproduction_odds = random.nextInt(100);
        this.death_odds = random.nextInt(100);
    }

    public int getReproductionOdds(){return this.reproduction_odds;} //maybe not needed

    public int getDeathOdds(){return this.death_odds;} //maybe not needed

    public boolean reproduce(){
        int roll = random.nextInt(100);
        if (roll <= reproduction_odds){return true;}
        else{return false;}
    }
    
    public boolean die(){
        int roll = random.nextInt(100);
        if (roll <= death_odds){return true;}
        else{return false;}
    }

}

public class EvolutionModels{
    public static void main(String[] args){

    }
}