# Copilot Instructions for DSA Repository

## Project Overview
This is a **Java-based Data Structures & Algorithms learning repository** organized by algorithm categories. Each folder contains LeetCode-style problem implementations using fundamental CS techniques (Two Pointers, Binary Search, Graphs, etc.).

## Codebase Structure

**Organization**: Topic-based folders map to algorithm categories:
- `Arrays/` - Array manipulation, hashing, prefix/suffix operations
- `LinkedList/` - Node-based structures (LRUCache, merge operations)
- `Graphs/` - Graph representations (adjacency list/matrix, DFS)
- `Trees/` - Tree algorithms (diameter, traversals)
- `BinarySearch/` - Search optimization techniques
- `Stack/` - Stack-based problems (monotonic patterns, expression evaluation)
- `slidingwindow/` - Two-pointer window techniques
- `twopointer/` - Pointer manipulation (longest substring, 3sum)
- `Math/` - Numerical algorithms (power, reverse operations)

Root-level files (`Main.java`, `Solution.java`) contain utility implementations or contest problem solutions.

## Code Patterns & Conventions

### Solution Structure
- **Class naming**: Each file contains a `Solution` class with a single public method implementing the algorithm
- **Method signatures**: Follow LeetCode conventions (e.g., `twoSum(int[] nums, int target)`)
- **No defensive checks**: Code assumes valid inputs; no null/boundary validation present
- **Inline comments**: Brief explanations describe key algorithm steps (see `longeststring.java` for sliding window example)

### Common Data Structure Usage
- **HashMaps for lookups**: Used extensively for O(1) access (see `TwoSum.java`, `LRUCache.java`)
- **Sets for membership**: HashSet used to track seen elements (e.g., sliding window substring tracking)
- **Custom Node classes**: Doubly-linked nodes for advanced structures (see `LRUCache.java` with head/tail sentinels)
- **Graph representations**: Adjacency lists (`ArrayList[]`) for undirected/directed graphs (see `Dfs.java`)

### Algorithm Categories
1. **Sliding Window**: Fixed/dynamic windows with HashSet/HashMap (see `besttimetobuyandsell.java`)
2. **Two Pointers**: Convergent pointers from ends or same direction (see `3sum.java`, `maxwater.java`)
3. **Graph Traversal**: Stack-based DFS with visited arrays (see `Dfs.java`)
4. **Binary Search**: Logarithmic search on sorted data (see `BinarySearch/`)
5. **Stack-based**: Monotonic stacks for nearest element problems (see `Stack/Nearestsmallest.java`)

## Running & Testing

- **Compilation**: Standard `javac` on individual files
- **Execution**: Classes typically use `Scanner` for input or have `main()` methods for testing
- **Example**: `javac Solution.java && java Solution` (input via stdin)

## Adding New Problems

1. Create file in appropriate category folder using PascalCase naming
2. Implement `Solution` class with LeetCode method signature
3. Add inline comments explaining the algorithm approach
4. Use established patterns (HashMap for lookups, HashSet for membership tests)

## Key Files to Reference

- [longeststring.java](twopointer/longeststring.java) - Clean sliding window pattern example
- [TwoSum.java](Arrays/TwoSum.java) - HashMap lookup pattern
- [LRUCache.java](LinkedList/LRUCache.java) - Complex data structure with doubly-linked list
- [Dfs.java](Graphs/Dfs.java) - Graph traversal with adjacency list
