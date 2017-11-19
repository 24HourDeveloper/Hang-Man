import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by A on 11/18/2017.
 */
public class Words {

    List<String> list = new ArrayList<>();


    public void pullWordsFromFile() {
        String str;
        try {

            BufferedReader br = new BufferedReader(new FileReader("HangmanWords.txt"));

            while ((str = br.readLine()) != null) {
                list.add(str);
            }
            br.close();

            System.out.println(list.get(2));
        } catch (IOException e) {
            System.out.println("hi");
        }
    }

}
