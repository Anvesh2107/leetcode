# 217. Contains Duplicate

**Easy** · Array, Hash Table, Sorting · [Open on LeetCode](https://leetcode.com/problems/contains-duplicate/)

| | |
| --- | --- |
| Language | Java |
| Runtime | 18 ms (beats 77.0%) |
| Memory | 108.5 MB (beats 23.2%) |
| Time to solve | 7 min |
| Solved | 2026-09-20 |

## Notes

use hashSet, and use for loop nums if it contains

## Question

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

**Example 1:**

**Input:** nums = [1,2,3,1]

**Output:** true

**Explanation:**

The element 1 occurs at the indices 0 and 3.

**Example 2:**

**Input:** nums = [1,2,3,4]

**Output:** false

**Explanation:**

All elements are distinct.

**Example 3:**

**Input:** nums = [1,1,1,3,3,4,3,2,4,2]

**Output:** true

**Constraints:**

	- `1 <= nums.length <= 10^5`

	- `-10^9 <= nums[i] <= 10^9`
