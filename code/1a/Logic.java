

/**
 * 
 */
public class Logic {

    /**
     * Default constructor
     */
    public Logic() {

    }

    /**
     * 
     */
    private int n = 0;

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private String[] arrData;

    /**
     * 
     */
    private double media;

    /**
     * 
     */
    private double desv;





    /**
     * 
     */
    public void logical()  {
        Input input = new Input();
        Data dataObj = new Data();
        Media mediaObj = new Media();
        DesvEst desvObj = new DesvEst();
        OutPut output = new OutPut();


        String rawData = input.readData("in2.txt");
        String[] arrData = dataObj.saveData(rawData);
        int n = arrData.length;

        double media = mediaObj.getMedia(arrData, n);
        double desv = desvObj.getDesvEst(media, arrData, n);

        String result = "n = " + n + "\nMedia = " + media + "\nDesviación estándar = " + desv;
        output.writeData("out1.txt", result);

        System.out.println(result);

    }

}
