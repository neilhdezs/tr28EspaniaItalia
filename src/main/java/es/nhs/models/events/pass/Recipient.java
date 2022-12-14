package es.nhs.models.events.pass;

public class Recipient
{
    private int id; // id
    private String name; // name of the Position

    public Recipient ()
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
        return "Recipient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
