Public class Pair <A, B>
{
    private A first;
    private B second;

    public Pair()
    {
        this.first = new A;
        this.second = new B;
    }

    public Pair<A, B> createPair(A first, B second)
    {
        return new Pair<A, B>(first, second);
    }

    public Pair(A first, B second)
    {
        this.first = first;
        this.second = second;
    }

    public A getFirst()
    {
        return this.first;
    }

    public B getSecond()
    {
        return this.second;
    }

    public void setFirst(A first)
    {
        this.first = first;
    }

    public void setSecond(B second)
    {
        this.second = second;
    }
}
