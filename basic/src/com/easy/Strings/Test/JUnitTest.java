package com.easy.Strings.Test;

import com.easy.Array.*;
import com.easy.Strings.ReverseString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JUnitTest {

    @Test
    public void reverseString_test() {
        ReverseString reverseString = new ReverseString();
        char[] s = new char[]{'H', 'e', 'l', 'l', 'o'};
        System.out.println(s);
        reverseString.reverseString(s);
        System.out.println(s);
    }


}
