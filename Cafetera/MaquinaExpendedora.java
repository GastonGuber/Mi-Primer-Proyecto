class MaquinaExpendedora{
    //Atributos de clase
    protected static final int maxCafe=200;

    //Atributos de instancia
    protected int cantCafe;

    //Constructor
    public MaquinaExpendedora(){
        cantCafe=maxCafe;
    }

    //Comandos
    public void cafe(){
        if(cantCafe>0)
            cantCafe--;
    }
    public void recargarCafe(){
        cantCafe=maxCafe;
    }
    
    //consulta
    public int vasosCafe(){
        return cantCafe;
    }
}
