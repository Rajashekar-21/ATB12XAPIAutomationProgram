API Teting Automation Learning
1. Objective

To validate that the APIs of the application under test (AUT) are functional, reliable, secure, and meet business requirements.

2. Scope

In-Scope:

Functional validation of REST APIs (GET, POST, PUT, DELETE).

Status code verification.

Response body and schema validation.

Authentication and authorization checks.

Basic performance validation (response time).

Out-of-Scope:

Frontend UI testing.

Deep performance/load testing (covered separately by performance testing team).

3. Tools & Frameworks

Language: Java (or Python, JS depending on team)

Framework: REST Assured + TestNG (for Java)

Build Tool: Maven/Gradle

Reporting: Allure Reports

CI/CD: Jenkins / GitHub Actions

4. Test Scenarios

Positive Tests

Verify GET /users returns 200 and valid list of users.

Verify POST /users with valid data returns 201 and correct user object.

Verify PUT /users/{id} updates user correctly and returns 200.

Verify DELETE /users/{id} returns 204 and removes user.

Negative Tests

Verify GET /users/{id} with invalid ID returns 404.

Verify POST /users with invalid body returns 400.

Verify requests without authentication return 401.

Verify requests with insufficient role return 403.

Boundary Tests

Verify API handles very large input payloads gracefully.

Verify mandatory fields cannot be null/empty.

Performance (basic)

Verify response time for all critical APIs is < 2 seconds.

5. Test Data

Use a dedicated test environment with seed data.

Test data prepared via DB scripts or setup APIs.

Sensitive data (tokens, credentials) stored securely (e.g., in environment variables).

6. Entry & Exit Criteria

Entry: Test environment ready, APIs deployed, test data available.

Exit: All planned test cases executed, no critical/high defects open.

7. Deliverables

Automated test scripts (in Git repo).

Test execution reports (Allure / TestNG).
