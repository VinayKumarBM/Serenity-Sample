# Serenity-Sample

## **Overview:**
[Serenity](http://www.thucydides.info/) is an open-source reporting library that enables developers to write easily-understandable and better-structured acceptance criteria for test automation projects. In addition to generating meaningful reports for each test, the tool also shows the list of features tested in each test case. With the details of the executed tests and the requirements that were tested, Serenity BDD Framework allows you to better understand how an application works and what it does.

The good thing about Serenity BDD Framework is that it supports multiple automated acceptance testing solutions. You can use the tool along with JUnit to quickly write clean and maintainable acceptable criteria or integrate it with WebDriver to test web applications in Selenium.

For Demo purpose all the test cases are created for [automationpractice.com](http://automationpractice.com/index.php) site.

### **Some of the key features of this framework:**

1. Test are written using BDD.
2. It support parallel execution of feature files.
3. It generates test execution log file.
4. Test execution can be triggered form command line.
5. Easy integration to CI/CD pipeline.
6. Framework uses Page Object Design Pattern, hence there is clean separation between test code and page specific code such as locators.
7. It generates test execution reports using serenity reports.


## **Required Setup :**

- [Java](https://www.guru99.com/install-java.html) should be installed and configured.
- [Maven](https://mkyong.com/maven/how-to-install-maven-in-windows/) should be installed and configured.
- Download the files from Git repository either as zip file OR using [Git](https://phoenixnap.com/kb/how-to-install-git-windows).

## **Running Test:**

Open the command prompt and navigate to the folder in which pom.xml file is present.
Run the below Maven command.

```
mvn serenity:aggregate verify
```

Once scripts completes execution report will be generated in */target/site/serenity*  folder.
