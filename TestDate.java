public class TestDate {
    public static void main(String[] args) {
        Date today = new Date(1, 5, 2023);
        System.out.println(today.toString());
        today.setDate(11, 12, 2013);
        System.out.println(today.toString());
    }
}
