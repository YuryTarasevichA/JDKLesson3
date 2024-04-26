package Tasks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * – Описать собственную коллекцию – список на основе массива. Коллекция должна иметь
 * возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */
public class MyCollectionT<T> implements Iterable<T>{
    Object[] value;
    private int size = 0;
    private int currentIndex = 0;

    MyCollectionT() {
        value = new Object[10];
    }

    public void addElement(T element) {
        if (size >= value.length) {
            value = Arrays.copyOf(value, value.length * 2);
        }
        value[size++] = element;
    }

    public void deleteElement(T element) {
        if (size == 0) System.out.println("Array is empty");
        for (int i = 0; i < size; i++) {
            if (value[i] == element) {
                System.arraycopy(value, i + 1, value, i, value.length - 1 - i);
                size--;
                return;
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    /**
     * Задание 1
     * внедрён внутренний класс MyIterator
     * методы hasNext() и next() перенесены в класс MyIterator
     */
    private class MyIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if(!hasNext()) throw new NoSuchElementException();
            return (T) value[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove operation is not supported");
        }
    }
//
//    public boolean hasNext() {
//        if (value[currentIndex] != null && currentIndex < size) {
//            return true;
//        }
//        return false;
//    }
//    public T next(){
//        if(!hasNext()) throw new NoSuchElementException();
//        return (T) value[currentIndex++];
//    }

    public Object[] getValue() {
        return value;
    }
}
