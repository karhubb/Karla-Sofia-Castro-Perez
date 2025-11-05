
/**
 * 
 */
public class DesvEst {

    /**
     * Default constructor
     */
    public DesvEst() {
    }

    /**
     * 
     */
    public double getDesvEst(double media, String[] dataList, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double val = Double.parseDouble(dataList[i]);
            sum += Math.pow(val - media, 2);
        }
        return Math.sqrt(sum / (n - 1)); // desviación estándar muestral
    }


}

