// 인자의 범위를 구하는 함수
// 인자를 구하는 함수 -> 1, 1, 2 or 2, 2
// 인자가 주어지면 다른 배열을 구성할 수 있는 경우의 수를 구해야 한다. -> 1, 1, 2 or 2, 1, 1 

function factorial({number, acc = number}){
    if(number === 1){
        return acc
    }
    
    return factorial({number: number - 1, acc : acc * (number - 1) })
}

function permutation({numbers}){
    const countOne = numbers.filter(number => number === 1).length
    const countTwo = numbers.filter(number => number === 2).length

    return factorial({number: numbers.length}) / (factorial({number: countOne}) * factorial({number: countTwo}))
}

test('', () => {
    expect()
})

test('permutation', () => {
    expect(permutation({numbers : [1, 1, 2]})).toBe(3)
    expect(permutation({numbers : [1, 2]})).toBe(2)
})

test('factorial', () => {
    expect(factorial({number : 3})).toBe(6)
    expect(factorial({number : 4})).toBe(24)
    expect(factorial({number : 5})).toBe(120)
})

test('solution', () => {
    expect(solution(4)).toBe(5)
    expect(solution(3)).toBe(3)
})