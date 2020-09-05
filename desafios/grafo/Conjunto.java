import java.util.List;
import java.util.ArrayList;

public class Conjunto {
    private List<List<Character>> conjunto_;

    Conjunto() {
        conjunto_ = new ArrayList<>();
    }

    void addLine(String line) {
        List<Character> lineList = new ArrayList<>();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ')
                continue;
            lineList.add(line.charAt(i));
        }

        addElem(lineList);
    }

    Integer getSize() {
        return conjunto_.size();
    }

    public void addElem(List<Character> x) {
        conjunto_.add(x);
    }

    List getArray(int i) {
        return conjunto_.get(i);
    }

    Character getElement(int i, int j) {
        return conjunto_.get(i).get(j);
    }

    public void removeElem(char x) {
        for (int i = 0; i < getSize(); i++)
            for (int j = 0; j < getArray(i).size(); j++)
                if (getElement(i, j) == x)
                    getArray(i).remove(getElement(i, j));
    }

    public void print() {
        System.out.print("{");
        for (int i = 0; i < getSize(); i++)
            System.out.print(" " + getArray(i) + " ");
        System.out.println("}");
    }
}