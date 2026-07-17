# REST Assured API Automation Framework

## Overview

This project is an API automation framework developed using Java, REST Assured, TestNG, and Maven for validating RESTful web services.

The framework is designed to automate API functional testing, validate service responses, and support reliable regression testing.

The framework follows a reusable API client architecture where API implementation is separated from test validation logic.

---

## Technology Stack

* Java
* REST Assured
* TestNG
* Maven
* JSON
* GitHub Actions

---

## Framework Features

* REST API automation using REST Assured
* Support for HTTP methods:

  * GET
  * POST
  * PUT
  * DELETE
* Request and response validation
* Status code verification
* JSON response validation
* Header validation
* Request payload management
* API client layer implementation
* Reusable request specifications
* TestNG execution
* Maven dependency management
* CI/CD integration

---

## Framework Architecture

```text id="2l4x93"
rest-assured-api-framework

├── src/main/java
│
│   ├── base
│   │   └── BaseAPI.java
│   │
│   ├── client
│   │   └── UserAPI.java
│   │
│   └── utils
│       └── TestData.java
│
├── src/test/java
│
│   └── tests
│       └── UserAPITest.java
│
├── src/test/resources
│   └── testdata.json
│
├── pom.xml
└── README.md
```

---

## Framework Design

### API Client Architecture

The framework separates API implementation from test validation.

API Client Layer:

* Handles endpoint details
* Creates API requests
* Manages request methods

Test Layer:

* Validates business scenarios
* Performs assertions
* Verifies API responses

Benefits:

* Better maintainability
* Reusable API methods
* Cleaner test scripts
* Easy endpoint updates

---

## API Execution Flow

```text id="xgjp9r"
API Test Class

       |

       |

API Client Layer

       |

       |

REST Assured Request

       |

       |

REST Service Endpoint

       |

       |

Response Validation
```

---

## Supported API Operations

### GET

Used for retrieving existing resources.

Example:

```text id="q9cj7h"
GET /users/{id}
```

---

### POST

Used for creating new resources.

Example Request:

```json
{
 "name":"Test User",
 "job":"Automation Engineer"
}
```

---

### PUT

Used for updating existing resources.

Example:

```text
PUT /users/{id}
```

---

### DELETE

Used for removing resources.

Example:

```text
DELETE /users/{id}
```

---

## Response Validation

The framework validates:

* HTTP status codes
* Response body data
* JSON fields
* Headers
* API response structure

Example validations:

```text
Status Code = 200

Content-Type = application/json

Required fields available
```

---

## Prerequisites

Install:

* Java JDK 11 or above
* Maven
* Git

Verify installation:

```bash id="1rcp9j"
java -version

mvn -version
```

---

## Installation

Clone repository:

```bash id="e3y7q1"
git clone <repository-url>
```

Navigate to project:

```bash id="7h2f8n"
cd rest-assured-api-framework
```

Install dependencies:

```bash id="4x6q0m"
mvn clean install
```

---

## Test Execution

Execute API automation tests:

```bash id="9s5c0d"
mvn clean test
```

---

## Reports

Test execution reports contain:

* API execution status
* Passed/Failed scenarios
* Validation results
* Failure details

---

## CI/CD Integration

The framework can be executed through GitHub Actions.

Execution flow:

```text id="2v0r4m"
Code Commit

      |

GitHub Actions

      |

Setup Java

      |

Install Maven Dependencies

      |

Execute REST API Tests

      |

Generate Results
```

---

## Future Enhancements

Planned improvements:

* JSON schema validation
* Allure reporting
* API performance validation
* Database validation integration
* Docker execution
* Environment-based configuration
* API mocking support

---

## Author

**Periyasamy Muthu**

Senior SDET | Automation Test Engineer

LinkedIn:

https://www.linkedin.com/in/periyasamymuthu
