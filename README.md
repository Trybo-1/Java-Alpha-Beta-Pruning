# Alpha-Beta Pruning

This project demonstrates the implementation of the **Alpha-Beta Pruning algorithm**, an optimization technique used with the **Minimax algorithm** in adversarial search problems.

The program explores a game tree and shows how alpha-beta pruning can significantly reduce the number of nodes that need to be evaluated while still producing the same optimal result as a standard minimax search.

---

## Overview

Alpha-Beta Pruning is a search algorithm commonly used in artificial intelligence for two-player games such as chess, tic-tac-toe, and checkers.

The algorithm improves the efficiency of the Minimax algorithm by **pruning branches of the search tree that cannot influence the final decision**. This allows the algorithm to search deeper levels of the game tree while using fewer computational resources. :contentReference[oaicite:1]{index=1}

Two values are maintained during the search:

- **Alpha (α)** – The best value that the maximizing player can guarantee so far.
- **Beta (β)** – The best value that the minimizing player can guarantee so far.

If at any point **β ≤ α**, the remaining nodes in that branch are skipped because they cannot affect the final outcome.

---

## Features

- Implementation of the **Alpha-Beta Pruning algorithm**
- Demonstrates **game tree search optimization**
- Recursive traversal of a decision tree
- Efficient pruning of unnecessary branches
- Educational implementation for learning AI search techniques

---

## How the Algorithm Works

1. Build a game tree representing all possible moves.
2. Evaluate terminal nodes using a utility function.
3. Propagate scores back up the tree using Minimax logic.
4. Maintain alpha and beta values during traversal.
5. Prune branches when they cannot influence the final decision.

This dramatically reduces the number of nodes evaluated compared to a naive minimax implementation.

---

## Project Structure
```
Alpha-Beta-Pruning
│
├── src/
│ ├── (algorithm implementation files)
│ └── (supporting classes)
│
├── run.bat
├── compile.bat
└── README.md
```
### Run

Run the provided batch scripts included in the repository.

## Applications

Alpha-Beta pruning is widely used in AI systems that involve decision making in adversarial environments, such as:

- Chess engines
- Tic-Tac-Toe AI
- Connect Four AI
- Strategy game bots

By reducing the number of evaluated nodes, the algorithm allows deeper searches and faster decision-making.

---

## Learning Objectives

This project demonstrates:

- Game tree search
- Recursive algorithms
- Artificial intelligence search optimization
- Decision making in adversarial environments

---

## Future Improvements

Possible extensions include:

- Adding a graphical game interface
- Implementing a full **Minimax + Alpha-Beta AI opponent**
- Performance comparisons with plain Minimax
- Visualization of the search tree

---

## Author

Developed by Nabeel Vally Omar

Computer Science Student  
Interested in Artificial Intelligence, Algorithms, and Software Development.

---
