import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hello2";
        String s3 = "kava";
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("aaaaaa1");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//        //сравнение ==
//        System.out.println("Сравнение с использованием ==:");
//        System.out.println("s1 == s2: " + (s1 == s2)); // true
//        System.out.println("s1 == s3: " + (s1 == s3)); // true
//        System.out.println("s1 == s4: " + (s1 == s4)); // true
//        System.out.println("s1 == s5: " + (s1 == s5)); // false
//        System.out.println("s1 == s6: " + (s1 == s6)); // false
//        //сравнение equals
//        System.out.println("\nСравнение с использованием equals():");
//        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
//        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
//        System.out.println("s1.equals(s4): " + s1.equals(s4)); // true
//        System.out.println("s1.equals(s5): " + s1.equals(s5)); // true
//        System.out.println("s1.equals(s6): " + s1.equals(s6)); // true
        ArrayList<String> arrayList = new ArrayList<>();//создание arrayList
        arrayList.add(s1);//добавление элементов
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add("true");
        arrayList.add(s5);
        System.out.println(arrayList.indexOf(s2));
        arrayList.remove(s2);
        arrayList.add("hello1");
        System.out.println( arrayList.indexOf("hello1"));
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.size());
//        System.out.println(arrayList);
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){//сортировка через iterator
           String temp = iterator.next();
           if (temp.equals("true")){
               System.out.println(temp);
           }else {
//               System.out.println(false);
           }
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);//сортировка через Collections
        System.out.println(arrayList);
        Object a = "hi";
        Object b = 5;
        if (a instanceof Integer){//проверка на тип через instanceof
            System.out.println(true);

        }else {
            System.out.println(false);
        }


    }
}
