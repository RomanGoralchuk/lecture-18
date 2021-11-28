# Hometask #18
### Description
Hibernate. Data storage methods and data matching
### Task List
1. Git repo +
2. README.MD file with the task and description. gitignore +
3. create new maven project with 3 modules +
   3.1. entity module +
   3.2. persistence module +
   3.3. (optinal) integration test module +
   3.4. naming: {project-name}-persistence. examples: school-journal-persistence, car-service-entity, etc +
4. Create POJO classes +
5. Use at least 4 class level annotations (for example embedded, immutable, and so on)
6. Use at least 5 field level annotations (for example, transient)
7. Use at least 2 diff id generation strategy
8. create your custom id generation strategy and use it
9. create your custom name strategy and use it

### Technologies
* Java 11
* Maven
* FlyWay
* Slf4j+Logback
* MariaDB
* Mockito
* JUnit4
* Docker-compose
* Hibernate

### How to run
* `mvn clean package`
* `docker-compose up -d`
* `java -jar target\lecture-18-1.0-SNAPSHOT.jar`