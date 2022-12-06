// - 이진수 0 제거
// - 제거된 0 개수 카운트
// - 길이를 이진수로 변환
// - 변환 수 += 1

function eraseZero({binary}){
    const erased = binary.split('').filter(letter => letter === '1').join('')
    const erasedCount = binary.length - erased.length
    return {erased, erasedCount}
}

function lengthToBinary({length}){
    const binary = length.toString(2)
    return {binary}
}

function solution(string){
    let convertCount = 0
    let erasedZero = 0

    while(string !== '1'){
        const {erased, erasedCount} = eraseZero({binary: string})
        const {binary} = lengthToBinary({length: erased.length})

        erasedZero += erasedCount
        string = binary
        convertCount += 1
    }

    return [convertCount, erasedZero]
}


test('solution', () => {
    expect(solution('110010101001')).toEqual([3,8])
    expect(solution('01110')).toEqual([3,3])
    expect(solution('1111111')).toEqual([4,1])
})

test('eraseZero', () => {
    expect(eraseZero({binary: '110010101001'})).toEqual({erased: '111111', erasedCount: 6})
    expect(eraseZero({binary: '01110'})).toEqual({erased: '111', erasedCount: 2})
    expect(eraseZero({binary: '111111'})).toEqual({erased: '111111', erasedCount: 0})
})

test('lengthToBinary', () => {
    expect(lengthToBinary({length: 6})).toEqual({binary: '110'})
    expect(lengthToBinary({length: 3})).toEqual({binary: '11'})
    expect(lengthToBinary({length: 4})).toEqual({binary: '100'})
})

