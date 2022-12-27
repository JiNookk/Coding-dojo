// 최대 공약수를 구하는 함수
// 최소 공배수를 구하는 함수

function gcd({number1, number2}){
    const min = Math.min(number1, number2)
    const max = Math.max(number1, number2)

    if(max % min === 0){
        return min
    }

    return gcd({number1: min, number2:max % min})
}

function lcm({number1, number2}){
    return number1 * number2 /  gcd({number1, number2})
}

function solution(arr){
    return arr.reduce((a, b) => lcm({number1:a, number2:b}))
}

test('gcd', () => {
    expect(gcd({number1: 648, number2: 232})).toBe(8)
    expect(gcd({number1: 14,number2: 8})).toBe(2)
})

test('lcm', () => {
    expect(lcm({number1: 648, number2: 232})).toBe(18792)
    expect(lcm({number1: 14,number2: 8})).toBe(56)
})

test('solution', () => {
    expect(solution([2, 6, 8, 14])).toBe(168)
    expect(solution([1, 2, 3])).toBe(6)
})