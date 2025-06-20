# Singleton Logger in Java

This project demonstrates the **Singleton Design Pattern** in Java through a simple `Logger` class. The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.

## 📁 Project Structure
```bash
├── Logger.java
├── Main.java
└── README.md
````


## 🚀 How It Works

- **Logger.java**: Implements a Singleton class with a private constructor and a static method `getInstance()` that returns the single instance.
- **Main.java**: Demonstrates the usage of the `Logger` class, ensuring only one instance is created and used throughout the application.

## 🔍 Key Concepts

- **Private Constructor**: Prevents instantiation from outside the class.
- **Static Instance Variable**: Holds the single instance of the class.
- **Lazy Initialization**: The instance is created only when it's needed.

## 🧪 Example Output

```bash
Logger instance created.
Log: First log message.
Log: Second log message.
Singleton confirmed.
```


