# JavaConstructorChaining

# Create README.md content for the ConstructorChainingDemo project

readme_content = """
# 🎫 ConstructorChainingDemo

This Java project demonstrates the concept of **constructor chaining** using a `Ticket` class and a `ConstructorChaining1` driver class.

## 📁 Files

### 1. `Ticket.java`
- Contains a class named `Ticket` with three instance variables:
  - `name` – the passenger's name
  - `destination` – travel destination
  - `seatType` – type of seat (e.g., General, Cabin)
- Demonstrates **constructor overloading and chaining**:
  - Default values are set by calling one constructor from another using the `this()` keyword.
- Includes an overridden `toString()` method for meaningful object representation.

### 2. `ConstructorChaining1.java`
- This is the **main class** that creates different `Ticket` objects using various constructors.
- Shows how the constructor chaining works in action.

## 🧠 Concepts Demonstrated

- ✅ Constructor Overloading
- ✅ Constructor Chaining using `this()`
- ✅ Encapsulation with private fields
- ✅ Overriding `toString()` method
- ✅ Clean and modular object initialization

## 💻 Sample Output

TrainTicket [name=Guest, destination=Not Specified, seatType=General]
TrainTicket [name=Chetan, destination=Not Specified, seatType=General]
TrainTicket [name=Satish, destination=Pune, seatType=General]
TrainTicket [name=Ishwar, destination=Mumbai, seatType=Cabin]



## 📦 How to Run

1. Compile the code:
   ```bash
   javac Ticket.java ConstructorChaining1.java

   Satish Karanjekar
This project is part of a learning exercise to understand OOP principles in Java.
  
