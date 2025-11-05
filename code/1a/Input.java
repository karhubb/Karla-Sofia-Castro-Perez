import java.io.*;

/**
 * data : string
 * data : string
 */
public class Input {

    /**
     * Default constructor
     */
    public Input() {
    }

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private BufferedReader br = null;

    /**
     * 
     */
     public String readData(String inFile) {
        StringBuilder data = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }


}