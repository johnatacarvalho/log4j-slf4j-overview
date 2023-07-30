## SLF4J Overview
Sample Project to check log4j with slf4j

### How this project was implemented?

- Basic project with Spring Boot Starter Web
- Removed Spring Boot Starter Logging
- Added log4j libs:
  - log4j-api
  - log4j-core
  - log4j-slf4j-impl (To use slf4j interfaces)
- Created a simple log4j2.xml to make a basic log output costumization

### Running

- Run main class via IDE or build and run created application jar file.
- Call http://localhost:8080/hello
- Custom log from controller class will appear