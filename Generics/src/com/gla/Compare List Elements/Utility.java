package com.gla.CopyListElements;
import java.util.*;

class Utility {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }
}


