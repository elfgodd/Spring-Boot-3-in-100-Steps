End points:
http://localhost:8080/courses
http://localhost:8080/currency-configuration

// Environment information
# Will print everything is in the log
# trace

# Will print a lot of more information
# debug

# Will print all the things
# info

# One level up, little more info would print
# warning

# Only errors and exceptions would be printed
# error

# Turns off entire logging
# off

# RUN JAR FILE (intellij and Eclipse)

# IntelliJ Execute a Maven Project JAR
- Go to Maven tab
- Execute Maven Goal
- mvn clean
- copy the JAR link
- cd /home/elfgod/Documents/bootspring/01-Intro-Spring-Boot-10Steps/learn-spring-boot/target
- ls

# Eclipse
- right click the root file project
- run as, Maven build (wait some minutes)
- COPY: Building jar: /home/elfgod/Documents/bootspring/01-Intro-Spring-Boot-10Steps/learn-spring-boot/target/
- cd to the folder above
- ls
- run the jar file
- java -jar learn-spring-boot-0.0.1-SNAPSHOT.jar
