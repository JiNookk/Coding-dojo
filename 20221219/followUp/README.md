---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
- 규칙
  - 1번부터 순서대로 한사람씩 단어를 말한다.
  - 마지막 사람이 말하면 다시 1번부터 시작
  - 앞서말한 사람의 마지막 문자로 시작하는 단어를 말해야한다
  - 이전에 등장했던 단어 사용 불가
  - 한 글자인 단어 사용ㅂ ㅜㄹ가
- 구해야 하는 것 : 가장 먼저 탈락하는 사람의 번호, 몇번쨰 사이클에 탈락하는가
- 아무도 탈락하지 않으면 0,0리

### 2. 계획
- 틀린것을 validate -> 한글자인지, 이전에 등장했던 단어인지, 앞서 말한 단어의 마지막 문자인지
- 사람의 번호구하기
- 몇번째 사이클인지 구하기

### 3. 실행
- 

### 4. 반성
- 여러개의 유효성 검사가 필요할 때 한번에 진행하도록 합치면 좋을것 같다.