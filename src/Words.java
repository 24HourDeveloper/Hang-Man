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
    private List<String> description;
    private String hint;

    public List<String> getList() {
        return list;
    }

    public String getWord() {
        return word;
    }

    public List<String> getDescription() {
        return description;
    }

    public String getHint() {
        return hint;
    }

    public void pullWordsFromFile() {

        list = new ArrayList<>();
        description = new ArrayList<>();
        try {

            BufferedReader br = new BufferedReader(new FileReader("HangmanWords.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("Description.txt"));


            while ((word = br.readLine()) != null) {
                list.add(word);
            }
            while ((hint = br2.readLine()) != null){
                description.add(hint);
            }
            br.close();
            br2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
