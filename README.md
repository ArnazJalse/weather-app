# Weather App

The Weather App is a web application that allows users to fetch weather information for different countries using an external weather API. The backend of the application is built using Spring Boot, while the frontend is developed using HTML, CSS, and JavaScript.

## Features

- Enter a country name to fetch the current weather information.
- Display the weather details including location, temperature, and condition in JSON format.
- Visualize the weather response in a textbox on the web page.

## Technologies Used

- Spring Boot: Backend framework for building the RESTful API.
- HTML, CSS, JavaScript: Frontend technologies for creating the user interface.
- jQuery: JavaScript library used for AJAX requests and DOM manipulation.
- REST API: Utilize an external weather API to fetch weather data.

## Setup and Running the Application

1. Clone the repository:

```bash
git clone https://github.com/ArnazJalse/weather-app.git
  
2. Open the project in your preferred IDE.

3. Build and run the Spring Boot application.

4. Open a web browser and navigate to `http://localhost:8080`.

5. Enter the country name in the input field and click the "Get Weather" button.

6. The weather information for the specified country will be displayed in the textbox below.

## Configuration

- The external weather API requires an API key for accessing the data. Make sure to update the `apiKey` variable in the `WeatherController` class with your own API key.

```java
String apiKey = "your-api-key";
