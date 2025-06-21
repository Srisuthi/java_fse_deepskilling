# 💸 Exercise 7: Financial Forecasting

This exercise demonstrates how to use **recursive algorithms** in Java to forecast future financial values based on past data and a constant growth rate. It also includes an **optimized version** using memoization to avoid redundant computations.

---

## 📚 Scenario

You're building a **financial forecasting tool** that predicts future investment values given an initial amount, annual growth rate, and number of years into the future. The forecasting algorithm uses recursion for calculation.

---

## ✅ Steps Completed

### 1. Understand Recursive Algorithms

Recursion is a technique where a function calls itself to solve smaller instances of a problem. It simplifies problems like calculating compounded values over time.

### 2. Setup

A method is created to calculate future investment value using:
- `presentValue` — the initial amount
- `growthRate` — annual growth rate (as a decimal, e.g., 0.08 for 8%)
- `years` — the number of years for forecasting

### 3. Implementation

Two forecasting methods are implemented:
- `calculateFutureValue()` — basic recursive implementation
- `calculateFutureValueMemo()` — optimized using **memoization** (caching)

### 4. Analysis

#### ⌛ Time Complexity

| Method                   | Time Complexity | Space Complexity |
|--------------------------|------------------|------------------|
| Basic Recursive          | O(n)             | O(n) (call stack)|
| Memoized Recursive       | O(n)             | O(n) (memo array)|

Memoization avoids recomputation by storing results, making the solution efficient.

---

## ✅ Sample Output

```text
Future value after 5 years using Recursion: Rs. 14693.28
Future Value after 5 years using memo : Rs. 14693.28
```
Inputs used:

Principal = 10000

Rate = 8% (0.08)

Years = 5

