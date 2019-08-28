# OCALearning
Materials to learn to the OCA exam

add  hamcrest-core-1.3.jar and junit-4.13-beta-3.jar
commands:
λ javac -cp jar/junit-4.13-beta-3.jar; src/basic/MathOperations.java src/basic/MathOperationsTest.java

λ java -cp jar/junit-4.13-beta-3.jar;jar/hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore src.basic.MathOperationsTest
