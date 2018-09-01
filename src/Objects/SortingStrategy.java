package Objects;

import Files.Data;
import Sort.ISort;

import java.util.ArrayList;

public abstract class SortingStrategy implements ISort {

    private ArrayList<Integer> listToSort;

    public SortingStrategy() {
        this.listToSort = Data.getList();
    }

    public ArrayList<Integer> getListToSort() {
        return listToSort;
    }

    public Integer getListToSort(int index) {
        return listToSort.get(index);
    }

    public abstract void sortedToList();

    public void sortBubbleOrInsert() {
        sortedToList();
    }
}
