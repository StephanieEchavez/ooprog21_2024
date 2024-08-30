public class SleepIn {
    public static boolean SleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        System.out.println(SleepIn(false, false)); // true
        System.out.println(SleepIn(true, false)); // false
        System.out.println(SleepIn(false, true)); // true
    }
}
