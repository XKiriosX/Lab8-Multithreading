import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Arr extends Thread {
    private Integer[] array;
    private int length;

    public Arr(int length) {
        if (length < 1) {
            throw new ArrayIndexOutOfBoundsException("Size can't be less than 1");
        }
        this.length = length;
        this.array = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(20);
        }
    }

    public void printArray() {
        System.out.println("Size of ur array: " + this.array.length);
        System.out.println("array:");
        for (Integer i: this.array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void run() {
        printArray();
        System.out.println("What kind of sort u wanna test? Type 1 if ascending or type 2 if descending:");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int flag = Integer.parseInt(bufferedReader.readLine());
            new Sort(this.array, flag).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }
}
