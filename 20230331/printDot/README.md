---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
좌표평면을 좋아하는 진수는 x축과 y축이 직교하는 2차원 좌표평면에 점을 찍으면서 놀고 있습니다. 
진수는 두 양의 정수 k, d가 주어질 때 다음과 같이 점을 찍으려 합니다.

원점(0, 0)으로부터 x축 방향으로 a*k(a = 0, 1, 2, 3 ...), y축 방향으로 b*k(b = 0, 1, 2, 3 ...)만큼 떨어진 위치에 점을 찍습니다.

원점과 거리가 d를 넘는 위치에는 점을 찍지 않습니다.

예를 들어, k가 2, d가 4인 경우에는 (0, 0), (0, 2), (0, 4), (2, 0), (2, 2), (4, 0) 위치에 점을 찍어 총 6개의 점을 찍습니다.

정수 k와 원점과의 거리를 나타내는 정수 d가 주어졌을 때, 점이 총 몇 개 찍히는지 return 하는 solution 함수를 완성하세요.

d -> 반지름

x^2 + y^2 <= d^2 -> 만족시켜야 한다.
일단 d x d 정사각형을 그려서 만족하는것들을 전부 리턴해보자.

### 2. 계획
- 거리를 만족시키는 최댓값 a == b를 찾는다.
- 원의 방정식 내부를 만족하는 값을 찾는다.
- for문으로 돌린다. (정사각형)

### 3. 실행
- 

### 4. 반성
-
