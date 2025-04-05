import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Copy a list of elements and transform to more generic
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(1.2, 3.4);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);
    }

    public static void copy (List<? extends Number> specificList,
                      List<? super Number> genericList) {

        for (Number n : specificList) {
            genericList.add(n);
        }

        printList(genericList);
    }

    public static void printList (List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println("\n");
    }

    public void principles () {
        /*
         * covariance -> It's allow get, but It's not allow put
         */

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;


        Number x = list.get(0);
        //list.add(20);

        /*
         * contravariance -> It's allow put elements, but it's not allow get
         */

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Mary");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);

        //Number x = myNums.get(0);
    }
}