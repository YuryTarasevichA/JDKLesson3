package Tasks;

import static Tasks.ArrayComparator.compareArrays;
import static Tasks.Calculator.*;

/**
 * Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K),
 * конструктор, принимающий на вход параметры типа (T, V, K), методы
 * возвращающие значения трех переменных. Создать метод, выводящий на консоль имена
 * классов для трех переменных класса. Наложить ограничения на параметры типа:
 * T должен реализовать интерфейс Comparable (классы оболочки, String),
 * V должен реализовать интерфейс DataInput и расширять класс InputStream,
 * K должен расширять класс Number.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Задание 1
         */
        MyCollectionT<String> collection = new MyCollectionT<>();
        collection.addElement("Hello");
        collection.addElement("World!");
        collection.deleteElement("Hello");

        for (String str: collection) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("---".repeat(10));
        /*
        Задание 2
         */
        System.out.println("Сумма 5 и 3.5: " + sum(5, 3.5));
        System.out.println("Произведение 7.2 и 2: " + multiply(7.2, 2));
        System.out.println("Деление 10 на 3,5: " + divide(10, 3.5));
        System.out.println("Разница 8.5 и 3: " + suptract(8.5, 3));

        System.out.println();
        System.out.println("---".repeat(10));
        /*
        Задание 3
         */
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        System.out.println("Целочисленные массивы равны? " + compareArrays(intArray1, intArray2));

        String[] strArray1 = {"apple", "banana", "orange"};
        String[] strArray2 = {"apple", "mango", "orange"};
        System.out.println("Целочисленные массивы равны? " + compareArrays(strArray1, strArray2));

        Double[] doubleArray1 = {2.0, 2.5, 3.5};
        Double[] doubleArray2 = {1.5, 2.5, 3.5};
        System.out.println("Целочисленные массивы равны? " + compareArrays(doubleArray1, doubleArray2));

        System.out.println();
        System.out.println("---".repeat(10));
        /*
        Задание 4
         */
        Pair<Integer, String> pair1 = new Pair<>(10, "Hello");
        System.out.println("Pair 1: " + pair1);
        System.out.println("First value: " + pair1.getFirst());
        System.out.println("Second value: " + pair1.getSecond());

        Pair<Double, Character> pair2 = new Pair<>(3.14, 'A');
        System.out.println("Pair 2: " + pair2);
        System.out.println("First value: " + pair2.getFirst());
        System.out.println("Second value: " + pair2.getSecond());

/*        FileInputStream fis;
        Box<String, Integer, FileInputStream> box1;
        try {
            fis = new FileInputStream("file");
            box1 = new Box<String, Integer, FileInputStream>("Word", 5, fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(box1.valueT);
        System.out.println(box1.valueK);
        System.out.println(box1.valueV);
        box1.printClassName();
*/
//        FileInputStream fis;
//        Box<String, Integer, FileInputStream> box1;
//
//        try {
//            fis = new FileInputStream("file");
//            box1 = new Box<>("Word", 5, fis);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(box1.valueT);
//        System.out.println(box1.valueK);
//        System.out.println(box1.valueV);
//        box1.printClassName();

//        MyCollectionT<Integer> collectionT = new MyCollectionT<>();
//        collectionT.addElement(1);
//        collectionT.addElement(34);
//        collectionT.addElement(2);
//        collectionT.addElement(2);
//        collectionT.addElement(2);
//        collectionT.addElement(2);
//        collectionT.addElement(2);
//        collectionT.addElement(2);
//        collectionT.addElement(2);
//        collectionT.addElement(2);
//        collectionT.addElement(2);
//        System.out.println(Arrays.toString(collectionT.getValue()));
//        collectionT.deleteElement(1);
//        collectionT.deleteElement(34);
//        System.out.println(Arrays.toString(collectionT.getValue()));
//        collectionT.deleteElement(2);
//        collectionT.deleteElement(2);
//        System.out.println(Arrays.toString(collectionT.getValue()));
//        collectionT.deleteElement(2);
//        collectionT.deleteElement(2);
//        collectionT.deleteElement(2);
//        System.out.println(Arrays.toString(collectionT.getValue()));
//        collectionT.deleteElement(2);
//        collectionT.deleteElement(2);
//        collectionT.deleteElement(2);
//        collectionT.deleteElement(2);
//        System.out.println(Arrays.toString(collectionT.getValue()));
//        MyCollectionIterator<Object> myCollectionIterator = new MyCollectionIterator<>(collectionT.value);

//        while (collectionT.hasNext()) {
//            System.out.println(collectionT.next());
//        }

    }
}
