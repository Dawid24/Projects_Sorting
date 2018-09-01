package Objects;

import Files.FileUtils;

import java.util.ArrayList;

public class InsertSort extends SortingStrategy {

    private ArrayList<Integer> insertSortList;

    public InsertSort() {
        this.insertSortList = new ArrayList<>();
    }


    @Override
    public void sortedToList() {
        insertSortList.add(super.getListToSort(0));

        for (int i = 1; i < super.getListToSort().size(); i++) {
            Integer numberToInsert = super.getListToSort().get(i);
            int indexToInsert = findIndexToInsert(numberToInsert);
            insertSortList.add(indexToInsert, numberToInsert);
        }

        System.out.println(insertSortList + FileUtils.bubbleOrInsert);

    }

    private int findIndexToInsert(Integer numberToInsert) {
        for (int i = 0; i < insertSortList.size(); i++) {
            if (numberToInsert < insertSortList.get(i)) {
                return i;
            }
        }
        return insertSortList.size();
    }

    @Override
    public String toString() {
        return "Insert sort: " + insertSortList;
    }
}
