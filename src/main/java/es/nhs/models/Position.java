package es.nhs.models;


/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 30/11/2022
 * In this Class Storage the Position
 */
public class Position
{
    private int id; // id
    private String name; // name of the Position

    public Position()
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
        return "Position{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
