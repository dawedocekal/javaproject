package org.internship.exam2;

/**
 * Demo.
 */
public class Demo
{
    public static void main(String[] args) {
        DancingLesson lesson = new DancingLesson(
                new Dancer[] {
                        new Dancer(10, true),
                        new Dancer(20, false),
                        new Dancer(30, false),
                        new Dancer(40, true),
                        new Dancer(50, true)
                }
        );

        boolean success = true;

        success &= pair(lesson, 10, 20);
        success &= !pair(lesson, 40, 50);
        success &= !pair(lesson, 10, 30);
        success &= !pair(lesson, 40, 60);

        success &= disjoin(lesson, 20);
        success &= pair(lesson, 10, 30);
        success &= !disjoin(lesson, 20);
        success &= !disjoin(lesson, 60);

        System.out.println("Overall results: " + (success ? "OK" : "ERROR"));
    }

    private static boolean pair(DancingLesson lesson, int d1, int d2) {
        boolean ret = lesson.pair(d1, d2);
        System.out.println("Pairing dancer no. " + d1 + " with dancer no. " + d2 + ": " + (ret ? "success" : "failure"));
        return ret;
    }

    private static boolean disjoin(DancingLesson lesson, int dancer) {
        boolean ret = lesson.disjoin(dancer);
        System.out.println("Disjoining dancer no. " + dancer + ": " + (ret ? "success" : "failure"));
        return ret;
    }
}