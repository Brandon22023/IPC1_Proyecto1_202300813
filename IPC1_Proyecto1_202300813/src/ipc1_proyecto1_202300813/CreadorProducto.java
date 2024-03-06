
package ipc1_proyecto1_202300813;


public class CreadorProducto {
    private int codigoProducto;
    private String nombreProducto;
    private double PrecioProducto;
    private String DescripciónProdcuto;  
   private int cantidadProducto;

    public CreadorProducto(int codigoProducto, String nombreProducto, double PrecioProducto, String DescripciónProdcuto, int cantidadProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.PrecioProducto = PrecioProducto;
        this.DescripciónProdcuto = DescripciónProdcuto;
        this.cantidadProducto = cantidadProducto;
    }



    /**
     * @return the codigoProducto
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto the codigoProducto to set
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the PrecioProducto
     */
    public double getPrecioProducto() {
        return PrecioProducto;
    }

    /**
     * @param PrecioProducto the PrecioProducto to set
     */
    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    /**
     * @return the DescripciónProdcuto
     */
    public String getDescripciónProdcuto() {
        return DescripciónProdcuto;
    }

    /**
     * @param DescripciónProdcuto the DescripciónProdcuto to set
     */
    public void setDescripciónProdcuto(String DescripciónProdcuto) {
        this.DescripciónProdcuto = DescripciónProdcuto;
    }

    /**
     * @return the cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * @param cantidadProducto the cantidadProducto to set
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
   
    
}
