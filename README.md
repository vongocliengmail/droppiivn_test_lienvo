# Project Test Automation with Selenium Java and Cucumber
This framework is used for Web automation testing
https://magento.softwaretestingboard.com/
- Homepage display
- Signin
- Signup

## Setup
- Java JDK 11 x64
- Maven

## Build
- mvn compile

## Run test
- Modify the environment properties in src/test/resources/environments

- mvn clean
- mvn verify -Denv=uat (run on 'uat' environment, can run with other environments as: dev, preprod)

## Report
- All reports are located in `target` folder
- Cucumber HTML report is located in `target/cucumber-reports/cucumber-html-reports`