package ru.omsu.imit.matchers;

public class StringMatcherAssertion {

    public static StringMatcher assertThat(String json){
        return new StringMatcher(json);
    }

}
