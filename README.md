# Front-End Automation Framework (Selenium + Cucumber)

### 🚀 Overview
This is a **Hybrid BDD Framework** developed using **Selenium WebDriver** and **Java**. It follows the **Page Object Model (POM)** design pattern to ensure high reusability and maintainability of test scripts.

### 🛠️ Tech Stack
* **Language:** Java 8
* **Automation:** Selenium WebDriver
* **BDD Tool:** Cucumber 7.x
* **Test Runner:** TestNG
* **Build Tool:** Maven
* **Data Management:** Apache POI (Excel)

### 🏗️ Framework Architecture
* **Page Object Model:** Separate classes for UI elements and actions (e.g., `LoginPage.java`, `InventoryPage.java`).
* **Behavior-Driven Development (BDD):** Feature files written in Gherkin for business-readable test scenarios.
* **Data-Driven Testing:** Integrated with **Excel** to drive multiple test data sets through the `ExcelReader` utility.
* **Hooks:** Automated browser setup and teardown, including screenshot capture on failure.

### 📂 Folder Structure
* `src/main/java`: Page Objects and Utility classes.
* `src/test/java`: Step Definitions and Test Runners.
* `src/test/resources`: Feature files, Test Data (Excel), and Config properties.

### 🏃 How to Run
1. Clone the repository.
2. Ensure Maven is installed.
3. Run the following command in the terminal:
   ```bash
   mvn clean test
4. Reports are generated in the target/ folder as cucumber-reports.html.
4. Run the following command in the terminal:
   ```bash
   mvn clean test
