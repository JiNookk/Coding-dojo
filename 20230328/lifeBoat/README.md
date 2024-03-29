---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해

무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 
구명보트는 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.

예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 
2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.

구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 
모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

탐욕법
- 현재 상황에서 최적값을 찾는다.

### 2. 계획
- 정렬을 한다.
- 가장 무거운 사람과 가장 가벼운 사람을 더한다.
- 무게제한과 비교를 한다. -> 초과일 경우 false, 이하일 경우 true
- true일 경우 맨앞, 맨뒤를 제거, false일 경우 맨뒤만 제거하는 함수를 만든다.
- 보트 카운트를 리턴한다.

### 3. 실행
- 

### 4. 반성
- 카피온 라이팅 방식을 이용해보려고 했지만, 효율성 테스트가 매우 나빠짐. 프로덕션 코드에서만 사용해보자. 
- subList를 통해서 새로운 리스트를 반환할 수 있다.
- subList자체가 원본에 영향을 주지 않으므로 불변성이 구현되어있는것 같다. 카피온 라이팅을 따로 적용할 필요는 없어보인다.
