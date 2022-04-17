###Commands for exercise 4:
- have the class files you want to compress to Java ARchive (JAR)
- jar -cf mass-deploy.jar mass/Main.class mass/util/Point.class
###Run your code either way:
- java -classpath mass-deploy.jar mass.Main
- jar -xf mass-deploy.jar