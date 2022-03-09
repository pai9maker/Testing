package ru.omsu.imit.matchers;

public class ArrayMatcherAssertion {

    public static ArrayMatcher assertThat(int... values){
        return new ArrayMatcher(values);
    }

}
