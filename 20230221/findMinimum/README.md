---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
- 두 개의 배열을 받아와서 내적 값을 최소로 만들라.
- 가장 작은 수와 가장 큰 수를 곱하는 경우를 만들자 -> 정렬

### 2. 계획
- 정렬
- 내적

### 3. 실행
- 

### 4. 반성
- 배열 정렬 -> Arrays.sort를 이용하자. 안그러면 시간 초과 뜰 확률이 크다.
- Stream.sort를 이용 -> 배열 요소를 boxing할때 한번 순환, intvalue할 때 두번 순환 + 정렬하게 된다.
- 시간 효율성을 요구하는 문제는 무조건 Arrays.sort를 이용하자.
