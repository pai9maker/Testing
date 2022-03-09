package ru.omsu.imit.matchers;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AbstractIntArrayAssert;

import java.util.HashSet;
import java.util.Set;

public class ArrayMatcher<SELF extends AbstractIntArrayAssert<SELF>> extends AbstractAssert<ArrayMatcher<SELF>, int[]> {

    protected ArrayMatcher(int[] ints) {
        super(ints, ArrayMatcher.class);
    }

    public ArrayMatcher equalsInAnyOrder(int... values) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int value: this.actual) {
            set1.add(value);
        }
        for(int value: values) {
            set2.add(value);
        }
        if(!set1.equals(set2)) {
            failWithMessage("given arrays not equals to each other in any order");
        }
        return this;
    }

}
