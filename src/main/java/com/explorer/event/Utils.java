package com.explorer.event;

import java.util.Random;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {
    static int randomInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
