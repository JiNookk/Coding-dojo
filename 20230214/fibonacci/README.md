---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
- 피보나치 규칙
- F(2) = F(0) + F(1) = 0 + 1 = 1
  F(3) = F(1) + F(2) = 1 + 1 = 2
  F(4) = F(2) + F(3) = 1 + 2 = 3
  F(5) = F(3) + F(4) = 2 + 3 = 5
- 주어진 것: n
- 구해야 하는것: n번째 피보나치 수를 1234567로 나눈 것 

### 2. 계획
- 피보나치 수를 구하는 메서드를 만든다. -> 0일때 0, 1일 때 1, 2부터는 이전거 + 이이전거

### 3. 실행
- 

### 4. 반성
- 자바에서 꼬리재귀는 매우매우 느리다. 쓰지 말자
- 피보나치 수가 45만 넘어가도 실행 속도가 현저히 낮아지는 것을 확인
- 언어에 맞는 특성을 찾아서 사용하자.
