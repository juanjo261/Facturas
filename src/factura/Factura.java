package factura;


public class Factura {
   
    private int numero;
    private Cliente cliente;
    private Fecha fecha;
    private LineaFactura[] lineas = new LineaFactura[10];
    
   
 //en el constructor no se añade el VECTOR  
public Factura(int numero,Cliente cliente,Fecha fecha){
    
    this.numero=numero;
    this.cliente=cliente;
    this.fecha=fecha;
    
}    
    
//METODOS GET con VECTOR
    
public int getNumero(){
    return this.numero;
}
    
public Cliente getCliente(){
    return this.cliente;
}    
 
public Fecha getFecha(){
    return this.fecha;
}

//get del VECTOR

public LineaFactura[] getLineas(){
    return this.lineas;
}

//metodos Set menos de numero
public void setcliente(Cliente cliente){
    this.cliente=cliente;
}

public void setFecha(Fecha fecha){
    this.fecha=fecha;
}

//metodo SET del VECTOR
public void setLineas(LineaFactura[] lineas){
    this.lineas=lineas;
}


/*
nuevaLinea(Lineafactura if):Añadir una linea a la factura. 
En caso que lo haya podido añadir debe devolver un numero de linea
en la que lo ha insertado
En caso contrario (vector lleno) debe devolver -1.
*/

public int nuevaLinea (LineaFactura lf){
    int i=0;
    int numLinea=0;
    boolean insertado=false;
    
    //hago un while para que una vez introduzca algo pare el bucle
    //mientras i sea menor que el vector e insertado=false hace el bucle
    while((i<this.lineas.length)&&(insertado==false)){
        //si la posicion es el vector introduzco el dato "lf"
        if(this.lineas[i]==null){
            if (buscarProducto(String nombre) != this.lineas[i].getProducto().getNombre(){
                this.lineas[i]=lf;
                numLinea=i;
                insertado=true;
                //si me lo suma xq existe
            }  else this.lineas[i].setCantidad(this.lineas[i].getCantidad()+lf.getCantidad());
               
        } else i++;
        
        
}
    if (insertado==false) numLinea=-1;
    //el return fuera del bucle
    return numLinea;
}

/*
borrarLineaNumero(int numLinea) : Elimina la linea con el número
indicado.
*/

public void borrarLineaNumero(int numLinea){
    //simplemente cambiamos el valor de la casilla a null
    this.lineas[numLinea]=null;
       
}

/*

borrarLineaNombre(String nombre): Elimina la linea con el producto
indicado (buscar por nombre de producto).

*/

public void borrarLineaNombre(String nombre){
    
    int i=0;
    boolean borrar=false;
    //necesito recorrer el vector hasta que lo encuentre
    while ((i<this.lineas.length)&&(borrar==false)){
        //FALTA COMPROBACION DE QUE NO SEA NULO
        if (this.lineas[i] != null){
        //1º debo buscar el nombre del producto
         if(lineas[i].getProducto().getNombre() == nombre){
            //una vez encontrado lo borro
            this.lineas[i]=null;
         }else i++; 
            
        } else i++;
        
        
        
    }
}

    /*
    importeTotal(): Calcular el importe total.
    */
    
    public double importeTotal(){
       
        
    double total=0;    
    int i=0;
    boolean borrar=false;
    //necesito recorrer el vector, cuando llegue a una vacia deja de sumar y salga 
    while ((i<this.lineas.length)&&(borrar==false)){
        //si la casilla i no es null
        if (this.lineas[i] != null){
           //que sume el producto 
        total+=this.lineas[i].getProducto().getPrecio();//FALTA MULTIPLICAR POR EL PRECIO;
        i++;
        } else borrar=true;
        
    }    
        
        return total;
        
    
}


    /*
    ImporteTotalImpuestos(): Devuelve el importe total con el iva(21%).
    */
    
    
    public double importeTotalImpuestos(){
        
        double iva=0;
        double importeMasIva;
        
        iva=importeTotal()*(0.21);
         
        importeMasIva=importeTotal()+iva;
        
        return importeMasIva;
    }

    
    /*
    buscarProducto(String nombre): Buscar si una factura tiene un
determinado producto indicado en una de sus lineas. Debe
devolver el número de linea en caso de encontrarlo o -1 en caso de
que no.
    */
    public int buscarProducto(String nombre){
    
        int linea=0;
        int i=0;
        boolean borrar=false;
        //necesito recorrer el vector hasta que lo encuentre
        while ((i<this.lineas.length)&&(borrar==false)){
            //PONER PRIMERO QUE MIRE SI ES NULA LA POSICION, YA QUE ME DARIA FALLO
            if (this.lineas[i] != null){
            //1º debo buscar el nombre del producto
                if(lineas[i].getProducto().getNombre() == nombre){
                //una vez encontrado lo borro
                linea=i;
            
                }
        } else i++;
        
        if (borrar=false) linea=-1;
        
    }   return linea;
}
    
    
    
    
    
    /*
    imprimir(): Método para imprimir los datos de la factura Debe
incluir número de factura, fecha en formato corto, datos del cliente,
listado de productos e importe antes y después de impuestos.
    */
    public String imprimir(){
        int i;
        String informacion="------- Factura -------- "+"\n";
        
        informacion+="Nùmero de factura:" + getNumero()+"\n";
        informacion+="fecha de factura:" + getFecha().corta()+"\n";
        informacion+="-------- Datos del cliente ----------" + "\n";
        informacion+="Nombre del cliente:" + getCliente().getNombre()+"\n";
        informacion+="Nif del cliente:"+getCliente().getNif()+"\n";
        informacion+="Direccion del cliente:"+getCliente().getDireccion()+"\n";
        informacion+="Telefono del cliente:"+getCliente().getTelefono()+"\n";
        informacion+="-------- Listado de productos ------ "+"\n";
        //necesito un for para que me muestro todos los productos
        for (i=0;i<this.lineas.length;i++){
            if(this.lineas[i] != null){
        informacion+="Codigo producto:"+ this.lineas[i].getProducto().getCodigo()+"\n";
        informacion+="Nombre del producto:"+this.lineas[i].getProducto().getNombre() +"\n";
        informacion+="Descripcion del producto: "+this.lineas[i].getProducto().getDescripcion()+"\n";
        informacion+="cantidad del producto: "+this.lineas[i].getCantidad()+"\n";
        informacion+="Precio"+this.lineas[0].getProducto().getPrecio()+"\n";
            }
        }
       
        return informacion;
    }
    
    
    
    
    
    
    
    




}
