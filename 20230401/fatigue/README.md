---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
예를 들어 "최소 필요 피로도"가 80, "소모 피로도"가 20인 던전을 탐험하기 위해서는 
유저의 현재 남은 피로도는 80 이상 이어야 하며, 던전을 탐험한 후에는 피로도 20이 소모됩니다.

이 게임에는 하루에 한 번씩 탐험할 수 있는 던전이 여러개 있는데, 한 유저가 오늘 이 던전들을 최대한 많이 탐험하려 합니다. 
유저의 현재 피로도 k와 각 던전별 "최소 필요 피로도", "소모 피로도"가 담긴 2차원 배열 dungeons 가 매개변수로 주어질 때, 
유저가 탐험할수 있는 최대 던전 수를 return 하도록 solution 함수를 완성해주세요.

k는 1 이상 5,000 이하인 자연수입니다. -> 피로도
dungeons의 세로(행) 길이(즉, 던전의 개수)는 1 이상 8 이하입니다.
dungeons의 가로(열) 길이는 2 입니다.
dungeons의 각 행은 각 던전의 ["최소 필요 피로도", "소모 피로도"] 입니다.
"최소 필요 피로도"는 항상 "소모 피로도"보다 크거나 같습니다.
"최소 필요 피로도"와 "소모 피로도"는 1 이상 1,000 이하인 자연수입니다.
서로 다른 던전의 ["최소 필요 피로도", "소모 피로도"]가 서로 같을 수 있습니다.

8 ^ 8 -> 2 ^ 24
어떻게 최소 필요 피로도 && 소모 피로도 둘다 충족시킬 수 있을까?

일단 완전 탐색이라고 치자.
던전이 8가지 -> 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 -> 8!
각각 요소를 이용해서 dfs를 이용

### 2. 계획
- 배열을 리스트로 변경
- dfs규칙 -> 리스트에서 하나씩 pop하고 다시 탐색 진행, 하지만 리스트의 모든 요소에 대해서 dfs를 진행해야 한다.
- 종료조건 : 길이가 1이 되면 종료 or 피로도를 전부 써버리면 종료 
- 주의할 것 : 만약 최소 피로조건을 넘기면 skip하는 로직도 고려해야한다.

### 3. 실행
- 

### 4. 반성
- 잘한점 : 풀이를 보지않고 규칙을 찾아서 dfs를 적용
- 앞으로도 탐색 문제가 나온다면 dfs규칙을 떠올려보자.
- 최대 경우의수를 고민해보고 500만이 넘지 않으면 dfs로 풀기
