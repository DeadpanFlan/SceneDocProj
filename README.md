# SceneDocProj
This project is a sample user tracking application using Spring and AngularJS. This project was built for SceneDoc as an exercise;
## Configuration
Project currently runs off an H2 database, using [this file](src/main/resources/data-h2.sql). You can supply your own data by replacing your own file that follows [this schema](src/main/resources/schema-h2.sql).

## Build and Run

You can run the application from the command line with Gradle or Maven.

If you are using Gradle, you can run the application using 
```bash
./gradlew bootRun
```


If you are using Maven, you can run the application using 
```bash
./mvnw spring-boot:run
```

You may also run from Eclipse as well. You can import the project as an existing Maven or Gradle project,
and with the [Spring Tools](https://marketplace.eclipse.org/content/spring-tools-aka-spring-ide-and-spring-tool-suite) plugin installed. From there you right-click on your project in the Project Explorer and select
```
Run As > Spring Boot App
``` 

Once that is done, and the app is running, open your browser and navigate to `localhost:8080/index.html`
## Built With
- [Spring Boot](https://projects.spring.io/spring-boot/)
- [AngularJS](https://angularjs.org/)
	- [AngularUI Bootstrap](https://angular-ui.github.io/bootstrap/) for an Angular Modal Directive