import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by A on 11/18/2017.
 */
public class Words {

    private List<String> list;
    private String word;

    public List<String> getList() {
        return list;
    }

    public String getWord() {
        return word;
    }

    public void pullWordsFromFile() {

        list = new ArrayList<>();
        try {

            BufferedReader br = new BufferedReader(new FileReader("HangmanWords.txt"));

            while ((word = br.readLine()) != null) {
                System.out.println(word);
                list.add(word);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
