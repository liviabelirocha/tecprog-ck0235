package trabalho03.questao03;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountWords {
    private List<String> sentence_;

    CountWords(String[] sentence) {
        sentence_ = new ArrayList<String>();
        for (int i = 0; i < sentence.length; i++)
            sentence_.add(sentence[i]);
    }

    void numberAndOccurrences() {
        int counter = sentence_.size();

        for (int i = 0; i < sentence_.size(); i++)
            for (int j = i + 1; j < sentence_.size(); j++)
                if (sentence_.get(i).equals(sentence_.get(j)))
                    counter--;

        System.out.println("Total de Palavras: " + sentence_.size());
        System.out.println("Total de Palavras Distintas: " + counter);
    }

    void wordFrequency() {
        boolean p[] = new boolean[sentence_.size()];
        Arrays.fill(p, false);

        for (int i = 0; i < sentence_.size(); i++) {
            if (p[i])
                continue;
            int counter = 1;
            for (int j = i + 1; j < sentence_.size(); j++) {
                if (sentence_.get(i).equals(sentence_.get(j))) {
                    p[j] = true;
                    counter++;
                }
            }
            System.out.println(sentence_.get(i) + "=" + counter);
        }
    }

    void wordFrequency2() {
        java.util.Collections.sort(sentence_);
        wordFrequency();
    }

    void wordFrequency3() {
        java.util.Collections.sort(sentence_);
        java.util.Collections.reverse(sentence_);
        wordFrequency();
    }

    void wordFrequency4() {
        Map<String, Integer> map = new TreeMap<String, Integer>();

        for (int i = 0; i < sentence_.size(); i++)
            map.put(sentence_.get(i), 0);

        for (int i = 0; i < sentence_.size(); i++)
            if (map.containsKey(sentence_.get(i)))
                map.put(sentence_.get(i), map.get(sentence_.get(i)) + 1);

        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }
}