---
name: "\U0001F4A1How to solve it?"
about: 문제를 풀기 전에 어떻게 먼저 풀 것인지 생각을 정리하고, 다풀고나서 반성한다.
title: ''
labels: ''
assignees: ''

---

[참고가이드](https://megaptera.notion.site/6-5f9b4105eb0748fd8f8baa631d92d6ea)

### 1. 이해
- avaliability 칼럼 추가 10월 16일날 대여가 가능 -> 대여가능, 불가 -> 불가

group by
컬럼 그룹화
SELECT 컬럼 FROM 테이블 GROUP BY 그룹화할 컬럼;

조건 처리 후 그룹화
SELECT 컬럼 FROM 테이블 WHERE 조건식 GROUP BY 그룹화할 컬럼;

그룹화 후 조건 처리
SELECT 컬럼 FROM 테이블 GROUP BY 그룹화할 컬럼 HAVING 조건식;

조건 처리 후 그룹화 후 조건 처리
SELECT 컬럼 FROM 테이블 WHERE 조건식 GROUP BY 그룹화할 컬럼 HAVING 조건식;

ORDER BY가 존재하는 경우
SELECT 컬럼 FROM 테이블 [WHERE 조건식]
GROUP BY 그룹화할 컬럼 [HAVING 조건식] ORDER BY 컬럼1 [, 컬럼2, 컬럼3 ...];

칼럼 추가
ALTER TABLE board ADD board_type varchar(100) NOT NULL; -> 맨뒤에 추가

ALTER TABLE employee ADD working_day varchar(200) NOT NULL FIRST; -> 맨앞에 추가

ALTER TABLE employee ADD 'name' varchar(200) NOT NULL AFTER working_day -> 원하는 컬럼 뒤에 추가

if

집계함수
sum
avg
count
group by


### 2. 계획
- 

### 3. 실행
- 

### 4. 반성
- 집계함수를 사용할 때는 무조건 group by를 같이 붙여주어야 한다.
