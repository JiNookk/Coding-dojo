//  사이즈를 구한다.
//  좌표를 넣으면 해당 칸의 값을 반환하는 함수를 만든다.
//  모든 좌표를 돌때까지 반복한다.

// 사이즈를 구한 뒤 좌표를 돌린다.
function getResult({matrix1, matrix2, x = 1, y = 1, result = []}){
    const { row } = matrixSize({ matrix : matrix1 })
    const { column } = matrixSize({ matrix : matrix2 })
    const size = { row, column }
    
    if(y > size){
        x += 1;
        y = 1
    }
    
    console.log('y' + y)
    // 인덱스 하나씩 증가시켜가면서 전달해주는 인자가 size와 같아지면 리턴!
    if(x === row && y >= column){
        console.log(result)
        return result;
    }


    result.push(dotProduct({matrix1, matrix2, row:x, column: y}))

    return getResult({matrix1, matrix2, x : x, y : y + 1, result})
}


function matrixSize({matrix}){
    return {row: matrix.length, column:matrix[0].length}
}

function dotProduct({matrix1, matrix2, row, column}){
    const arr1 = matrix1[row-1]
    const arr2 = matrix2[column-1]
    return arr1.reduce((acc, cur, i) => acc + cur * arr2[i], 0)
}

function solution(arr1, arr2){
    return 
}

test('getResult', () => {
    expect(getResult({matrix1: [[1,4],[3,2],[4,1]], matrix2: [[3,3],[3,3]]})).toEqual([15,15,15,15,15,15])
})

test('dotProduct', () => {
    expect(dotProduct({matrix1: [[1,4],[3,2],[4,1]], matrix2: [[3,3],[3,3]], row: 1, column: 1})).toBe(15)
    expect(dotProduct({matrix1: [[1,4],[3,2],[4,1]], matrix2: [[3,3],[3,3]], row: 1, column: 2})).toBe(15)
    expect(dotProduct({matrix1: [[1,4],[3,2],[4,1]], matrix2: [[3,3],[3,3]], row: 2, column: 2})).toBe(15)
    expect(dotProduct({matrix1: [[1,4],[3,2],[4,1]], matrix2: [[3,3],[3,3]], row: 3, column: 2})).toBe(15)
})

test('matrixSize', () => {
    expect(matrixSize({matrix: [[1,4],[3,2],[4,1]]})).toEqual({row: 3, column: 2})
    expect(matrixSize({matrix: [[3,3],[3,3]]})).toEqual({row: 2, column: 2})
})

// test('solution', () => {
//     expect(solution([[1,4],[3,2],[4,1]],[[3,3],[3,3]]))
//         .toEqual([[15,15],[15,15],[15,15]])
//     expect(solution([[2,3,2],[4,2,4],[3,1,4]],[[5,4,3],[2,4,1],[3,1,1]]))
//         .toEqual([[22,22,11],[36,28,18],[29,20,14]])
// })