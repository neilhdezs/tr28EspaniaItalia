package es.nhs.models.resultado;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/12/2022
 */
public class PorcentajePosesion
{

    PrimerTiempo primer_tiempo;
    SegundoTiempo segundo_tiempo;
    PartidoCompleto partido_completo;

    public PorcentajePosesion()
    {
        this.primer_tiempo = new PrimerTiempo();
        this.segundo_tiempo = new SegundoTiempo();
        this.partido_completo = new PartidoCompleto();
    }

    public PrimerTiempo getPrimer_tiempo()
    {
        return primer_tiempo;
    }

    public void setPrimer_tiempo(PrimerTiempo primer_tiempo)
    {
        this.primer_tiempo = primer_tiempo;
    }

    public SegundoTiempo getSegundo_tiempo()
    {
        return segundo_tiempo;
    }

    public void setSegundo_tiempo(SegundoTiempo segundo_tiempo)
    {
        this.segundo_tiempo = segundo_tiempo;
    }

    public PartidoCompleto getPartido_completo()
    {
        return partido_completo;
    }

    public void setPartido_completo(PartidoCompleto partido_completo)
    {
        this.partido_completo = partido_completo;
    }
}
