// - 앞에서 부터 (와 )의 카운트를 센다.
// - (의 개수보다 )의 개수가 커지면 올바르지 않은 괄호이다.
// - (와 )의 개수가 다르면 올바르지 않은 괄호이다.

function validate(string){
    const brackets = string.split('')

    if(string[0] === ')'){
        return false;
    }
    
    if(string[0] === ')'){
        return false;
    }

    let startBracketCount = 0;
    let endBracketCount = 0;


    for( const bracket of brackets){
        bracket === "(" ? startBracketCount += 1 : endBracketCount += 1
    
        console.log(startBracketCount, endBracketCount)
        
        if(startBracketCount < endBracketCount){
            return false;
        }
    }
    
    return startBracketCount === endBracketCount
}


test('validate',() => {
    expect(validate('()()')).toBe(true)
    expect(validate('(())()')).toBe(true)
    expect(validate(')()(')).toBe(false)
    expect(validate('(()(')).toBe(false)
    expect(validate('(()((')).toBe(false)
    expect(validate('()))()((')).toBe(false)
})