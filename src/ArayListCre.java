import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArayListCre {
    public ArrayList<Integer> arrayList = new ArrayList<>(30);
    private int[] array = new int[10];

    private int[] fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30) - 15);
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
    }

    private void showArrayList(ArrayList<Integer> arrayList) {
        for (int r = 0; r < arrayList.size(); r++) {
            System.out.print(arrayList.get(r) + " ");
        }
    }
}
