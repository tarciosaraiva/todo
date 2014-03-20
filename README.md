# Spring Todo

This is a boilerplate project used for Spring 3 applications providing RESTful interfaces.

The following technologies are used:

* Spring 3
* Spring Data JPA
* Hibernate
* Gradle
* Logback
* Flyway

To run, you must have **Gradle** installed. Simply run `gradle jettyRun` and you will be off :)

Occasionally I was getting a PermGen space error, so here's the JAVA_OPTS I used:
`-Djava.awt.headless=true -Dfile.encoding=UTF-8 -server -Xms512m -Xmx1024m -XX:NewSize=256m -XX:MaxNewSize=256m -XX:PermSize=256m -XX:MaxPermSize=256m -XX:+DisableExplicitGC`
