package Array;

import java.lang.reflect.*;

public class arrays {
    private int[] arr = new int[10];
    public arrays(){
        entArray(arr);
    }

    public static void entArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void print(Object array){
        System.out.println(toString(array));
    }
    public static String toString(Object array){
        if (array == null ||
                !array.getClass().isArray()) {
            return String.valueOf(array);
        }
        StringBuffer sb = new StringBuffer();
        int len = Array.getLength(array);
        sb.append('[');
        for (int i = 0; i < len; i++){
            if(i > 0){
                sb.append(" , ");
            }
            Object obj = Array.get(array, i);
            sb.append(toString(obj));
        }
        sb.append(']');
        return sb.toString();
    }
}
