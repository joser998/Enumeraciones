package enumeraciones;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    //Atributo de Paises.
    /* Al ser un Atributo de tipo final es necesario inicializarlo, en este caso se inicializo mediante un Constructor. */
    private final int paises;

    //Constructor de cada elemento de la enumeracion
    Continentes(int paises) {
        this.paises = paises;
    }
    
    //Metodo Getter para Paises
        //Con este metodo accedemos al parametro int que tiene cada pais
    public int getPaises(){
        return this.paises;
    }   
}