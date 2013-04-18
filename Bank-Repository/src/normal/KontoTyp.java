package normal;

public enum KontoTyp {

    SPARKONTO(0),
    GIROKONTO(1);
 
    int wert;
 
    private KontoTyp(int wert)
    {
        this.wert = wert;
    }
}
