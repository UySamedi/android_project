# University Erollo App

University Erollo is an Android-based application designed for university enrollment and management. It provides an intuitive UI, secure authentication, and seamless user experience for students and administrators.

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
- Java Development Kit

### Steps to Install

1. **Clone the repository**:
   ```bash
   git clone https://github.com/CHANTHEA22/vcs_api.git
   cd vcs_api
   ```
2. **Open the project in Android Studio**:
   - Click on `Open an existing project` and select the cloned folder.
3. **Sync Gradle dependencies**:
   - Wait for Gradle to download and set up dependencies.
4. **Configure API Keys & Firebase**:
   - Update `google-services.json` with Firebase credentials.
   - Ensure backend API URLs are correctly configured in `Constants.java`.
5. **Run the application**:
   - Select an emulator or physical device and click `Run`.

## 📊 Feature Table

| Feature         | Student | Professor | Admin |
| -------------- | -------- | -------- | ---------- |
| Dashboard       | ✔️ Yes | ✔️ Yes | ✔️ Yes |
| Course Enrollment | ✔️ Yes | ❌ No | ❌ No |
| User Management | ❌ No | ❌ No | ✔️ Yes |
| Notifications  | ✔️ Yes | ✔️ Yes | ✔️ Yes |
| Profile Management | ✔️ Yes | ✔️ Yes | ✔️ Yes |

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
| UI Development | v1.0.0  | Feb 20, 2025 | [Enter Date] |
| API Integration | v2.0.0 | [Start Date] | [Enter Date] |
| Security & Bug Fixes | v1.0.0 | [Start Date] | [Enter Date] |

## 🚀 Deployment Guide
This project supports CI/CD for automated deployment. To deploy:
1. Push changes to the `prod` branch.
2. The CI/CD pipeline will handle the build and deployment.
3. Monitor logs for any issues.

## 🤝 Contribution Guidelines
We welcome contributions! Please follow these steps:
1. Fork the repository.
2. Create a feature branch (`feature-branch-name`).
3. Commit your changes with descriptive messages.
4. Open a Pull Request (PR) for review.

## 📜 License
This project is licensed under the [MIT License](LICENSE).

## 📧 Contact
For inquiries, reach out via [your.email@example.com](mailto:your.email@example.com).

---
Developed with ❤️ by auto pilots
