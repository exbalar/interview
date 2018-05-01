# Decimal Digits

Your task for this question is to express a positive integer as a sum of its decimal components.
Each component is one of the digits of the number times a power of 10. For instance, 25607 is 20000+5000+600+7. The input will be an int value and the output will be an int array.
Make sure that the components are in descending order and do not include zero digits in the output.
For instance, given "25607" as input, the output should be [20000, 5000, 600, 7]

## The brief

We have created a number of acceptance tests for the Decimal Digits and your challenge is to get them passing. Additionally, please make sure your solution is accompanied by comments in any form that describe a step-by-step refactorings, so we can understand the way you were thinking.

## Some hints
Write your code in DecimalDigitImpl.java, you can make other classes. But make sure they are called from DecimalDigitImpl.java only.
Check DecimalDigitFixture.java for writing your test cases. You can uncomment that file and implement your test case.
If you are new to Gradle, it may be worth spending 10 minutes reading a high level summary.  We are using the Gradle
Wrapper so `gradlew` from the command line should download everything you need.  Most modern IDEs support Gradle projects.

The use of JBehave in this instance is to provide you with our definition of done for the task.