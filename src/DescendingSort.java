import java.util.Comparator;

public class DescendingSort implements Comparator<Integer>{
    @Override
    public int compare(Integer left, Integer right) {
        return (left < right) ? 1 : left == right ? 0 : -1;
    }
}
