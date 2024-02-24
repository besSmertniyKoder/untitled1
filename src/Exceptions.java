public class Exceptions {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
 //ытаемся выполнить код, в котором может возникнуть ошибка
        try{
            System.out.println(a/b);//ошибка
            //Exception , IOException -ошибка ввода/вывода,ArithmeticException
        }catch (Exception e){


            System.out.println(e.getMessage());



        }
    }
}
