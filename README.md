# Selenium WebDriver Test Automation Project

## Project Overview

This project implements Selenium WebDriver with TestNG using Java and Maven for efficient test automation. The primary objective is to verify the login functionality of a website and ensure seamless authentication and navigation.

## Features

- Selenium WebDriver: Used for web automation testing.
- TestNG: Utilized for structuring test cases and generating reports.
- Java: Primary programming language.
- Maven: Used for dependency management and build automation.

## Test Scenarios

1. Verify Login Page Elements: Ensures the presence of email and password fields.
2. Successful Login Test: Verifies that users can log in with valid credentials and are navigated to the dashboard.
3. Invalid Login Test: Tests invalid credentials to ensure appropriate error messages are displayed.

## Project Structure

```
selenium-testng-project/
│-- src/
│   ├── test/java/
│   │   ├── tests/
│   │   │   ├── LoginTest.java
│   │   ├── utilities/
│   │   │   ├── WebDriverSetup.java
│   │   ├── pages/
│   │   │   ├── LoginPage.java
│   │   │   ├── DashboardPage.java
│   ├── main/resources/
│   │   ├── config.properties
│-- pom.xml
│-- README.md
```

## Prerequisites

- Java JDK (11 or higher)
- Maven
- Selenium WebDriver
- TestNG
- ChromeDriver or GeckoDriver


## Test Execution

- TestNG annotations ensure structured test execution.
- Reports can be generated using TestNG and Maven Surefire Plugin.
- Logs and test results are available in the `target/surefire-reports` directory.

## Reporting

- TestNG-generated HTML reports can be found in `test-output/index.html`.
- Logs are recorded to track test execution details.

## Contribution

- Fork the repository.
- Create a new branch (`feature-branch`).
- Commit changes and push to the branch.
- Submit a pull request.

## License

This project is open-source and available under the MIT License.

## Author
Bharti Sagar

