package Objects.Presenter;

import Files.Data;
import Files.FileUtils;
import Objects.BubbleSort;
import Objects.InsertSort;
import Sort.ISort;

public class PresenterUtils {

    public static void readTheDataToSorting() {
        System.out.println("Data from the file " + FileUtils.getPath());
        System.out.println(Data.getList());
        bubbleOrInsert();
    }

    private static void bubbleOrInsert() {

        try {

            if (FileUtils.bubbleOrInsert.equals("BO")) {
                ISort[] iSortsObjects = new ISort[] {
                        new BubbleSort()
                };
                display(iSortsObjects);

            } else if (FileUtils.bubbleOrInsert.equals("CHO")) {
                ISort[] iSortsObjects = new ISort[] {
                        new InsertSort()
                };
                display(iSortsObjects);

            } else
                System.out.println("Method not found");

        } catch (NullPointerException e) {
            e.printStackTrace();
            e.getMessage();
        }

    }

    private static void display(ISort[] obj) {
        for (ISort current: obj) { current.sortBubbleOrInsert(); }
    }

}
