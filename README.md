# University Enrollo App

University Enrollo is an Android-based application designed for university enrollment and management. It provides an intuitive UI, secure authentication, and seamless user experience for students and administrators.

## 📌 Features

- **Student Enrollment**: Easily register and enroll in university courses.
- **Admin Dashboard**: Manage users, courses, and university data efficiently.
- **RESTful API Integration**: Connect with backend services for real-time updates.
- **Role-Based Access**: Different roles for students, professors, and admins.
- **Secure Authentication**: Uses Firebase Authentication for login and authorization.

## 🚀 Installation

### Prerequisites
Ensure you have the following installed:
- Android Studio (Latest Version)
- Java Development Kit (JDK)
- Firebase Account

### Steps to Install

1. **Clone the repository**:
   ```bash
   git clone https://github.com/UySamedi/android_project.git
   cd android_project
   ```
2. **Open the project in Android Studio**:
   - Click on `Open an existing project` and select the cloned folder.
3. **Sync Gradle dependencies**:
   - Wait for Gradle to download and set up dependencies.
4. **Configure API Keys & Firebase**:
   - Download `google-services.json` from your Firebase project and place it in `app/`.
   - Ensure backend API URLs are correctly configured in `Constants.java`.
5. **Run the application**:
   - Select an emulator or physical device and click `Run`.

## 📊 Feature Table

| Feature         | Student | Admin |
|---------------|---------|-------|
| Dashboard       | ✔️ Yes | ✔️ Yes |
| Course Enrollment | ✔️ Yes | ❌ No |
| User Management | ❌ No | ✔️ Yes |
| Notifications  | ✔️ Yes | ✔️ Yes |
| Profile Management | ✔️ Yes | ✔️ Yes |

## 🛠 Running Tests
To run unit tests, use:
```bash
./gradlew test
```
To run UI tests, use:
```bash
./gradlew connectedAndroidTest
```

## 🌱 Branch Management

| Branch   | Purpose |
|----------|---------|
| `local`  | Default branch for local development |
| `dev`    | Development and testing branch |
| `stage`  | Used for testing before release |
| `prod`   | Production branch with CI/CD pipeline |

## 📂 Branch Naming Conventions

| Feature Branch | Version | Start Date | Completion Date |
|---------------|---------|------------|-----------------|
| UI Development | v1.0.0  | Feb 20, 2025 | TBD |
| API Integration | v2.0.0 | TBD | TBD |
| Security & Bug Fixes | v1.0.0 | TBD | TBD |

## 🚀 Deployment Guide
This project supports CI/CD for automated deployment. To deploy:
1. Push changes to the `prod` branch.
2. The CI/CD pipeline (e.g., GitHub Actions, Jenkins) will handle the build and deployment.
3. Monitor logs for any issues.

## 🤝 Contribution Guidelines
We welcome contributions! Please follow these steps:
1. Fork the repository.
2. Create a feature branch (`feature-branch-name`).
3. Commit your changes with descriptive messages.
4. Open a Pull Request (PR) for review.

## 📜 License
This project is licensed under the [MIT License](LICENSE).

## 👨‍💻 Contributors
- [Your Name](https://github.com/yourgithub)
- [Contributor 2](https://github.com/contributor2)

## 📧 Contact
For inquiries, reach out via [your.email@example.com](mailto:your.email@example.com).

---
Developed with ❤️ by Auto Pilots Team
