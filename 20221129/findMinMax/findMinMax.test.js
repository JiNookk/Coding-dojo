function toNumberArray(string){
    return string.split(' ').map(letter => +letter)
}

function findMinMax(array){
    const minMax = {
        min: Math.min(...array),
        max: Math.max(...array)
    }
    return minMax
}

function solution(string){
    const numberArray = toNumberArray(string)
    const minMax = findMinMax(numberArray)

    return minMax.min + ' ' + minMax.max
}

test('toNumberArray', () => {
    expect(toNumberArray('1 2 3 4')).toEqual([1, 2, 3, 4])
    expect(toNumberArray('-1 -2 -3 -4')).toEqual([-1, -2, -3, -4])
    expect(toNumberArray('-1 -1')).toEqual([-1, -1])
})

test('findMinMax', () => {
    expect(findMinMax([1, 2, 3, 4])).toEqual({min: 1, max: 4})
    expect(findMinMax([-1, -2, -3, -4])).toEqual({min: -4, max: -1})
    expect(findMinMax([-1, -1])).toEqual({min: -1, max: -1})
})

test('solution', () => {
    expect(solution('1 2 3 4')).toBe('1 4')
    expect(solution('-1 -2 -3 -4')).toBe('-4 -1')
    expect(solution('-1 -1')).toBe('-1 -1')
})