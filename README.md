Java's Date and Time API (java.time package):
1. Calculate the Age Based on Birthdate
Write a Java program that takes a birthdate as input in the format yyyy-MM-dd and calculates the current age of the person using the LocalDate class.
Example:
Input: 1990-06-15
Output: 34 (assuming current year is 2024)
Hint: Use Period.between() method to find the difference in years between the birthdate and the current date.
2. Find Day of the Week for a Given Date
Write a program that prompts the user to input a date in the format yyyy-MM-dd and outputs the day of the week for that date.
Example:
Input: 2023-10-08
Output: Sunday
Hint: Use LocalDate.getDayOfWeek() to get the day.
3. Time Difference Between Two Time Zones
Write a program to calculate the time difference between two cities. The program should prompt the user to input the city names (e.g., "Asia/Kolkata" and "Europe/London") and calculate the time difference in hours.
Hint: Use ZoneId and ZonedDateTime to get the current time for each city and find the difference using Duration.between().
4. Add and Subtract Time
Write a Java program that takes a date and time as input and adds or subtracts a given number of days, months, and hours. Use LocalDateTime for the operations.
Example:
Input: 2024-01-01T10:00, days to add: 5, months to subtract: 1, hours to add: 12
Output: 2023-12-06T22:00
Hint: Use plusDays(), minusMonths(), and plusHours() methods from LocalDateTime.
5. Find the Number of Days Between Two Dates
Write a program that prompts the user to input two dates in the format yyyy-MM-dd and finds the number of days between them.
Example:
Input: 2024-01-01, 2024-12-31
Output: 365
Hint: Use ChronoUnit.DAYS.between() to calculate the number of days between two LocalDate objects.
6. Check if a Year is a Leap Year
Write a program that takes a year as input and checks if it is a leap year.
Example:
Input: 2024
Output: true (since 2024 is a leap year)
Hint: Use Year.isLeap() from java.time.Year.
7. Format Current Date and Time in Custom Format
Write a program that outputs the current date and time in the format: "dd-MM-yyyy HH:mm:ss".
Hint: Use DateTimeFormatter to format LocalDateTime as per the required pattern.
8. Convert String to Date and Back to String in Different Format
Write a program that takes a date string in the format yyyy/MM/dd and converts it into the format dd-MM-yyyy.
Example:
Input: 2024/01/01
Output: 01-01-2024
Hint: Use DateTimeFormatter to parse and format the date string.
9. Schedule Event at Fixed Interval
Write a program that simulates scheduling an event at a fixed interval, for example, every second Monday of the month at 10 AM for the next 6 months. Print the dates and times of the events.
Hint: Use TemporalAdjusters to find the second Monday of the month and LocalTime.of() to set the time.
10. Calculate Duration Between Two Time Instants
Write a program that calculates the exact duration (in hours, minutes, and seconds) between two LocalDateTime inputs.
Example:
Input: 2024-01-01T08:00 and 2024-01-01T20:45
Output: 12 hours, 45 minutes, 0 seconds
Hint: Use Duration.between() to calculate the duration and break it down into hours, minutes, and seconds.
These questions cover key aspects of the Date and Time API such as LocalDate, LocalDateTime, ZonedDateTime, and Period/Duration
 
 
Arrays Practice Questions
 
array-based coding questions designed to help you practice for HackerRank assessments:
1. Sum of Elements in an Array
Write a function that takes an array of integers and returns the sum of its elements.
Example:
Input: [1, 2, 3, 4, 5]
Output: 15
Hint: Iterate through the array and add each element to a sum variable.
2. Find the Maximum Element
Write a function that finds the maximum value in a given array of integers.
Example:
Input: [5, 2, 8, 1, 9]
Output: 9
Hint: Use a loop to compare each element to a max variable.
3. Reverse an Array
Write a function that reverses the elements of an array.
Example:
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
Hint: Swap elements from the start and end of the array, moving toward the center.
4. Rotate an Array by K Positions
Write a function that rotates an array by k positions to the right. If k = 3, the last 3 elements of the array move to the beginning.
Example:
Input: [1, 2, 3, 4, 5], k = 2
Output: [4, 5, 1, 2, 3]
Hint: Use a combination of array slicing and concatenation or handle rotation in-place using modular arithmetic.
5. Find the Second Largest Element
Write a function that finds the second largest element in an array of integers.
Example:
Input: [1, 4, 2, 7, 5]
Output: 5
Hint: Traverse the array while keeping track of the largest and second-largest values.
6. Check if Array is Sorted
Write a function that checks if an array is sorted in ascending order.
Example:
Input: [1, 2, 3, 4, 5]
Output: true
Input: [1, 3, 2, 4, 5]
Output: false
Hint: Compare each element with the next one to see if they are in increasing order.
7. Find the Frequency of Elements
Write a function that counts the frequency of each element in an array.
Example:
Input: [2, 3, 2, 1, 4, 2]
Output: {2: 3, 3: 1, 1: 1, 4: 1}
Hint: Use a HashMap to store each element and its frequency.
8. Merge Two Sorted Arrays
Write a function that merges two sorted arrays into a single sorted array.
Example:
Input: [1, 3, 5] and [2, 4, 6]
Output: [1, 2, 3, 4, 5, 6]
Hint: Use two pointers to traverse both arrays and add smaller elements to the result.
9. Find the Missing Number in a Series
You are given an array containing n-1 integers in the range from 1 to n. There are no duplicates in the array. One number is missing. Find the missing number.
Example:
Input: [1, 2, 4, 5]
Output: 3
Hint: Calculate the sum of integers from 1 to n and subtract the sum of the array elements.
10. Find the Subarray with Maximum Sum (Kadane's Algorithm)
Write a function that finds the subarray with the maximum sum from an array of integers (can contain both positive and negative numbers).
Example:
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6 (subarray [4, -1, 2, 1] has the largest sum)
Hint: Use Kadane's Algorithm to find the maximum sum efficiently.
11. Find the Common Elements in Two Arrays
Write a function to find the common elements between two arrays.
Example:
Input: [1, 2, 3, 4] and [3, 4, 5, 6]
Output: [3, 4]
Hint: Use a HashSet to store elements from one array and check against the other array.
12. Find the Majority Element
A majority element is an element that appears more than n/2 times in an array of size n. Write a function to find the majority element. If no such element exists, return -1.
Example:
Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
Output: 4
Hint: Use Moore's Voting Algorithm or a HashMap to track frequencies.
13. Find the Longest Consecutive Sequence
Given an unsorted array of integers, find the length of the longest consecutive sequence of elements.
Example:
Input: [100, 4, 200, 1, 3, 2]
Output: 4 (sequence [1, 2, 3, 4])
Hint: Use a HashSet for constant-time lookups.
14. Product of Array Except Self
Write a function that returns a new array where each element at index i is the product of all the numbers in the original array except the one at i. You should solve it without using division and in O(n) time.
Example:
Input: [1, 2, 3, 4]
Output: [24, 12, 8, 6]
Hint: Use two passes over the array: one to calculate the prefix product and one for the suffix product.
These questions will help you get comfortable with arrays, including handling edge cases, optimizing time complexity, and solving practical problems frequently asked in coding assessments.
 
 
string manipulation coding questions that will help you practice key concepts for platforms like HackerRank:
1. String Compression
Write a function that compresses a string such that consecutive occurrences of the same character are replaced by the character followed by the count of repetitions.
Example:
Input: "aabcccccaaa"
Output: "a2b1c5a3"
2. Anagram Check
Given two strings, determine if they are anagrams of each other. Two strings are anagrams if they use the same characters in the same frequency, but possibly in a different order.
Example:
Input: "listen", "silent"
Output: true
3. Palindrome Check
Write a function to check if a given string is a palindrome (a word that reads the same forward and backward).
Example:
Input: "madam"
Output: true
4. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.
Example:
Input: "abcabcbb"
Output: 3 (Substring: "abc")
5. Character Frequency Count
Count the frequency of each character in a string.
Example:
Input: "programming"
Output: {p:1, r:2, o:1, g:2, a:1, m:2, i:1, n:1}
6. String Rotation
Check if one string is a rotation of another string.
Example:
Input: "waterbottle", "erbottlewat"
Output: true
7. Reverse Words in a String
Write a function that reverses the words in a given sentence without changing the order of the words.
Example:
Input: "I love programming"
Output: "programming love I"
8. Remove Duplicates
Remove all duplicate characters from a string, preserving the order of first occurrence.
Example:
Input: "banana"
Output: "ban"
 
 
1. Find All Substrings
Write a function to find all possible substrings of a given string.
Example:
Input: "abc"
Output: ["a", "b", "c", "ab", "bc", "abc"]
2. String Permutations
Given a string, generate all possible permutations of the characters in the string.
Example:
Input: "abc"
Output: ["abc", "acb", "bac", "bca", "cab", "cba"]
3. First Unique Character in a String
Write a function that finds the first non-repeating character in a string.
Example:
Input: "loveleetcode"
Output: "v"
4. Count and Say Sequence
Write a function that returns the n-th term in the "count-and-say" sequence. The sequence is defined as follows: starting with "1", each subsequent term describes the previous term.
Example:
Input: 4
Output: "1211" (The sequence goes: "1", "11", "21", "1211", ...)
5. Check if String is a Rotation of Another
Given two strings, check if one is a rotation of the other using only one call to a string function.
Example:
Input: "abcde", "cdeab"
Output: true
6. Valid Parentheses
Write a function to determine if a given string of parentheses is valid. A valid string must have matching pairs of opening and closing parentheses.
Example:
Input: "()[]{}"
Output: true
7. Longest Palindromic Substring
Write a function to find the longest palindromic substring in a given string.
Example:
Input: "babad"
Output: "bab" or "aba"
8. Minimum Window Substring
Given two strings, S and T, write a function that finds the minimum window in S which will contain all the characters in T.
Example:
Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
9. Check if String is a Subsequence
Given two strings, check if the first string is a subsequence of the second one.
Example:
Input: "abc", "ahbgdc"
Output: true
10. Word Break Problem
Given a string and a dictionary of words, determine if the string can be segmented into a space-separated sequence of dictionary words.
Example:
Input: "applepenapple", ["apple", "pen"]
Output: true
These questions cover various aspects of string manipulation, such as substring generation, permutations, rotations, and complex problems like the word break and longest palindromic substring.




##########################################################################################################################################################################################################################################################################################################################################################

Here are ten intermediate-level Java exercises focusing on inheritance. These exercises cover key inheritance concepts like method overriding, polymorphism, access modifiers, constructors, and more.


---

1. Bank Account Management System

Create a base class BankAccount with attributes like accountNumber and balance, and methods for deposit and withdraw.

Then, create subclasses SavingsAccount and CheckingAccount that inherit from BankAccount. Add unique features:

SavingsAccount: a method for adding interest.

CheckingAccount: a limit for overdraft.


Test each subclass's methods and check balance updates.


---
2. Shape Area Calculator

Create an abstract class Shape with an abstract method calculateArea().

Then, create subclasses Circle, Rectangle, and Triangle, each implementing calculateArea() based on their specific formulas. Add necessary attributes (e.g., radius for Circle, length and width for Rectangle).

Write a main method to calculate and display the area of different shapes.


---

3. Employee Management System

Create a base class Employee with attributes like name, id, and salary.

Create subclasses Manager and Developer, both inheriting from Employee. Add specific methods:

Manager: a method to conductMeeting.

Developer: a method to writeCode.


Override the toString() method in each class to print out employee details. Instantiate objects to demonstrate each subclass’s unique behaviors.


---

4. Library Management System

Create a base class Book with attributes like title and author. Add methods like borrowBook and returnBook.

Create subclasses Ebook and Paperback, each with a unique feature:

Ebook: a method to download.

Paperback: a method to markAsDamaged.


Demonstrate polymorphism by calling borrowBook and returnBook methods on both types of books.


---
5. Vehicle Inheritance Hierarchy

Define a base class Vehicle with attributes like speed and fuelCapacity and methods like startEngine and stopEngine.

Create subclasses Car and Bike, each with a unique behavior:

Car: a method to playRadio.

Bike: a method to doWheelie.


Use polymorphism to call methods and display the properties of each vehicle.


---
6. School System

Define a base class Person with common attributes such as name and age. Add a method getInfo() to display basic information.

Create subclasses Student and Teacher. Add specific attributes:

Student: gradeLevel, enrollInCourse().

Teacher: subject, teachCourse().


Instantiate objects of both subclasses and display their unique properties and behaviors.


---
7. Animal Sound Simulator

Create an abstract class Animal with an abstract method makeSound().

Then, create subclasses Dog, Cat, and Cow, each implementing makeSound() differently.

Create a method testAnimalSound() that takes an Animal object as a parameter and calls makeSound(). Test this method with different subclasses.


---

8. Library Membership

Create a base class Member with attributes like memberID, name, and borrowedBooks.

Create subclasses StudentMember and TeacherMember, each with unique rules:

StudentMember: maximum of 3 borrowed books.

TeacherMember: maximum of 5 borrowed books.


Add a method borrowBook() in each subclass to enforce borrowing limits.
 
