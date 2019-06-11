public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<Integer>(4);
        intList.add(0, 2);
        intList.add(1, 3);
        intList.add(2, 4);
        intList.add(3, 5);

        System.out.println("The element that was removed from the list: "  + intList.remove(1));

        System.out.println("Size of array: " + intList.size());

        System.out.println(intList.printArray());

        System.out.println("Cloned array: \n" + intList.clone());

        System.out.println(intList.contains(2) ? "2 appears in the array"
                : "2 not in the array");

        System.out.println("First index of 4 is: " + intList.indexOf(4));

        System.out.println(intList.add(6) ? "6 has been added to the end of the array"
                : "6 has not been added to the end of the array");

        System.out.println("Element at index 1 is: " + intList.get(1));

        System.out.println("Clear all element in array");
        intList.clear();
        System.out.println("Size of array: " + intList.size());
    }
}
