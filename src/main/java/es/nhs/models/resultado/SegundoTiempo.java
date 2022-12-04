package es.nhs.models.resultado;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class SegundoTiempo
{
    double spain;
    double italy;

    public SegundoTiempo(double spain, double italy)
    {
        this.spain = spain;
        this.italy = italy;
    }

    public SegundoTiempo()
    {
        this.spain = -1;
        this.italy = -1;
    }

    public double getSpain()
    {
        return spain;
    }

    public void setSpain(double spain)
    {
        this.spain = spain;
    }

    public double getItaly()
    {
        return italy;
    }

    public void setItaly(double italy)
    {
        this.italy = italy;
    }

    @Override
    public String toString()
    {
        return "SegundoTiempo{" +
                "spain=" + spain +
                ", italy=" + italy +
                '}';
    }
}
