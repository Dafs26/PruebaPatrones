import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean agregando = true;
        while (agregando){
        //se declara el objeto tarea y se hace uso del metodo que lo instancia  
        Recordatorio recordatorio = Recordatorio.CreateRecordatorio();
        //se inica la consulta para el llenado de los atributos del recordatorio
        System.out.println("Escriba el asunto de su recordatorio: ");
        recordatorio.SetAsunto(teclado.nextLine());
        System.out.println("Escriba el mes del recordatorio (numero)");
        recordatorio.SetMes(teclado.nextInt());
        System.out.println("Escriba el dia de su recordatorio (numero)");
        recordatorio.SetDia(teclado.nextInt());
        System.out.println("Escriba el año (numero)");
        recordatorio.SetYear(teclado.nextInt());
        System.out.println(recordatorio.ToString());
        //se consulta si desea agregar ese recordatorio
        System.out.println("desea agregar este recordatorio? Y/n");
        //si escribe "y" saldra del bucle, de resto se repetira 
        agregando = (teclado.next().equals("y")) ? false : true;
        }
        //aca iria modulo para anexar la informacion al archivo .txt
        teclado.close();
    }
}