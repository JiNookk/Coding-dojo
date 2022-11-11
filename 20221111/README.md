---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
- 동물보호소에 가장먼저 들어온 동물의 이름을 조회
- MAX(날짜)를 이용해도 되고 ROWNUM = 1 을 이용해서 풀어도 될 것 같다.

### 2. 계획
- SELECT NAME FROM animal_ins WHERE MIN(datetime)

### 3. 실행
- SELECT NAME FROM animal_ins ORDER BY datetime LIMIT 1;

### 4. 반성
- 위 두가지 방법을 이용해 봤는데 안되서 LIMIT을 사용했다. 어떻게 사용하는지 숙지하고 문제를 풀자.
