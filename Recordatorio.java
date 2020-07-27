class Recordatorio implements Ifecha{
    //se declara un objeto de tipo Recordatorio 
    private static Recordatorio recordatorio;
    private int dia;
    private int mes;
    private int year;
    private String asunto;
    //se crea un constructor privado para que no pueda ser instanciado con el "new Recordatorio()"
    private Recordatorio(){}
    //Se crea un metodo para aplicar el patron singleton
    //Lo cual hara que solo se instancie el objeto una sola vez
    public static Recordatorio CreateRecordatorio(){
        if(recordatorio == null){
            recordatorio = new Recordatorio();
        }
        return recordatorio;
    }
    // getters y setters
    public String GetAsunto(){
        return asunto;
    }
    public void SetAsunto(String asunto){
        this.asunto = asunto;
    }
    @Override
    public int Getdia() {
        return dia;
    }
    @Override
    public void SetDia(int dia) {
        this.dia = dia;
    }
    @Override
    public int GetMes() {
        return mes;
    }
    @Override
    public void SetMes(int mes) {
        this.mes = mes;
    }
    @Override
    public int GetYear() {
        return year;
    }
    @Override
    public void SetYear(int year) {
        this.year = year;
    }
    @Override
    public String GetFecha() {
        return "la fecha es:"+
        year+
        "-"+
        mes+
        "-"+
        dia;
    }
    public String ToString(){
        return "Detalles del recordatorio:\n"+
        year+
        "-"+
        mes+
        "-"+
        dia+
        "\nAsunto: "+
        asunto;
    }
}