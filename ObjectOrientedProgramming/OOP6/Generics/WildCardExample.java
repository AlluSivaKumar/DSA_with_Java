package OOP6.Generics;

import java.util.Arrays;

public class WildCardExample<Type extends Number>//it can access onlt number data types such as integer float like that and not accepct Strings
//Here Type should be number or its suClassess.
{
    private Object[] data;//instead of type we use objects
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

     public WildCardExample() 
    {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(Type num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public Type remove() {
        @SuppressWarnings("unchecked")
        Type removed = (Type)data[--size];
        return removed;
    }

    @SuppressWarnings("unchecked")
    public Type get(int index) {
        return (Type)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, Type value) {
        data[index] = value;//type casting is not required
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {

        /* CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(8);
        System.out.println(list);

        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        list2.add("jik");
        System.out.println(list2); */

        /* CustomArrayList list = new CustomArrayList();

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        //list.add("yoy");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("dfghj"); */

        WildCardExample<Integer> list3 = new WildCardExample<>();
        list3.add(56);
        System.out.println(list3);


        //WildCardExample<String> list4 = new WildCardExample<>();//It gives an error
        
    }
}
