# Jenkins Maven Test

A simple Maven project for testing CI/CD pipeline in Jenkins.

## Project Overview

This repository contains a basic Java Maven project designed to test and demonstrate Jenkins CI/CD pipeline functionality. It includes:

- Simple Java application with basic functionality
- JUnit test cases
- Maven configuration (pom.xml)
- Jenkinsfile for pipeline definition

## Project Structure

```
jenkins_maven_test/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/jenkins/test/
│   │           └── App.java
│   └── test/
│       └── java/
│           └── com/jenkins/test/
│               └── AppTest.java
├── pom.xml
├── Jenkinsfile
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven 3.6.3 or higher
- Jenkins (for CI/CD pipeline)

## Building the Project

### Compile the code

```bash
mvn clean compile
```

### Run tests

```bash
mvn test
```

### Package the application

```bash
mvn package
```

### Run the application

```bash
java -jar target/jenkins-maven-test-1.0-SNAPSHOT.jar
```

Or directly with Maven:

```bash
mvn exec:java -Dexec.mainClass="com.jenkins.test.App"
```

## Jenkins Pipeline

The project includes a `Jenkinsfile` that defines a complete CI/CD pipeline with the following stages:

1. **Checkout**: Checks out the code from the repository
2. **Build**: Compiles the source code
3. **Test**: Runs JUnit tests and publishes test results
4. **Package**: Creates a JAR file
5. **Archive**: Archives the built artifacts

### Setting up Jenkins

1. Create a new Pipeline job in Jenkins
2. Configure the job to use this repository
3. Set the pipeline script to use "Pipeline script from SCM"
4. Select Git as SCM and provide the repository URL
5. Set the script path to `Jenkinsfile`
6. Ensure Maven and JDK are configured in Jenkins Global Tool Configuration

## License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.