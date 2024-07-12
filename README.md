# Cucumber Selenium Demo

This project demonstrates automated testing using Cucumber and Selenium for web application testing. It includes example test scenarios for logging into a demo website and verifying user authentication.

## Table of Contents

1. [Project Overview](#project-overview)
2. [Setup Instructions](#setup-instructions)
3. [Running Tests](#running-tests)
4. [Generating Reports](#generating-reports)

# Project Overview

## Technologies Used

- **Automation Tools:** Selenium WebDriver, Cucumber
- **Testing Framework:** JUnit
- **Reporting:** ExtentReports
- **Build Tool:** Maven

## Project Structure

- **Features:** Contains Gherkin syntax feature files describing test scenarios.
- **Step Definitions:** Java classes mapping Gherkin steps to Selenium actions.
- **Hooks:** Includes setup and teardown actions using Cucumber hooks.
- **Test Runner:** Entry point to execute Cucumber tests and generate reports.

## Purpose

The purpose of this project is to showcase:

- Implementation of BDD (Behavior-Driven Development) with Cucumber.
- Automation of web application testing using Selenium WebDriver.
- Integration of ExtentReports for detailed test reporting.


## Setup Instructions

To set up the project locally, follow these steps:

1. Clone the repository.
2. Open in InteliJ or Eclipse as a Maven Project it will automatically install the dependency. 
3. If not (Install dependencies using Maven.)

## Running Tests

To run the tests for this project, follow these steps:

1. **navigate to TestRunner file (/src/test/java/testRunner) rightclick on the file and Run**
2.  **Directly run From Terminal**
     ```bash
       nvm test
     
## Generating Reports

After running tests, reports will be available in the `reports` folder Or `test-output` folder.
Open `cucumber-reports.html`, `CucumberExtentReport.html` in a browser to view detailed reports.

