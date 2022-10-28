import java.util.ArrayList;
import java.util.Random;

interface Operations{
    public void spawn();
    public void delete(Entity to_kill);
}

class World implements Operations{
    private ArrayList<Entity> world_entities = new ArrayList<Entity>(); //variable-size python-esque list
    private ArrayList<Entity> entites;
    
    public void spawn(){
        this.entites.add(new Entity());
    }
    public void delete(Entity to_kill){ 
        int kill_index = this.entites.indexOf(to_kill); //find index of passed Entity
        this.entites.remove(kill_index); //remove Entity at index from list
    }

    World(){this.entites = world_entities;}

    public ArrayList<Entity> getWorldEntites(){return this.entites;}

    public String viewEntites(){
        int num;
        num = this.entites.size();
        return String.format("%s Entites in world", num); //Allows num to be converted to string
    }

}

class Entity{
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
        //boolean running = true;
        //while (running) {

        //}
        
    }
}