package es.nhs.models;

public class Interception
{
    private OutCome outcome;

    Interception()
    {

    }

    public OutCome getOutcome()
    {
        return outcome;
    }

    public void setOutcome(OutCome outcome)
    {
        this.outcome = outcome;
    }

    @Override
    public String toString()
    {
        return "Interception{" +
                "outcome=" + outcome +
                '}';
    }
}
