---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
- n : 체스판의 길이, 퀸의개수
- 퀸이 서로 공격할 수 없도록 하는 경우의 수 반환
- n은 12까지

### 2. 계획
- 체스말이라는 객체를 만든다.
- 체스말은 좌표를 가진다.
- 퀸이 갈수 있는 좌표는 불리언으로 좌표를 반환하는 로직
- 갈 수 없는 좌표를 건너뛰고 그다음 가능한 좌표에서 다음 퀸이 놓인다.

### 3. 실행
- 

### 4. 반성
-

0 1 0 0 0
0 0 0 1 0
1 0 0 0 0    2 + 
0 0 0 0 1
0 1 0 0 0

