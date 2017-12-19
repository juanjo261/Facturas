
package factura;


public class LineaFactura {
   
    private Producto producto;
    private int cantidad;
    
    public LineaFactura(Producto producto,int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
}    
    
public Producto getProducto(){
    return this.producto;
}    
    
public int getCantidad(){
    return this.cantidad;
}    
    
public void setProducto(Producto producto){
    this.producto=producto;
}    
    
public void setCantidad(int cantidad){
    this.cantidad=cantidad;
}    
    
    
    
    
    
    
    
    
    
    
}
