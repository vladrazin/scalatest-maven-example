# `scalatest-maven-example`
> Enforce and report API quality with ScalaTest with this Maven POM.

## Why ScalaTest
ScalaTest is the most flexible and most popular testing tool in the Java/Scala ecosystem. With ScalaTest, you can test Scala, Scala.js (JavaScript), and Java code. By offering deep integration with tools such as JUnit, TestNG, Ant, Maven, sbt, ScalaCheck, JMock, EasyMock, Mockito, ScalaMock, Selenium, Eclipse, NetBeans, and IntelliJ, ScalaTest makes it easy to take your testing to a higher, more productive level in new or existing Scala, Scala.js, or Java projects.

* Relatively fast and flexible

* Simulating HUMAN users


* Basic process (aka "cenario")


## Table of contents
<!-- ⛔️ AUTO-GENERATED-CONTENT:START (TOC:excludeText=Table of contents) -->
- [1. Overview](#1-overview)
- [2. Prerequisite software](#2-prerequisite-software)
- [3. Installation](#3-installation)
- [4. Launch the test](#4-launch-the-test)
- [5. Security](#5-security)
- [6. Semantic version](#6-semantic-version)
- [7. Semantic version(#7-semantic-version-and-changelog)

<!-- ⛔️ AUTO-GENERATED-CONTENT:END -->


## 1. Overview

Design of ScalaTest
by Bill Venners, creator of ScalaTest

The design
ScalaTest is the “scalable test framework.” Like the Scala language on which it is built, ScalaTest is designed to grow with the demands of its users.

Scala is a scalable language in two ways. First, Scala can be molded through library and DSL design to fit widely different tasks. Second, Scala scales both down to small tasks and up to large ones. It feels as natural to use for small tasks like scripting as it does for large tasks like major software projects built by large teams. ScalaTest is scalable in similar ways. First, it can be easily molded by overriding its lifecycle methods to address special testing needs when they arise. Second, it is designed facilitate both small tasks in the Scala interpreter (see Assertions, ShouldMatchers, and the ScalaTest Shell) and to scale up to testing very large software projects built by large teams.

The design of ScalaTest can be summed up in one sentence:

ScalaTest allows you to ask a suite of tests to run itself.

The terms suite and test are defined abstractly in ScalaTest to enable a wide variety of implementations. A test in ScalaTest is anything with a name that can start and either succeed or fail. A suite is a collection of zero to many tests. ScalaTest's core trait Suite, which represents the concept of a suite of zero to many tests, declares a run method. To ask a Suite of tests to run itself, you invoke its run method.


The **purpose of the project** is to use the Maven Site Plugin to:
  1. Build ScalaTest project
  2. Execute ScalaTest Suites
  3. Generate test results
  

## 2. Prerequisite software

`scalatest-maven-example` is written in Scala, which must be installed prior to use. `scalatest-maven-example` manages Scala dependencies with Maven.

 1. **Java<sup>:tm:</sup> EE 8 SDK:** Either
    * [`oracle64-1.8.x1`](http://www.oracle.com/technetwork/java/javase/downloads/index.html) or
    * [`openjdk:8-jdk-alpine`](https://github.com/docker-library/openjdk/blob/b4f29ba829765552239bd18f272fcdaf09eca259/8-jdk/alpine/Dockerfile)

 1. [**Maven**][maven-dl-url]
 


## 3. Installation
> :bulb: If you're working on macOS, we recommend installing or updating software with [Homebrew](https://brew.sh/).

  1. Fork or clone this repository.

  ```bash
  $ git clone https://github.com/vladrazin/scalatest-maven-example
  $ cd scalatest-maven-example
  ```

  1. Install with Maven:

  ```bash
  $ mvn clean install -DskipTests=true -Dmaven.javadocs.skip=true -B -V
  ```


### 4. Launch the test

```bash
$ mvn test
```

Then 
* for Linux
* $ cd target/surefire-reports directory
* $ ls
* verify if the TestSuite.txt file exists
* $ vi TestSuite.txt
* Check the result

* for Windows
* open the file
* target\surefire-reports\TestSuite.txt
* and check the result

## 5. Security

_Highlight important security issues/concerns in this section._

## 6. Semantic version

The latest version of `scalatest-maven-example` is `0.0.1-SNAPSHOT`.
