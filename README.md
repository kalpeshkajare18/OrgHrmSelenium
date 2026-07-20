OrgHrmSelenium
Automated test suite for the OrangeHRM demo application, built with Selenium WebDriver, Cucumber (BDD), and TestNG, managed with Maven.

🧰 Tech Stack
Tool	Purpose
Java 17	Programming language
Maven	Build & dependency management
Selenium WebDriver 4.11.0	Browser automation
Cucumber (Java + TestNG) 7.7.0	BDD-style test scenarios (Gherkin)
TestNG	Test execution & reporting

📁 Project Structure
```
OrgHrmSelenium/
├── src/
│   ├── main/java/...          # Page Objects / reusable utilities
│   └── test/
│       ├── java/...           # Step definitions & runner classes
│       └── resources/         # Cucumber .feature files
├── test-output/               # Generated test execution reports
├── target/                    # Compiled build output
├── pom.xml                    # Maven project configuration
└── README.md
```


✅ Prerequisites
Before running the tests, make sure you have:
Java 17 (JDK) installed
Maven installed and available on your PATH
A supported browser (e.g. Chrome) installed locally
The matching WebDriver (e.g. ChromeDriver) available — either on your PATH or managed automatically depending on your driver setup
🚀 Getting Started
Clone the repository
```bash
   git clone https://github.com/kalpeshkajare18/OrgHrmSelenium.git
   cd OrgHrmSelenium
   ```
Install dependencies
```bash
   mvn clean install
   ```
Run the tests
```bash
   mvn test
   ```
Or run a specific TestNG suite / runner class if one is defined in the project.

📊 Test Reports
After execution, results are available in the `test-output/` directory (TestNG reports) and/or as Cucumber reports, depending on the configured plugins in the runner class.
🧪 About the Application Under Test
The tests target the publicly available OrangeHRM demo site, an open-source HR management system, commonly used as a sandbox for practicing and demonstrating Selenium-based test automation (login flows, dashboard navigation, employee management, etc.).
Demo site: https://opensource-demo.orangehrmlive.com/

🗺️ Features Covered
> Update this list based on the actual `.feature` files in `src/test/resources`.
[ ] Login functionality
[ ] Dashboard verification
[ ] Employee/PIM module actions
[ ] Other OrangeHRM modules as covered by feature files

🤝 Contributing
Fork the repo
Create a feature branch (`git checkout -b feature/your-feature`)
Commit your changes
Push and open a Pull Request
📄 License
No license specified yet — consider adding one (e.g. MIT) if this project is meant to be reused by others.

👤 Author
Kalpesh Kajare
GitHub: @kalpeshkajare18
