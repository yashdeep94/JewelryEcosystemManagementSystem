
# Jewelry Ecosystem Management System

## Overview

The **Jewelry Ecosystem Management System** is a comprehensive Java-based application designed to manage the entire jewelry business ecosystem. It covers various business entities such as customers, employees, enterprises (banking, hallmarking, manufacturing, jewelry shops), products (gold, silver, repair), orders, and more. The system is modular, extensible, and follows object-oriented design principles.

## Features

- **Customer Management:** Register, update, and manage customer profiles and directories.
- **Employee Management:** Manage employee profiles and directories across different organizations.
- **Enterprise Management:** Support for multiple enterprise types:
	- Banking
	- Hallmarking
	- Manufacturing
	- Jewelry Shop
- **Product Management:** Handle gold, silver, and repair products, including product catalogs.
- **Order Management:** Create and track orders and order lists.
- **Organization Management:** Modular organizations for billing, gold, silver, security, testing, and more.
- **Role-Based Access:** Multiple roles (admin, account, etc.) for secure and organized access.
- **Network Management:** Manage business networks and their relationships.
- **Database Integration:** MySQL database connectivity for persistent data storage.
- **Modern UI:** Java Swing-based user interface with multiple panels for different business functions.

## Project Structure

```
JewelleryEcosystem/
	src/
		dao/                # Data Access Objects
		model/              # Core business models (customer, employee, enterprise, etc.)
		resources/          # Images, MySQL connector, etc.
		ui/                 # Java Swing UI panels
		utils/              # Utility classes (e.g., database connection)
	build.xml             # Ant build file
	manifest.mf           # Manifest file
	nbproject/            # NetBeans project files
```

## Setup Instructions

### Prerequisites

- Java JDK 8 or higher
- Apache Ant (for building the project)
- MySQL Server (for database)
- NetBeans IDE (recommended, but not required)

### Database Setup

1. Install MySQL and create a database for the system (e.g., `jeweleryecosystem`).
2. Update the database connection details in `JewelleryEcosystem/src/utils/DatabaseConnection.java` as needed.
3. Place the MySQL JDBC driver (`mysql-connector-j-8.0.31.jar`) in the `resources` folder.

### Build & Run

1. Open the project folder in NetBeans or your preferred Java IDE.
2. Build the project using Ant (`build.xml`).
3. Run the main class: `ui/MainJFrame.java`.

## Usage

1. Launch the application.
2. Use the main screen to navigate between different modules (customer, employee, enterprise, etc.).
3. Manage data through the provided UI panels.

## UML & Architecture

- See `UML Class Diagram.pdf` and `High Level Component Diagram.pdf` for detailed architecture and class relationships.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## Acknowledgements

- Java Swing for UI
- MySQL for database
- NetBeans IDE

---
