# # VCS RESTful API with Laravel & MySQL

## Installation Steps

### Laravel Installation

1. **Clone the project repository:**
   ```bash
   git clone https://github.com/CHANTHEA22/vcs_api.git
   ```
2. **Install Laravel dependencies:**
    ```bash
    composer install
    ```
3. **Create a copy of the `.env` file:**
    ```bash
    cp .env.example .env
    ```
4. **Generate an application key:**
    ```bash
    php artisan key:generate
    ```
5. **Run database migrations and seed data (if needed):**
    ```bash
    php artisan migrate --seed
    ```

## Features

- **Admin Dashboard:** Manage products, categories, orders, and customers seamlessly.
- **Laravel & Livewire:** Leverage the power of Laravel's backend with Livewire for reactive UI.
- **RESTful API:** Enables external integrations and interactions with the platform.

## Feature Table

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

## Running Tests
Run tests using the following command:
```bash
php artisan test
```

## Branch Management
- `local` - Default branch for local development.
- `dev` - Used for development and testing.
- `stage` - Used for unit tests and PHP testing.
- `prod` - Production branch for deployment via CI/CD pipeline.

## Branch Naming Conventions
|       Feature Branch      |       Version     |       Start Date      |       Completion Date     |
|---------------------------|-------------------|-----------------------|---------------------------|
|   Create and Read	        |   Version 1.0.0	|  Feb 20, 2025     |	[Enter Date]            |
|   Update and Delete	        |   Version 2.0.0	|  [Start Date]     |	[Enter Date]            |
|   Security and Bug	        |   Version 1.0.0	|  [Start Date]    |	[Enter Date]            |
