# **Alphabetizer**

## **Overview**

The **Alphabetizer** is a simple, efficient Java based command line utility that can alphabetize the characters of input
strings. The sorting is done alphabetically and case insensitive, however the output maintains the capitalization of the
input. Additionally, non alphabetic characters (digits, spaces, symbols) are not considered at all.

---

## **System Requirement**

- **Java Development Kit (JDK)** version 8 or higher

---

## **How to Compile and Run the application**

#### Step 1: Compile the Java Program

```sh
  javac Alphabetizer.java
```

#### Step 2: Run the Compiled Program

Note: Additional input string can be given separated with spaces.
After compilation, run the program using the following syntax:

```sh
  java Alphabetizer "Your Input String" ["Additional Input Strings"]
```

#### Example

```sh
  java Alphabetizer "VirginiaTech" "3 Blind Mice" "12345!"
```

#### Expected Output

```
aceghiiinrTV
BcdeiilMn
No alphabetic characters was found in provided input string/s: "1234!"

```

---