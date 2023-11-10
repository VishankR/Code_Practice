package org.example;


public class App 
{
    public static void main( String[] args ){

        App app = new App();

        // Find first matched Occurance
        app.TestRegexPattern_returnFirstMatchedString();
    }

    private void TestRegexPattern_returnFirstMatchedString(){
        TestRegexPattern testRegexPattern = new TestRegexPattern();
        String pattern = "\\d{2,3}";
        String testingString = "50 or over";
        System.out.println(testRegexPattern.returnFirstMatchedString(pattern, testingString));
    }
}
