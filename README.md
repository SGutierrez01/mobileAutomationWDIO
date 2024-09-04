# Mobile Automation WDIO - Appium Project

This project demonstrates the use of the **Page Object Model (POM)** design pattern with **Appium** and **TestNG** for mobile application test automation.

## Project Structure

<img width="298" alt="image" src="https://github.com/user-attachments/assets/4c340de8-b2a3-4d4f-9fbd-0c052ad5b252">


- **screens**: Contains classes representing different app screens (LoginScreen, SwipeScreen, etc.).
- **tests**: Contains test classes for specific scenarios (LoginTest, SignUpTest, SwipeTest, NavigationTest).
- **utils/data**: Contains shared data used across tests, such as `UserData`.
- **utils/screen**: Base classes for shared screen interactions, such as `BaseScreen`.
- **utils/test**: Base classes for shared test logic, such as `BaseTest`.
- **resources**: Contains configuration properties and the `wdioSuite.xml` to execute the entire test suite.

## Technologies Used

- **Appium**: For mobile test automation on Android or iOS (In this case, Android).
- **TestNG**: For managing test cases and providing annotations.
- **Java**: Programming language for the test implementation.
- **Page Object Model (POM)**: To keep test code modular and reusable.
- **Maven**: For managing dependencies and the build lifecycle.
- **UiAutomator2**: For managing interactions with Android apps at the native level, providing advanced control over UI elements.

## Test Scenarios

1. **NavigationTest**: Verifies navigation through different screens using the bottom menu.
2. **SignUpTest**: Completes the user registration process and verifies successful completion using random email generation.
3. **LoginTest**: Verifies the login functionality using a previously registered user.
4. **SwipeTest**: Validates horizontal swipe on cards and vertical scroll until hidden text is revealed.

## How to Run the Tests

All tests are executed via the **wdioSuite.xml** file located in the `src/test/resources` directory.

### Steps to Run the Tests:

1. **Install Dependencies**: Ensure Maven is set up, then run: mvn clean install
2. **Run Suite Tests**: Use IDE to run all tests with wdioSuite.xml.
3. **Run Individual Tests**:
You can run any specific test directly from its class in your IDE or through Maven.

## Additional Notes

- Tests run in the following order: Navigation, SignUp, Login, Swipe.
- The app is reset between tests to ensure a clean state.
- User data generated in the `SignUpTest` is reused in the `LoginTest`. However, `LoginTest` can be run independently.

---

**Author**: Santiago Gutiérrez  
**Date**: September 2024


