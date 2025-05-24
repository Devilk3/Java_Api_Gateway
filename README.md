
# Dodo Payments Backend Service (Rust + Actix Web + SQLite)

A lightweight backend service for managing users, authentication (with JWT), and transactions. Built with **Rust**, **Actix Web**, **Diesel ORM**, and **SQLite**.

## Features

- User registration with password hashing
- JWT-based user login and authentication
- Secure transaction creation
- Account balance computation
- Logging (to file and console)
- Modular and testable structure


## Tech Stack

- **Rust** (stable)
- **Actix Web** – Web framework
- **Diesel** – ORM for SQLite
- **Argon2** – Password hashing
- **JWT** – JSON Web Tokens for authentication
- **Tracing** – Logging (with `tracing` + `tracing-appender`)
- **dotenvy** – Environment variable loading

---

## Folder Structure

```
src/
├── db/               # Database pool setup
├── models/           # DB models using Diesel
├── routes/           # API route handlers
├── schema.rs         # Diesel schema (auto-generated)
├── services/         # Business logic (user, transaction)
├── utils/            # Utility functions (hashing, JWT)
└── main.rs           # Server entry point
```

---

## Setup Instructions

### 1. Clone the repo

```bash
git clone https://github.com/Devilk3/dodo_assignment.git
cd dodo-payments
```

### 2. Set up environment

Create a `.env` file:

```env
DATABASE_URL=sqlite://dodo.db
JWT_SECRET=1a27c3682b342d3498f3b8a2c0e4d7gn67
RUST_LOG=info
```

### 3. Run migrations

```bash
diesel setup
diesel migration run
```

### 4. Run the server

```bash
cargo run
```

Server will start at: `http://127.0.0.1:8080`

---

## API Endpoints

### Auth

- `POST /register` – Register a new user
- `POST /login` – Login user and return JWT token

### Transactions

- `POST /transactions` – Create new transaction 
- `GET /transactions/{user_id}` – Fetch user transactions
- `GET /balance/{user_id}` – Get user account balance

---

## Logging

Logs are stored in the `logs/` folder. Two formats:

- Console: Human-readable
- File: JSON format (`logs/app.log`)

---

## Running Tests

```bash
cargo test
```

---

## License

MIT License

---

## Author

Devilal Kumawat (https://github.com/Devilk3)
