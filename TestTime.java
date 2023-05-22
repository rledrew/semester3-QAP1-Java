public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.setTime(21, 10, 15);

        Time t2 = new Time();
        t2.setTime(10, 20, 25);

        t1 = t1.nextSecond();
        t2 = t2.previousSecond();
        String t1String;
        t1String = t1.toString();
        String t2String;
        t2String = t2.toString();

        System.out.println(t1String);
        System.out.println(t2String);
    }
}
