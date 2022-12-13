function isSatisfyingBrown({width, height}){
    return 2 * width + 2 * height - 4
}

function isSatisfyingYellow({width, height}){
    return (width - 2) * (height - 2) 
}

function isRoot({width, height, brown, yellow}){
    return isSatisfyingBrown({width, height}) === brown && 
            isSatisfyingYellow({width, height}) === yellow
}

function solution(brown, yellow){
    let width = 0;
    let height = 0;

    for(let i = 0; i < brown; i += 1){
        for(let j = 0; j < brown; j += 1){
            if(isRoot({width: j + 1, height: i + 1, brown, yellow})){
                width = j + 1;
                height = i + 1
                break;
            }
        }
        if(isRoot({width, height, brown, yellow})){
            break;
        }
    }

    return [width,height]
}


test('isSatisfyingBrown',() => {
    expect(isSatisfyingBrown({width:4, height:3})).toBe(10)
    expect(isSatisfyingBrown({width:3, height:3})).toBe(8)
    expect(isSatisfyingBrown({width:8, height:6})).toBe(24)
})

test('isSatisfyingYellow',() => {
    expect(isSatisfyingYellow({width:4, height:3})).toBe(2)
    expect(isSatisfyingYellow({width:3, height:3})).toBe(1)
    expect(isSatisfyingYellow({width:8, height:6})).toBe(24)
})

test('isRoot',() => {
    expect(isRoot({width:4, height:3, brown:10, yellow: 2})).toBe(true)
    expect(isRoot({width:3, height:3, brown:8, yellow: 1})).toBe(true)
    expect(isRoot({width:8, height:6, brown:24, yellow: 24})).toBe(true)
    expect(isRoot({width:8, height:6, brown:24, yellow: 1})).toBe(false)
})

test('solution', () => {
    expect(solution(10, 2)).toEqual([4,3])
    expect(solution(8, 1)).toEqual([3,3])
    expect(solution(24, 24)).toEqual([8,6])
})




// - 갈색타일을 만족하는 관계식을 구한다.
// - 노랑타일을 만족하는 관계식을 구한다.
// - for문을 돌면서 이를 만족하는 관계식을 구한다.