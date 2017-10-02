import java.util.Arrays;

public class Sort extends Thread {
    private Integer[] array;
    private int flag;

    public Sort(Integer[] arr, int flag) {
        this.array = new Integer[arr.length];
        this.flag = flag;
        System.arraycopy(arr, 0, this.array, 0, arr.length);
    }

    @Override
    public void run() {
        switch (flag) {
            case 1:
                Arrays.sort(array, new AscendingSort());
                break;
            case 2:
                Arrays.sort(array, new DescendingSort());
                break;
            default:
                System.out.println("Kek))0)");
        }
        for (int i: this.array) {
            System.out.print(i + " ");
        }
    }
}
