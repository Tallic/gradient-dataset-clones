# **Semantic Clone Detection Benchmark**  

## **Overview**  
This benchmark is designed to evaluate the performance of **clone detection tools**, particularly in identifying **semantic clones (Type-4 clones)** that exhibit **0% syntactic similarity**. It provides a structured dataset, evaluation framework, and metrics to assess various clone detection methods on both classical algorithms and real-world problems.  

## **Benchmark Details**  
- **Total Clone Classes:** 13  
- **Total Implementation Variants:** 108  
- **Total Candidate Pairs:** 5,778  
- **Clone Type Breakdown:**  
  - **Type-1 Clones:** Not included (exact duplicates).  
  - **Type-2 Clones:** Not included (minor syntactic changes).  
  - **Type-3 Clones:** Not included (near-miss clones).  
  - **Type-4 Clones (Semantic Clones):** 458 pairs (0% syntactic similarity up to certain random similarities).  

The dataset is **highly imbalanced**, with a **1:11.6 ratio** between semantic clones and non-clones, reflecting real-world detection challenges.  

## **Dataset Composition**  
The benchmark consists of two major sources of code samples:  

1. **Classical Algorithms:**  
   - **Factorial Function:** Iterative and recursive versions.  
   - **Fibonacci Sequence:** Different computation approaches.  
   - **Sorting Algorithms:** Variants including recursive and iterative implementations.  

2. **Google Code Jam Problems:**  
   - 10 complex problems sourced from **Google Code Jam 2017**, featuring different algorithmic implementations in a competitive programming context.  
   - Solutions exhibit **functional equivalence without syntactic similarity**, making them ideal for testing semantic clone detection.  

Each candidate pair is assigned one of the following labels:  
- **Clone (True Positive)** – Methods that exhibit semantic equivalence.  
- **Not a Clone (True Negative)** – Methods with differing functionality.  

## **Usage**  

1. Clone the repository:  
   ```bash
   git clone https://github.com/your-repo/semantic-clone-benchmark.git  
   cd semantic-clone-benchmark
   ```  
2. Run the benchmark with your clone detection tool.  
3. Compare results using provided evaluation scripts.  

## **Metrics for Evaluation**  
The benchmark uses standard **performance metrics** to assess clone detection tools:  
- **Precision** (ratio of correctly identified clones to all detected clones).  
- **Recall** (percentage of actual clones correctly detected).  
- **Matthews Correlation Coefficient (MCC)** (robust metric for imbalanced datasets).  

## **References**  
For detailed methodology and evaluation results, see:  
[Thaller et al., "Semantic Clone Detection via Probabilistic Software Modeling"](https://hannes-thaller/publications/Thaller2020c.pdf).  
