# Date Class Project in Java

📖 **Overview**
This project implements a custom `Date` class in Java that models calendar dates and supports:

* Date validation, including leap year checks
* Updating date values
* Retrieving the day of the week (e.g., Monday)
* Calculating the difference in days between two dates
* Printing dates in a human-readable format
* Sorting dates via `Comparable<Date>`

🚀 **How to compile and run**

1. Save the code files (`Date.java` and `Main.java`) in the same folder.
2. Open a terminal or command prompt.
3. Navigate to the directory containing these files.
4. Compile the code:

```
javac Date.java Main.java
```

5. Run the program:

```
java Main
```

📝 **Notes and Issues**

* Leap year logic and special cases like February 29 require precise validation.
* The constructor throws exceptions on invalid dates, ensuring robust error handling.
* Java's `java.time.LocalDate` is used internally for date calculations such as day of the week and difference in days.
* Sorting is done via the `Comparable` interface, allowing `Collections.sort()` to order dates chronologically.

---

Author: Adel Azhieva

**Screenshots**


