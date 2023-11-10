package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexPattern {

    String pattern;
    String matchingString;

    TestRegexPattern(){

    }

    TestRegexPattern(String pattern, String matchingString){
        this.pattern = pattern;
        this.matchingString = matchingString;
    }

    public StringBuilder returnFirstMatchedString(String pattern, String matchingString){
        StringBuilder matchedString = new StringBuilder();
        Matcher matcher =  Pattern.compile(pattern).matcher(matchingString);
        matcher.find();
        matchedString.append(matcher.group());
        return matchedString;
    }

}
