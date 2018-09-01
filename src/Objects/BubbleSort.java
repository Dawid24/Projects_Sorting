package Objects;

import Files.FileUtils;

import java.util.ArrayList;

public class BubbleSort extends SortingStrategy{

    private ArrayList<Integer> bubbleSortList;

    public BubbleSort() {
        this.bubbleSortList = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getBubbleSortList() {
        return bubbleSortList;
    }

    @Override
    public void sortedToList() {
        bubbleSortList = super.getListToSort();

        for (int i = 0; i < bubbleSortList.size(); i++) {
            for (int j = 0; j < bubbleSortList.size() - 1; j++) {
                if (bubbleSortList.get(j) > bubbleSortList.get(j + 1)) {
                    int temp = bubbleSortList.get(j + 1);
                    bubbleSortList.set(j + 1, bubbleSortList.get(j));
                    bubbleSortList.set(j, temp);
                } else {
                    continue;
                }
            }
        }

        System.out.println(bubbleSortList + FileUtils.bubbleOrInsert);
    }

    @Override
    public String toString() {
        return "Bubble sort: " + bubbleSortList;
    }
}
