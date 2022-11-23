---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
- 두 번 이상 사용된 동물들의 이름과 횟수 조회
- 결과는 이름순으로 조회

### 2. 계획
- SELECT NAME, COUNT(NAME) FROM 테이블 group by NAME HAVING COUNT(NAME) > 2
    
### 3. 실행
- 

### 4. 반성
- 칼럼 이름을 AS ~로 변경할 수 있다.
