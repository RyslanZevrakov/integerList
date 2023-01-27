import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class ArrayListTenThousandElements {
    public ArrayList<Integer> arrayList = new ArrayList<>(30);
    private int[] array = new int[100000];

    private int[] fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10000)*10);
            System.out.print(array[i] + " ");
        }

        return array;
    }

    private ArrayList createArrayList() {
        fillArray();
        System.out.println(" ");

        for (int k = 0; k < array.length; k++) {
            if (array[k] > 0) {
                arrayList.add(array[k]);
            }
        }

        showArrayList(arrayList);

        return arrayList;
    }

    private void addNewValues() {
        createArrayList();
        System.out.println(" ");
        int sizeOfArrayList = arrayList.size();

        for (int j = 0; j < sizeOfArrayList; j++) {
            arrayList.add(arrayList.get(j) * 10);
        }

        showArrayList(arrayList);
    }

    private void removeElements() {
        addNewValues();

        for (int h = 0; h < arrayList.size(); h++) {
            if (arrayList.get(h) < 10) {
                arrayList.remove(h);
            }
        }

        showArrayList(arrayList);
    }

    public void sortArrayList() {
        removeElements();

        Collections.sort(arrayList);
        showArrayList(arrayList);
        compare2Lists();
    }

    private void showArrayList(ArrayList<Integer> arrayList) {
        for (int r = 0; r < arrayList.size(); r++) {
            System.out.print(arrayList.get(r) + " ");
        }
    }
    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println("\n");
        System.out.println( System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
