function toBinary({number}){
    return number.toString(2)
}

function count({binary}){
    return binary.split('').filter(number => number === '1').length
}

function findNextNumber({number}){
    length = count({binary: toBinary({number})})

    let nextNumber = number + 1

    while(length !== count({binary: toBinary({number: nextNumber})})){
        nextNumber += 1
    }

    return nextNumber
}

test('toBinary', ()=> {
    expect(toBinary({number: 15})).toBe('1111')
    expect(toBinary({number: 78})).toBe('1001110')
    expect(toBinary({number: 2})).toBe('10')
})

test('count', ()=> {
    expect(count({binary: '1111'})).toBe(4)
    expect(count({binary: '101'})).toBe(2)
    expect(count({binary: '1110011'})).toBe(5)
})

test('findNextNumber', ()=> {
    expect(findNextNumber({number: 15})).toBe(23)
    expect(findNextNumber({number: 5})).toBe(6)
    expect(findNextNumber({number: 30})).toBe(39)
})

// - 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다. 
// - 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
// - 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
