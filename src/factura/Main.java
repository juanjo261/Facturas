package factura;
import java.util.Scanner;
import java.util.Calendar;

public class Main {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        
       /* 
        En otra clase (la que contiene el método main) se deberá crear un cliente
        con los siguientes datos:
        nif: B-21212121
        nombre: Informatica manises s.l.
        direccion: Avda. Blasco Ibañez nº 4
        telefono: 963 21 45 78
        
        
       */ 
        
       Cliente c1 = new Cliente("B-21212121","Informatica manises s.l.","Avda. Blasco Ibañez nº 4","963 21 45 78");
       
       //crear productos
       Producto p1 = new Producto("25UM58-P","LG 25UM58-P","Monitor UltraWide de 64 cm",159);
       
       Producto p2 = new Producto("sdskssd240","Sandisk ssd 240","Disco duro ssd de 240 Gb",89);
      
       Producto p3 = new Producto("sdskpd32","Pendrive 32 GB","Pendrive ScanDisk - 32 GB - USB 3.0",10);
       
       
       /*
       Crear una factura con número 1, el cliente anterior, con fecha de
        hoy y los productos anteriores y las siguientes unidades.
        2 Monitores
        10 disco ssd
        7 pendrive’s.
       
      */
      
        //obtener la fecha del sistema
        Calendar cal=Calendar.getInstance();
        int anyo= cal.get(Calendar.YEAR);
        int mes= cal.get(Calendar.MONTH);
        int dia=cal.get(Calendar.DAY_OF_MONTH);
      
        //creamos una nueva variable donde tenemos una nueva clase tipo fecha
       Fecha fechaHoy= new Fecha(dia,mes,anyo);
      
        
   
   
      
      //crear objeto lineaFactura para cada producto
      
      LineaFactura lf1 = new LineaFactura(p1,2);
      LineaFactura lf2 = new LineaFactura(p2,10);
      LineaFactura lf3 = new LineaFactura(p3,7);
      LineaFactura lf4 = new LineaFactura(p1,7);
      
      
      Factura f1 = new Factura(1,c1,fechaHoy);
     //añadimos la factura de cada al vector
      f1.nuevaLinea(lf1);
      f1.nuevaLinea(lf4);
      System.out.println(f1.imprimir());  
   
  
   
      
      
      //PRIMERO AÑADIR UN PRODUCTO, SI EXISTE, QUE SE SUME A LA CANTIDAD DEL EXISTENTE
     
      
        
    
}    
}

