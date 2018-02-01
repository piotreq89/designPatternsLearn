package designsPatterns.adapter2;

/**
 * Created by piotr.walenda on 22.01.2018.
 */
public class DesignPatternsAdapter {

    public static void main(String[] args){
        Writer writer = new DataWriter();
        writer.save("Super Value");
    }
}
