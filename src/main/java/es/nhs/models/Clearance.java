package es.nhs.models;

public class Clearance
{
    private Boolean aerial_won;
    private BodyPart body_part;

    public Clearance()
    {

    }

    public Boolean getAerial_won()
    {
        return this.aerial_won;
    }

    public void setAerial_won(Boolean aerial_won)
    {
        this.aerial_won = aerial_won;
    }

    public BodyPart getBody_part()
    {
        return this.body_part;
    }

    public void setBody_part(BodyPart body_part)
    {
        this.body_part = body_part;
    }

    @Override
    public String toString()
    {
        return "Clearance{" + "aerial_won=" + aerial_won + ", body_part=" + body_part + '}';
    }
}
