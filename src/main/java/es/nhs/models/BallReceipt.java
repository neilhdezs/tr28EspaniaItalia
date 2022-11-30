package es.nhs.models;

public class BallReceipt
{

    private int id; // id
    private String name; // name for the attribute option the outcome of the ball receipt

    public BallReceipt()
    {

    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "BallReceipt{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
