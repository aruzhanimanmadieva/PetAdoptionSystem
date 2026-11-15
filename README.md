# Pet Adoption System

## Project Overview

Pet Adoption System is a Java console application that demonstrates six design patterns working together in one project.

The system allows users to create pet adoption applications, calculate adoption fees, add optional adoption packages, and send notifications.

## Design Patterns

The project uses six design patterns:

### Creational Patterns
1. **Factory** – creates different types of pets, such as dogs, cats, and rabbits.
2. **Builder** – creates adoption applications step by step.

### Structural Patterns
3. **Facade** – provides one simple interface to coordinate the adoption process.
4. **Decorator** – adds optional features to adoption packages, such as a starter kit and training guide.

### Behavioral Patterns
5. **Strategy** – calculates adoption fees using different strategies: standard, discount, and free adoption.
6. **Observer** – sends notifications to applicants and shelter staff when a new application is created.

## Project Structure

The project contains six packages:

- `factory`
- `builder`
- `facade`
- `decorator`
- `strategy`
- `observer`

The `Main.java` file is located directly in `src/main/java` and demonstrates how the patterns work together.

## Technologies

- Java
- IntelliJ IDEA

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open `src/main/java/Main.java`.
3. Run the `main()` method.

## Example Features

- Create a pet.
- Build an adoption application.
- Add optional adoption package features.
- Notify the applicant and shelter staff.
- Calculate standard, discounted, and free adoption fees.

## Conclusion

The project demonstrates how six design patterns can be integrated into one Java application. Each pattern has a separate responsibility, making the system easier to understand, maintain, and extend.
