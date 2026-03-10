
# 📊 Sorting Algorithm Performance Analyzer

A high-performance web application designed to benchmark, analyze, and visualize the efficiency of various sorting algorithms under diverse data conditions.

---

## 🚀 Project Overview
The **Sorting Algorithm Performance Analyzer** bridges the gap between theoretical Big O notation and real-world execution. Built with a **Java Spring Boot** backend, it measures how different algorithms react to scaling data sizes and initial ordering (Random, Sorted, and Reversed).

### ✨ Key Features
* **Multi-Algorithm Comparison:** Run benchmarks for Bubble, Selection, Insertion, Merge, and Quick Sort simultaneously.
* **Dynamic Data Scenarios:** Test against Random, Ascending, and Descending datasets to observe Best, Average, and Worst-case behaviors.
* **Scalable Testing:** Supports array sizes ranging from **1,000 to 5,000+ elements**.
* **Responsive Web UI:** A clean, intuitive interface to trigger tests and view results instantly.

---

## 🛠️ Tech Stack

| Component | Technology |
| :--- | :--- |
| **Backend** | Java 17+, Spring Boot, Maven |
| **Frontend** | HTML5, CSS3, JavaScript (Fetch API) |
| **Tools** | Git, GitHub |

---

## 📈 Performance Comparison
The system analyzes the following time complexities:

| Algorithm | Best Case | Average Case | Worst Case |
| :--- | :--- | :--- | :--- |
| **Quick Sort** | $O(n \log n)$ | $O(n \log n)$ | $O(n^2)$ |
| **Merge Sort** | $O(n \log n)$ | $O(n \log n)$ | $O(n \log n)$ |
| **Insertion Sort** | $O(n)$ | $O(n^2)$ | $O(n^2)$ |
| **Selection Sort** | $O(n^2)$ | $O(n^2)$ | $O(n^2)$ |
| **Bubble Sort** | $O(n)$ | $O(n^2)$ | $O(n^2)$ |

---

## 📂 Project Structure
```text
src
├── main
│   ├── java
│   │   └── com.analyzer
│   │       ├── controller     # Web Endpoints
│   │       ├── service        # Logic & Benchmarking
│   │       ├── model          # Data Objects
│   │       └── algorithms     # Sorting Implementations
│   └── resources
│       └── templates          # Frontend (index.html)
└── test                       # Performance Unit Tests

```

---

## 🏃 Getting Started

### Prerequisites

* Java JDK 17 or higher
* Maven installed

### Installation & Setup

1. **Clone the repository**
```bash
git clone [https://github.com/dharmik-parkhiya09/SortingAlgorithmPerformanceAnalyzer.git](https://github.com/dharmik-parkhiya09/SortingAlgorithmPerformanceAnalyzer.git)

```


2. **Navigate to the directory**
```bash
cd SortingAlgorithmPerformanceAnalyzer

```


3. **Run the application**
```bash
mvn spring-boot:run

```


4. **View in Browser**
   Open [http://localhost:8080](https://www.google.com/search?q=http://localhost:8080)

---

## 👤 Author

**Dharmik Parkhiya**

* **GitHub:** [@dharmik-parkhiya09](https://github.com/dharmik-parkhiya09)
* **Project Role:** Backend Logic & Algorithm Implementation

---

*Note: The frontend interface was developed with assistance from Claude AI and integrated into the Java backend architecture.*

