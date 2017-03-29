
Public class Robot
{
    private int x;
    private int y;
    private char d;
    private int resoures;
    private int usePerTick;
    private boolean alive;

    public Robot()
    {
        this.x = 0;
        this.y = 0;
        this.d = 'u';
    }

    public Robot(int x, int y, char d)
    {
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setD(char d)
    {
        this.d = d;
    }

    public boolean isAlive()
    {
        return this.alive;
    }

    public void update()
    {
        //TODO: consumption
        this.consume();
        if(!this.alive)
            return;
    }

    public void gather()
    {
        //TODO: this
        //need to eat, which requires knowledge of the world and the square
        //the agent is in
        //likely have agent know world and use this to call world functions
        //to ask current space for food
    }

    private void consume()
    {
        //eat, gather food, and check if still alive
        this.gather();
        this.resources -= this.usePerTick;
        this.alive = (this.resources > 0) ? true : false;

    }
}
