package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        if (ab + bc > ac && ab + ac > bc && bc + ac > ab) {
            return true;
        }
        return false;
    }
}
