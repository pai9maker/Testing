package ru.omsu.imit.matchers;

import org.assertj.core.api.AbstractAssert;
import org.json.JSONObject;

public class StringMatcher extends AbstractAssert<StringMatcher, String> {

    protected StringMatcher(String s) {
        super(s, StringMatcher.class);
    }

    public StringMatcher containsSuccessAndStatus() {
        JSONObject obj = new JSONObject(this.actual);
        if(!obj.getString("status").equals("success")) {
            failWithMessage("given string does not contain words status and success");
        }
        return this;
    }

}
