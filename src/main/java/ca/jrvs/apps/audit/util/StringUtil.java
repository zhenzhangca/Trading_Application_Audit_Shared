package ca.jrvs.apps.audit.util;

import java.util.Arrays;

public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isEmpty(String... strs) {
        return Arrays.stream(strs).anyMatch(str -> str == null | str.isEmpty());
    }


}
