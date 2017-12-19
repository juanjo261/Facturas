
package factura;

import java.util.Calendar;


public class Fecha {
    
    
    private int dia;
    private int mes;
    private int anyo;
    
   
   public Fecha(int dia,int mes, int anyo){
       
       this.dia=dia;
       this.mes=mes;
       this.anyo=anyo;
       
   } 
    
   public int getDia(){
       return this.dia;
   } 
    
    
   public int getMes(){
       return this.mes;
   } 
    
   public int getAnyo(){
       return this.anyo;
   } 
    
    
   public void setDia(){
      this.dia=dia; 
      
   } 
    
    
   public void setMes(){
       this.mes=mes;
   } 
    
   //metodo que muestra la fecha en formato corto
   
   public String corta(){        
        return this.dia + "-" + this.mes + "-" + this.anyo;         
    }
   
  
   
   
   
    
}
