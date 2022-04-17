# JUnit test case running
To access all capabilities of JUnit framework we need to have 2 jar (java archive) files. Junit-X.XX.jar containing the actual framework and harmcrest-core-1.3.jar as a dependency for JUnit. This will let us import classes from the JUnit jar file like:
<code> <br>
import org.junit.Test; <br>
import static org.junit.Assert.*;
</code> <br>

Using the @Test annotion we can say to JUnit that the following method is a TestCase we want to be ran.

In the TestCases we can use all kinds of asserts that we import. These do the actual part of testing, comparing the expected and the calculated result. If an assert fails, that means 
- a) we messed up something in the code of the TC (testcase)
- b) we messed up the code that we were testing

In both cases we 're happy to find a bug to be corrected before we release our code to the customer (In the case of Uni this translates to "before submitting to Canvas")

## Compilation and Running

Linux/Mac:
```
javac -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar" MathUtilsTest.java
java -cp ".:junit-4.12.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MathUtilsTest
```
Windows:
```
javac -cp ".;junit-4.12.jar;hamcrest-core-1.3.jar" MathUtilsTest.java
java -cp ".;junit-4.12.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MathUtilsTest
```

[^1]: only difference here is the separator character ':' on Unix based systems and ';' on Windows.