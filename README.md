## Project Description

### Overview
This project is a simple web application developed using Spring Boot and Java. The application allows users to register, log in, and post messages. The main functionalities include user authentication, message posting, editing, and deletion.

### Features

1. **User Management**
   - **Registration**: Users can register with an email, username, and password.
   - **Login**: Users can log in using their email and password.
   - **Logout**: Users can log out from their session.

2. **Message Management**
   - **Add Message**: Logged-in users can add new messages.
   - **Edit Message**: Users can edit their own messages.
   - **Delete Message**: Users can delete their own messages.
   - **View Messages**: Users can view all messages posted.

### Technologies Used
- **Spring Boot**: Framework used for building the web application.
- **Java**: Programming language used for developing the application.
- **Bootstrap**: CSS framework for styling the frontend.

### Project Structure
- **UserComponent.java**: Manages user-related operations such as checking if a user exists, retrieving users by email or ID, and managing the list of users.
- **MessageComponent.java**: Manages message-related operations such as retrieving messages by ID, removing messages, and managing the list of messages.
- **IndexController.java**: Handles HTTP requests for user login, registration, and message management. It includes methods for login, registration, adding, editing, deleting, and viewing messages.
- **UserEntry.java**: Entity class representing a user in the application. It includes fields for user ID, email, username, password, and a list of messages.
- **MessageEntry.java**: Entity class representing a message in the application. It includes fields for message ID, username, message content, date, and the user who posted the message.
- **UserRepository.java**: Interface for user-related database operations using Spring Data JPA.
- **MessageRepository.java**: Interface for message-related database operations using Spring Data JPA.
- **HTML Templates**: Templates for rendering web pages, including login, registration, adding messages, editing messages, and viewing messages.


