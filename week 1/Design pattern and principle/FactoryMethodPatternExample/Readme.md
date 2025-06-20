# 📄 Document Factory in Java

This project demonstrates the **Factory Method Design Pattern** in Java. The pattern defines an interface for creating an object, but allows subclasses to alter the type of objects that will be created.

## 🏗️ Project Structure

```bash
├── Document.java 
├── DocumentFactory.java
├── ExcelDocument.java 
├── ExcelFactory.java
├── PDFDocument.java
├── PDFFactory.java
├── WordDocument.java
├── WordFactory.java
├── Main.java 
```

## 🧠 Design Pattern: Factory Method

The Factory Method Pattern promotes **loose coupling** by delegating the object instantiation to factory classes. It is particularly useful when the exact types of objects to create are determined at runtime.

### ➕ Benefits
- Encapsulates object creation.
- Promotes open/closed principle.
- Simplifies code maintenance and extension.


## 🧪 Sample Output

```text
Opening Word Document.
Opening PDF Document.
Opening Excel Document.
```
