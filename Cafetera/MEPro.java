class MEPro extends MaquinaExpendedora{
    //Atributos de clase
    protected static final int maxCarioca=200;
    
    //Atributos de instancia
    protected int cantCarioca;
    
    //Constructor
    public MEPro(){
        super();
        cantCarioca=maxCarioca;
    }
    
    //Comandos
    public void carioca(){
        if(cantCarioca>0){
            cantCarioca--;
        }
    }
    public void recargarCarioca(){
        cantCarioca=maxCarioca;
    }
    
    //Consultas
    public int vasosCarioca(){
        return cantCarioca;
    }
}