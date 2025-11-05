

/**
 * 
 */
public class Media {

    /**
     * Default constructor
     */
    public Media() {
    }

    /**
     * 
     */
    private double media;

    /**
     * 
     */
    public double getMedia(String[] dataList, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(dataList[i]);
        }
        return sum / n;
    }
}
