# wdj
Investigation of Selenium WebDriver with Java.


# Prerequisite

|Tools    |Version |Memo                                 |
|---------|--------|-------------------------------------|
|WebDriver|2.45.0  |Latest version on June 3rd 2015.     |                              |
|JDK      |1.7.0_67|-                                    |
|Maven    |3.3.3   |https://maven.apache.org/download.cgi|


# How to use WebDriver with Maven
Reference : http://docs.seleniumhq.org/download/maven.jsp

## 1) Add the following dependency onto your `pom.xml`.
	<dependencies>
	    <dependency>
	        <groupId>org.seleniumhq.selenium</groupId>
	        <artifactId>selenium-java</artifactId>
	        <version>2.45.0</version>
	    </dependency>
	</dependencies>

## 2) (Optional) Convert your project as a Maven project with which Eclipse can distinguish.
	$ mvn eclipse:eclipse

## 3) (Optional) Add `M2 REPO` variables onto your Eclipse.
The path of `M2 REPO` is `$YOUR_HOME/.m2/repository`.

After that, you can use WebDriver on Eclipse with Maven.



# How to use RemoteWebDriver

## 1) Remote Server
	java -jar selenium-server-standalone-2.46.0.jar
	http://localhost:4444/wd/hub/static/resource/hub.html

## 2) Selenium Grid
	java -jar selenium-server-standalone-2.46.0.jar -role hub -port 1111
	http://localhost:1111/
