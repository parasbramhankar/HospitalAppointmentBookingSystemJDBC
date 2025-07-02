### Hospital Appointment Booking System

A Java-based application designed to streamline the process of booking and managing hospital appointments. It supports three primary roles: Admin, Doctor, and Patient. The system allows users to book appointments, manage schedules, and maintain patient and doctor data efficiently.

---

## 📌 Project Objective

The goal of this project is to automate the traditional appointment system in hospitals. It reduces the workload on staff, minimizes appointment clashes, and allows doctors and patients to interact through a centralized platform.

---

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Database:** PostgreSQL / MySQL
- **Connectivity:** JDBC (Java Database Connectivity)
- **IDE:** IntelliJ IDEA / Eclipse
- **Build Tool:** Maven (optional)
- **Version Control:** Git

---

## 👥 User Roles

### 👨‍⚕️ Doctor
- View all assigned appointments.
- Access patient details.
- Update appointment status (Complete / Cancelled).

### 🧑‍💻 Patient
- Register and update profile.
- View doctors by specialization.
- Book, cancel, or reschedule appointments.
- View appointment history.

### 👨‍💼 Admin
- Add/update/delete doctors.
- View all appointments.
- Manage doctor and patient records.

---

## 🗂️ Database Design

### 1. `doctor`
- `doctorId` (PK)
- `name`
- `specialization`
- `phone`
- `email`

### 2. `patient`
- `patientId` (PK)
- `name`
- `age`
- `gender`
- `phone`
- `email`

### 3. `appointment`
- `appointmentId` (PK)
- `doctorId` (FK)
- `patientId` (FK)
- `date`
- `time`
- `status` (Pending / Complete / Cancelled)

---

## ✅ Features

- Book and cancel appointments.
- Filter doctors by specialization.
- Doctor can mark appointments as complete.
- Admin can manage users and appointments.
- Data is securely stored and retrieved using JDBC.

---
### class Diagram

![HospitalAppointmentBookingJDBC](https://github.com/user-attachments/assets/b97b1c6f-337c-48e2-8a2b-d9ca53d4d55e)


## 🚀 How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/hospital-appointment-system.git
