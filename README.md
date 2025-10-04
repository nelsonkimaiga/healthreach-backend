# Healthreach Hospital System

This is a simple web-app that will register a patient, manage new and subsequent visits for the patient and captures their health-related vitals.

Stack used:

Back-end:
- Java, Maven & SpringBoot Framework
- Mysql

Front-End:
- ReactJs

# How to run:

- Clone the repo
- open the `healthreach-backend` folder in your IntelliJ IDE
- build the Maven dependencies and run the application. 

The JAVA API application will run from port `8008` i.e: `http://localhost:8008/healthreach/`

The endpoints defined in the `PatientController` class are:

- `http://localhost:8008/healthreach/register` - for patient registration
- `http://localhost:8008/healthreach/save-visit`- for saving visit details for first time visit
- `http://localhost:8008/healthreach/fetch-patients`- for fetching registered patients in order to handle ssubsequent visits
- `http://localhost:8008/healthreach/visits/{patientNumber}`- for retrieving patient visit information using their `patientNumber`. This will feed the patient report.
