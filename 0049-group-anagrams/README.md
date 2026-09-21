# 49. Group Anagrams

**Medium** · Array, Hash Table, String, Sorting · [Open on LeetCode](https://leetcode.com/problems/group-anagrams/)

| | |
| --- | --- |
| Language | Java |
| Runtime | 14 ms (beats 24.6%) |
| Memory | 51.1 MB (beats 6.8%) |
| Solved | 2026-09-21 |

## Question

Given an array of strings `strs`, group the anagrams together. You can return the answer in **any order**.

**Example 1:**

**Input:** strs = ["eat","tea","tan","ate","nat","bat"]

**Output:** [["bat"],["nat","tan"],["ate","eat","tea"]]

**Explanation:**

	- There is no string in strs that can be rearranged to form `"bat"`.

	- The strings `"nat"` and `"tan"` are anagrams as they can be rearranged to form each other.

	- The strings `"ate"`, `"eat"`, and `"tea"` are anagrams as they can be rearranged to form each other.

**Example 2:**

**Input:** strs = [""]

**Output:** [[""]]

**Example 3:**

**Input:** strs = ["a"]

**Output:** [["a"]]

**Constraints:**

	- `1 <= strs.length <= 10^4`

	- `0 <= strs[i].length <= 100`

	- `strs[i]` consists of lowercase English letters.
