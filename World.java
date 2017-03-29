import java.util.*;
import java.util.Collections;

Public class World
{
    private int size;
    //2D linkedlist to hold things like resources and obstacles and agents
    private Point[][] points;
    private Robot bot;

    public World (int size, int obstacles, int resources)
    {
        points = new Point[size][size];

    }
    private void populateWorld(int obstacles, int resources)
    {
        Pair<int, int> tmpPair;
        for(int i = 0; i <= obstacles; i++)
        {
            //populate with obstacles in random places
            tmpPair = this.randPair();
            //the if statement below guards against the world being full
            if(tmpPair.getFirst() == -1)
                return;
            points[tmpPair.getFirst()][tmpPair.getSecond()].setObstacle();
        }
        for(int i = 0; i <= resources; i++)
        {
            //populate with resources in random places
            tmpPair = this.randPair();
            //the if statement below guards against the world being full
            if(tmpPair.getFirst() == -1)
                return;
            points[tmpPair.getFirst()][tmpPair.getSecond()].setResource();
        }

    }

    private Pair<int, int> randPair()
    {
        //Creates a pair with random x and y values that are unoccupied
        //If all spaces are full, returns -1, -1
        Random rand = new Random();
        int a = rand.nextInt(this.size);
        int b = rand.nextInt(this.size);
        for(int i = 0; i < size*size; i++)
        {
            if(points[a][b].isEmpty())
                return Pair.createPair(a, b);
            a = rand.nextInt(this.size);
            b = rand.nextInt(this.size);
        }
        return Pair.createPair(-1, -1);
    }

    private void tick()
    {
        //Runs through one time unit in the simulation
        //Triggers robot to eat, move, and think
        //Robot always tries to eat, and always uses resources
        //But must choose whether to move, or to plan during current phases

        //Update resources
        for(int i = 0; i < size; i ++)
        {
            for(int j = 0; j < size; j ++)
            {
                points[i][j].update();
            }
        }

    public void simulate()
    {
        //The shell for the entire simulation. This is the only public method
        //that is not a constructor
    }
    }
}
