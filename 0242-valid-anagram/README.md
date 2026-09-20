# 242. Valid Anagram

**Easy** · Hash Table, String, Sorting · [Open on LeetCode](https://leetcode.com/problems/valid-anagram/)

| | |
| --- | --- |
| Language | Java |
| Runtime | 5 ms (beats 63.1%) |
| Memory | 44.4 MB (beats 65.9%) |
| Time to solve | 188 min |
| Solved | 2026-09-20 |

## Notes

first check the both length of the string and return false if its does  match
next create integer array and then loop the string then check increment one ascii value and decrement other and then check if the all the values in the array are zero if nit return faalse

## Question

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

**Example 1:**

**Input:** s = "anagram", t = "nagaram"

**Output:** true

**Example 2:**

**Input:** s = "rat", t = "car"

**Output:** false

**Constraints:**

	- `1 <= s.length, t.length <= 5 * 10^4`

	- `s` and `t` consist of lowercase English letters.

**Follow up:** What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
