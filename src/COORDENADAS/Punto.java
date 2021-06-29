
package COORDENADAS;

public class Punto {
    private double distancia;
    private double x;
    private double y;

    public Punto(double distancia, double x, double y) {
        this.distancia = distancia;
        this.x = x;
        this.y = y;
    }

    public Punto(double distancia, double x, double y, String[] direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getDistancia() {
        return distancia;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    @Override
    public String toString()
    {
        return this.distancia+" "+this.x+" "+this.y;
    }
}
