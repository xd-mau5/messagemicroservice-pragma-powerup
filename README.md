<br />
<div align="center">
<h3 align="center">PRAGMA POWER-UP</h3>
  <p align="center">
    In this challenge you are going to design the backend of a system that centralizes the services and orders of a restaurant chain that has different branches in the city.
  </p>
</div>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
* ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these steps.

### Prerequisites

* JDK 17 [https://jdk.java.net/java-se-ri/17](https://jdk.java.net/java-se-ri/17)
* Gradle [https://gradle.org/install/](https://gradle.org/install/)

### Recommended Tools
* IntelliJ Community [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
* Postman [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

### Installation

1. Clone the repository
2. Change directory
   ```sh
   cd messagemicroservice-pragma-powerup
   ```
3. Create a .env file in [resources](src%2Fmain%2Fresources)
   ```dotenv
    TWILIO_ACCOUNT_SID=<your twilio account sid>
    TWILIO_AUTH_TOKEN=<your twilio auth token>
    TWILIO_PHONE_NUMBER=<your twilio phone number>
   ```
4. Open Swagger UI and test the endpoints, you must have a twilio account to send messages and be authenticated to access the endpoints
   ```http request
   POST http://localhost:8093/message/send
    Content-Type: application/json
    
    {
      "message": "string",
      "receiver": "string"
    }
   ```

<!-- USAGE -->
## Usage

1. Right-click the class [MessageMicroserviceApplication.java](src%2Fmain%2Fjava%2Fcom%2Fpragma%2Fpowerup%2Fmessagemicroservice%2FMessageMicroserviceApplication.java) and choose Run
2. Open [http://localhost:8093/swagger-ui/index.html](http://localhost:8091/swagger-ui/index.html) in your web browser

<!-- ROADMAP -->
## Tests

- Right-click the test folder and choose Run tests with coverage
