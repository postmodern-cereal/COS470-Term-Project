Public class Point
{
    private int resourcesAvailable;
    private int regenPerTick;
    //have something about resource, obstacle, and bot
    private boolean empty;
    private boolean resource;
    private boolean bot;
    private boolean obstacle;

    public Point()
    {
        this.resourcesAvailable = 0;
        this.regenPerTick = 0;
        this.empty = true;
        this.bot = false;
        this.obstacle = false;
        this.resource = false;
    }

    public Point (Point otherPoint)
    {
        this.x = otherPoint.getX();
        this.y = otherPoint.getY();
    }

    public void setObstacle()
    {
        if(!this.empty)
            return
        this.obstacle = true;
        this.empty = false;
    }

    public void setResource()
    {
        if(!this.empty)
            return
        this.resource = true;
        this.empty = false;
    }

    public void update()
    {
        this.resourcesAvailable += this.regenPerTick;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void setX(int X)
    {
        this.x = X;
    }

    public void setY(int Y)
    {
        this.y = Y;
    }
}
