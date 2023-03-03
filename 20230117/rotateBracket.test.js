//  회전하는 메서드
//  올바른 괄호인지 판별하는 메서드

function validate({brackets}){
    const stack = [];

    for(let i = 0; i < brackets.length; i += 1){
        if(match({peek: stack[stack.length - 1], newBracket: brackets[i]})){
            stack.pop();
            
            continue;
        }

        stack.push(brackets[i])
    }

    return stack.length === 0
}

function match({peek, newBracket}){
    const table = {
        '(' : 1,
        ')' : -1,
        '{' : 2,
        '}' : -2,
        '[' : 3,
        ']' : -3,
    }

    if(table[peek] < 0){
        return false;
    }

    return (table[peek] + table[newBracket]) === 0
}

function rotate({brackets}){
    return brackets.substring(1) + brackets.substring(0, 1)
}

function solution(s){
    let answer = 0;
    let brackets = s;

    for(let i = 0; i < s.length; i += 1){
        answer += validate({brackets}) ? 1 : 0
        brackets = rotate({brackets})
    }

    return answer
}

test('match', () => {
   expect(match({peek: '[', newBracket: ']'})).toBe(true)
   expect(match({peek: '(', newBracket: ')'})).toBe(true)
   expect(match({peek: '{', newBracket: '}'})).toBe(true)
   expect(match({peek: ']', newBracket: '['})).toBe(false)
   expect(match({peek: '}', newBracket: '{'})).toBe(false)
   expect(match({peek: ')', newBracket: '('})).toBe(false)
})

test('validate', () => {
   expect(validate({brackets: "[](){}"})).toBe(true)
   expect(validate({brackets: "[()](){}"})).toBe(true)
   expect(validate({brackets: "](){}["})).toBe(false)
   expect(validate({brackets: "{{"})).toBe(false)
   expect(validate({brackets: "({)}"})).toBe(false)
})

test('rotate', () => {
   expect(rotate({brackets: "[](){}"})).toBe("](){}[")
   expect(rotate({brackets: "](){}["})).toBe("(){}[]")
   expect(rotate({brackets: "(){}[]"})).toBe("){}[](")
})

test('solution', () => {
   expect(solution("[](){}")).toBe(3)
   expect(solution("}]()[{")).toBe(2)
   expect(solution("[)(]")).toBe(0)
   expect(solution("}}}")).toBe(0)
})