// - 정렬
// - h인덱스인지 판별하는 함수
// - 원본 배열을 h인덱스의 참 거짓을 판별하는 배열로 변경한다. + 참인 요소들의 길이를 갯수를 반환한다. => reduce

function sort({citations}){
    return citations.sort((a,b) => b - a)
}

function validateHindex({citations, count}){
    return citations[count-1] >= count
}

function solution(citations){
    const sorted = sort({citations})

    return sorted
        .map((_, i) => validateHindex({citations:sorted, count: i + 1}))
        .filter(elem => elem)
        .length
}

test('validateHindex', () => {
    expect(validateHindex({citations: [6, 5, 3, 1, 0], count: 1})).toBe(true)
    expect(validateHindex({citations: [6, 5, 3, 1, 0], count: 2})).toBe(true)
    expect(validateHindex({citations: [6, 5, 3, 1, 0], count: 3})).toBe(true)
    expect(validateHindex({citations: [6, 5, 3, 1, 0], count: 4})).toBe(false)
    
    expect(validateHindex({citations: [4, 3, 2, 1], count: 1})).toBe(true)
    expect(validateHindex({citations: [4, 3, 2, 1], count: 2})).toBe(true)
    expect(validateHindex({citations: [4, 3, 2, 1], count: 3})).toBe(false)
})

test('sort', () => {
    expect(sort({citations: [3, 0, 6, 1, 5]})).toEqual([6, 5, 3, 1, 0])
    expect(sort({citations: [1, 2, 3, 4]})).toEqual([4, 3, 2, 1])
})

test('solution', () => {
    expect(solution([3, 0, 6, 1, 5])).toBe(3)
})