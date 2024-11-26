# Selenium Automation: Fitpeo Revenue Calculator

This project is a Selenium-based automation script that interacts with the **Fitpeo Revenue Calculator** webpage. The script automates browser actions such as navigating to a website, scrolling, interacting with sliders, input fields, and checkboxes.

---

## Features

- Automates a Google Search for "Fitpeo."
- Navigates to the Fitpeo website and its **Revenue Calculator** page.
- Scrolls dynamically using JavaScript for element visibility.
- Simulates slider interactions by dragging elements.
- Fills out input fields and updates their values dynamically.
- Selects specific checkboxes based on predefined criteria.

---

## Prerequisites

To run this script, ensure you have the following:

1. **Java Development Kit (JDK)**:
   - Version 8 or higher.
   - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Selenium WebDriver**:
   - Latest version of Selenium WebDriver.
   - [Download Selenium](https://www.selenium.dev/downloads/).

3. **Browser Driver**:
   - Install the appropriate WebDriver for your browser. This script uses **Microsoft Edge**.
   - [Download EdgeDriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/).

4. **Integrated Development Environment (IDE)**:
   - Recommended: IntelliJ IDEA, Eclipse, or Visual Studio Code.

5. **Git**:
   - To clone the repository. [Download Git](https://git-scm.com/).

---

## Setup Instructions

### Step 1: Clone the Repository

1. Open a terminal or command prompt.
2. Run the following commands:
   ```bash
   git clone https://github.com/<your-username>/fitpeo-automation.git
   cd fitpeo-automation
   
### Step 2: (Install WebDriver):


### Step 3: Update Dependencies
This script requires Selenium. You can manage dependencies using Maven or manually download the required JAR files.

Option 1: Using Maven

Add the following dependency to your pom.xml file:

<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.11.0</version> <!-- Use the latest version -->
    </dependency>
</dependencies>
Save the file, and Maven will automatically download the necessary JAR files.

Option 2: Manual Download

Download the Selenium JAR files from the Selenium Downloads page.
Add the downloaded JAR files to your project:
In your IDE, go to the project settings and include the JAR files in your build path.

### Step 4: Run the Script
Open your IDE and load the Assignment.java file from the project.

Compile the script:

bash
Copy code
javac -cp ".;path/to/selenium-java.jar" Assignment.java
Replace path/to/selenium-java.jar with the actual path to your Selenium JAR file.

Run the script:

bash
Copy code
java -cp ".;path/to/selenium-java.jar" org.example.Assignment
Observe the browser actions performed by the script.
