package es.nhs.models.resultado;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class PartidoCompleto
{
    int spain;
    int italy;

    public PartidoCompleto()
    {
        this.spain = -1;
        this.italy = -1;
    }

    public int getSpain()
    {
        return spain;
    }

    public void setSpain(int spain)
    {
        this.spain = spain;
    }

    public int getItaly()
    {
        return italy;
    }

    public void setItaly(int italy)
    {
        this.italy = italy;
    }
}
