---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
- 정수로 이루어진 배열 numbers가 있습니다. 
- 배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.
  정수 배열 numbers가 매개변수로 주어질 때, 
- 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return 하도록 solution 함수를 완성해주세요. 
- 단, 뒷 큰수가 존재하지 않는 원소는 -1을 담습니다.

입출력 예 #1
2의 뒷 큰수는 3입니다. 
첫 번째 3의 뒷 큰수는 5입니다. 
두 번째 3 또한 마찬가지입니다. 
5는 뒷 큰수가 없으므로 -1입니다. 
위 수들을 차례대로 배열에 담으면 [3, 5, 5, -1]이 됩니다.

입출력 예 #2
9는 뒷 큰수가 없으므로 -1입니다. 
1의 뒷 큰수는 5이며, 5와 3의 뒷 큰수는 6입니다. 
6과 2는 뒷 큰수가 없으므로 -1입니다. 
위 수들을 차례대로 배열에 담으면 [-1, 5, 6, 6, -1, -1]이 됩니다.

### 2. 계획
- 스택 사용 -> 숫자를 넣으면서 가장 큰 값인지 판별한다.
- 경우 1 : 1 -> 2 -> 3 -> 당연히 걸러짐
- 경우 2 -> 3 -> 1 -> 4 -> 당연히 걸러짐

### 3. 실행
- 

### 4. 반성
- 어떤 플로우로 문제를 풀지 먼저 그려보자. 그 다음 어떤 기술을 쓸지 고민하는게 좋을 것 같다.
- stack과 새로 만든 객체를 이용해서 풀이를 진행했다.