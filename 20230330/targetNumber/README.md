---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
n개의 음이 아닌 정수들이 있습니다. 
이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 
예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 
숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

dfs
어떻게 경우를 나눌 것인가?
배열의 n번째 숫자가 +일 때
배열의 n번째 숫자가 -일 때

종료조건
dfs의 레벨이 배열의 길이일 때 
만약 target과 값이 같다면? -> count + 1
target과 값이 다르다면? -> 그냥 return

### 2. 계획
- 

### 3. 실행
- 

### 4. 반성
- dfs문제는 적극적으로 멤버변수를 활용하도록 하자.
- 메서드의 인자로 많은것들을 전달하려니 오히려 더 복잡해졌다.
- 리턴타입은 void로 정하는게 문제를 풀 때 더 편한 것 같다.