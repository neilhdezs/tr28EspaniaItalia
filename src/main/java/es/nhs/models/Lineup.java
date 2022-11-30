package es.nhs.models;

public class Lineup
{

    private Player player;
    private Position position;

    public Lineup()
    {

    }

    public Player getPlayer()
    {
        return this.player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public Position getPosition()
    {
        return this.position;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    @Override
    public String toString()
    {
        return "Lineup{" + "player=" + player + ", position=" + position + '}';
    }
}
