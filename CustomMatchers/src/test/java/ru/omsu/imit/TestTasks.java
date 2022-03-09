package ru.omsu.imit;

import org.junit.jupiter.api.Test;
import ru.omsu.imit.matchers.ArrayMatcherAssertion;
import ru.omsu.imit.matchers.StringMatcherAssertion;

public class TestTasks {

    @Test
    void first() {
        int[] arrayOne = new int[] {1,1,1,2,2,3,2};
        int[] arrayTwo = new int[] {3,1,2};
        ArrayMatcherAssertion.assertThat(arrayOne).equalsInAnyOrder(arrayTwo);
    }

    @Test
    void second() {
        String json1 = "{\"status\": \"success\"}";
        StringMatcherAssertion.assertThat(json1).containsSuccessAndStatus();
    }

}
