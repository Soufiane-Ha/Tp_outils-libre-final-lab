### Terminal command  Gradle

```PowerShell
PS C:\Users\ELITE COMPUTER\Desktop\outils-libre-final-lab> gradle init
Starting a Gradle Daemon (subsequent builds will be faster)

Select type of build to generate:
  1: Application
  2: Library
  3: Gradle plugin
  4: Basic (build structure only)
Enter selection (default: Application) [1..4] 3

Select implementation language:
  1: Java
  2: Kotlin
  3: Groovy
Enter selection (default: Java) [1..3] 1

Project name (default: outils-libre-final-lab): pricing-engine-gradle

Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 2

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] no


> Task :init
For more information, please refer to https://docs.gradle.org/8.7/userguide/custom_plugins.html in the Gradle documentation.

BUILD SUCCESSFUL in 3m 5s
1 actionable task: 1 executed
PS C:\Users\ELITE COMPUTER\Desktop\outils-libre-final-lab> 

```

### Terminal command Git 


```PowerShell
PS C:\Users\ELITE COMPUTER\Desktop\outils-libre-final-lab> git init
Initialized empty Git repository in C:/Users/ELITE COMPUTER/Desktop/outils-libre-final-lab/.git/
PS C:\Users\ELITE COMPUTER\Desktop\outils-libre-final-lab> git add .
>> git commit -m "Initial Gradle project setup"
warning: in the working copy of 'gradle/wrapper/gradle-wrapper.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'plugin/src/functionalTest/java/org/example/PricingEngineGradlePluginFunctionalTest.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'plugin/src/main/java/org/example/PricingEngineGradlePlugin.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'plugin/src/test/java/org/example/PricingEngineGradlePluginTest.java', LF will be replaced by CRLF the next time Git touches it
[master (root-commit) eb283c3] Initial Gradle project setup
 13 files changed, 538 insertions(+)
 create mode 100644 .gitattributes
 create mode 100644 .gitignore
 create mode 100644 README.md
 create mode 100644 gradle/libs.versions.toml
 create mode 100644 gradle/wrapper/gradle-wrapper.jar
 create mode 100644 gradle/wrapper/gradle-wrapper.properties
 create mode 100644 gradlew
 create mode 100644 gradlew.bat
 create mode 100644 plugin/build.gradle
 create mode 100644 plugin/src/functionalTest/java/org/example/PricingEngineGradlePluginFunctionalTest.java
 create mode 100644 plugin/src/main/java/org/example/PricingEngineGradlePlugin.java
 create mode 100644 plugin/src/test/java/org/example/PricingEngineGradlePluginTest.java
 create mode 100644 settings.gradle
 ```

### Terminal command Gradle Test 

 ```PowerShell
PS C:\Users\ELITE COMPUTER\Desktop\outils-libre-final-lab> gradle test
Starting a Gradle Daemon, 3 incompatible and 3 stopped Daemons could not be reused, use --status for details

BUILD SUCCESSFUL in 29s
6 actionable tasks: 5 executed, 1 up-to-date
 ```
