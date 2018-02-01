package designsPatterns.adapter2;

/**
 * Created by piotr.walenda on 22.01.2018.
 */
public class DataWriter implements Writer {

    public void save(String data) {
        NewWriter adapter = new NewWriter();
        adapter.save(data, 0);
    }
}
