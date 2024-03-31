DESCRIPTION

    This is a demonstration of Java programming
    languagae a JUnit unit testing framework.

    The JUnit framework requires external JAR-libraries, which
    can be downloaded from:

    curl -o junit-4.13.2.jar https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
    curl -o hamcrest-core-1.3.jar https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
    curl -o takari-cpsuite-1.2.7.jar https://repo1.maven.org/maven2/io/takari/junit/takari-cpsuite/1.2.7/takari-cpsuite-1.2.7.jar



  ##  The application consists of the following classes:

	Main.java
	Class1.java
	Class2.java
        Class3.java
        Class4.java
        Class5.java

    The unit tests include files:

	Class1Test.java
	Class2Test.java
        Class3Test.java
   	Class4Test.java
        Class5Test.java

    The Suite includes:

	TestSuiteAll.java   // Will run all tests

HOW TO COMPILE MANUALLY

    There are shell script files that set the
    java compiler options for libraries:

	./compile.sh	    // The Main application
	./compile-test.sh   // Compile test classes
	./comile-suite.sh   // Compile Suite class

    Tun run the compiled files, use:

	./run.sh	    // The Main application
	./run-test.sh	    // Run test classes
	./run-suite.sh	    // Run Suite class

HOW TO USE MAKEFILE

    A Makefile in included. It has the
    following targets:

	make all	    // Compile all
	make run	    // Run all

End of file
