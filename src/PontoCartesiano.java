public class PontoCartesiano {
    private double x;
    private double y; 
    private static double distancia;

    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double getdistancia() {
        return distancia;
    }
    /**
     * @return double return the x
     */
    public double getx() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setx(double x) {
        this.x = x;
    }

    /**
     * @return double return the y
     */
    public double gety() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void sety(double y) {
        this.y = y;
    }

   
    public double distanciaEntrePontos(PontoCartesiano p) {
        double distanciaX = Math.pow(this.x - p.getx(), 2);
        double distanciaY = Math.pow(this.y - p.gety(), 2);
         distancia = Math.sqrt(distanciaX + distanciaY);
        return Math.sqrt(distanciaX + distanciaY);
    }

    public double calcularDistancia(PontoCartesiano p1, PontoCartesiano p2) {
      //  System.out.println(distancia);
        return p1.distanciaEntrePontos(p2);

    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

}
