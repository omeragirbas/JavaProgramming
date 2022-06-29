package day10NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int n=10;
        String result=(n == 1)? "monday":(n == 2)? "tuesday":(n == 3)?"wednesday":(n == 4)?"thursday":(n == 5)?"friday":(n == 6)? "Saturday": "sunday";
        System.out.println(result);

    }
}
