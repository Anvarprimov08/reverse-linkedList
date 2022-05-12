package uz.spring.arraylist;

public class ArrayList {
    private int array[];
    private int count = 0;

    public ArrayList() {
        array = new int[10];
    }

    public ArrayList(int n) {
        array = new int[n];
    }

    public boolean add(int value) {
        if (count == array.length) {
            int temp[] = new int[count * 2];
            for (int i = 0; i < count; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[count++] = value;
        return true;
    }

    public boolean add(int index, int value) {
        for (int i = count; i > index; i--) {
            array[i] = array[i - 1];
        }
        count++;
        array[index] = value;
        return true;
    }

    public int remove(int index) {
        int rem = array[index];
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--count] = 0;
        return rem;
    }

    public int size() {
        return count;
    }

    public int get(int index) {
        return array[index];
    }

    public void list() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }
}
