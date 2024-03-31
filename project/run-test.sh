#! /bin/sh

echo "# Running tests: Class1Test"
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore Class1Test

echo "# Running tests: Class2Test"
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore Class2Test

echo "# Running tests: Class3Test"
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore Class3Test

echo "# Running tests: Class4Test"
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore Class4Test

echo "# Running tests: Class5Test"
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore Class5Test

# End of file
