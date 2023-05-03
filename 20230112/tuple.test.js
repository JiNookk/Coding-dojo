//  튜플 원소를 글자 배열로 만드는 메서드
//  정렬
//  글자하나하나를 원소로 가지는 Set을 만든다. => 마지막에 한번에 숫자로 변환

function toLetters({element}){
    return element.split(',')
}

function sort({elements}){
    return elements.sort((a, b) => a.length - b.length)
}

function store({elements}){
    const set = new Set()

    elements.reduce((acc, curArray) => (
        [...acc, ...curArray]
    ),[])
    .map(element => +element)
    .forEach(element => set.add(element))

    return [...set]
}

function solution(s){
    const elements = s.substring(2, s.length-2).split('},{')
                .map(element => toLetters({element}))

    const sorted = sort({elements})
    
    const stored = store({elements: sorted})

    return stored
}

test('toLetters', () => {
    expect(toLetters({element:'2,1,3'})).toEqual(['2','1','3'])
    expect(toLetters({element:'20,111'})).toEqual(['20','111'])
    expect(toLetters({element:'123'})).toEqual(['123'])
})

test('sort', () => {
    expect(sort({elements:[['1','2','3'],['2','1'],['1','2','4','3'],['2']]})).toEqual([['2'],['2','1'],['1','2','3'],['1','2','4','3']])
})

test('store', () => {
    expect(store({elements:[['2'],['2','1'],['1','2','3'],['1','2','4','3']]})).toEqual([2,1,3,4])
})

test('solution', () => {
    expect(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")).toEqual([2, 1, 3, 4])
    expect(solution("{{20,111},{111}}")).toEqual([111, 20])
    expect(solution("{{123}}")).toEqual([123])
    expect(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")).toEqual([2, 1, 3, 4])
    expect(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")).toEqual([3, 2, 4, 1])
})