import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapa(int minCapacity) {
        int newSize = this.size() + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        if (this.size() == elements.length) {
            ensureCapa(1);
        }
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        } else {
            elements[index] = e;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());
        } else {
            Object temp = elements[index];
            for (int i = 0; i < elements.length; i++) {
                if (i == index) {
                    for (int j = i; j < elements.length - 1; j++) {
                        elements[j] = elements[j + 1];
                    }
                    break;
                }
            }
            return (E) temp;
        }
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count++;
            }
        }
        return count;
    }

    public String printArray() {
        String result = "";
        for (int i = 0; i < elements.length; i++) {
            result += elements[i] + " ";
        }
        return result;
    }

    @Override
    public Object clone() {
        Object cloneElements[] = elements.clone();
        String result = "";
        for (int i = 0; i < cloneElements.length; i++) {
            result += cloneElements[i] + " ";
        }
        return result;
    }

    boolean contains(E o) {
        boolean isContains = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }

    public int indexOf(Object o) {
        int indexOfFirst = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                indexOfFirst = i;
            }
        }
        return indexOfFirst;
    }

    public boolean add(E e) {
        boolean isAdd = false;
        if (this.size() == elements.length) {
            ensureCapa(1);
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = e;
                isAdd = true;
                break;
            }
        }
        return isAdd;
    }

    public E get(int index) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        }
        return (E) elements[index];
    }

    public void clear() {
        elements = Arrays.copyOf(elements, 0);
    }
}
