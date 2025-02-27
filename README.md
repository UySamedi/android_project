# University Erollo App

University Erollo is a Laravel-based application designed for university enrollment and management. It provides an admin dashboard, RESTful API, and various user roles to streamline operations.

## 📌 Features

- **Admin Dashboard**: Manage products, categories, orders, and users efficiently.
- **Laravel & Livewire**: Uses Laravel's backend with Livewire for reactive UI.
- **RESTful API**: Enables external integrations and user interactions.
- **Role-Based Access**: Supports different API roles (Admin, Doctor, User).
- **Secure Authentication**: Uses Laravel Sanctum for API authentication.

## 🚀 Installation

### Prerequisites
Ensure you have the following installed:
- PHP 8.1+
- Composer
- MySQL
- Node.js & npm (for frontend dependencies, if applicable)

### Steps to Install

1. **Clone the repository**:
   ```bash
   git clone https://github.com/CHANTHEA22/vcs_api.git
   cd vcs_api
   ```
2. **Install Laravel dependencies**:
   ```bash
   composer install
   ```
3. **Copy and configure environment file**:
   ```bash
   cp .env.example .env
   ```
4. **Generate application key**:
   ```bash
   php artisan key:generate
   ```
5. **Set up database**:
   - Update `.env` file with your database credentials.
   - Run migrations and seed data:
     ```bash
     php artisan migrate --seed
     ```
6. **Start the development server**:
   ```bash
   php artisan serve
   ```

## 📊 Feature Table

| Feature         | Admin API  | API Doctor  | API User  |
| -------------- | ----------- | -------- | ---------- |
| Dashboard       | 🔜 Coming Soon | ✔️ Yes | 🔜 Coming Soon |
| Search          | ❌ No        | ✔️ Done | ❌ No       |
| Users          | ✔️ Done      | ❌ Bug    | 🔜 Coming Soon |
| User Addresses  | 🔜 Coming Soon | ✔️ Yes  | ❌ No       |
| Categories      | ✔️ Done      | ❌ No    | 🔜 Coming Soon |
| Products        | ✔️ Done      | ✔️ Yes   | 🔜 Coming Soon |
| Orders         | ❌ No        | ❌ No    | ❌ No       |
| Profile        | 🔜 Coming Soon | ✔️ Done | ❌ No       |

## 🛠 Running Tests
To run tests, use the following command:
```bash
php artisan test
```

## 🌱 Branch Management

| Branch   | Purpose |
|----------|---------|
| `local`  | Default branch for local development |
| `dev`    | Development and testing branch |
| `stage`  | Used for unit tests and PHP testing |
| `prod`   | Production branch with CI/CD pipeline |

## 📂 Branch Naming Conventions

| Feature Branch | Version | Start Date | Completion Date |
|---------------|---------|------------|-----------------|
| Create & Read | v1.0.0  | Feb 20, 2025 | [Enter Date] |
| Update & Delete | v2.0.0 | [Start Date] | [Enter Date] |
| Security & Bug Fixes | v1.0.0 | [Start Date] | [Enter Date] |

## 🚀 Deployment Guide
This project supports CI/CD for automated deployment. To deploy, follow these steps:
1. Push changes to the `prod` branch.
2. The CI/CD pipeline will handle deployment.
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
Developed with ❤️ by [@CHANTHEA22](https://github.com/CHANTHEA22)
