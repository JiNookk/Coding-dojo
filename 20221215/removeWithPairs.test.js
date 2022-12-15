// - stack 자료구조를 사용하면 쉽게 풀 수 있다.
// - stack을 구현하기 (peek, pop, push)

class Stack{
    constructor(){
        this.storage = [];
    }

    push(letter){
        this.storage.push(letter)
    }

    peek(){
        return this.storage[this.storage.length - 1]
    }
    
    pop(){
       this.storage.pop()
    }
}

function solution(string){
    const stack = new Stack()

    const letters = string.split('')

    // 원하는 것 : for letters => stack에 연산 ㄱㄱ

    for (let i = 0; i < letters.length; i += 1){
        if(stack.storage.length && stack.peek() === letters[i]){
            stack.pop()
            continue
        }
        if(stack.peek() !== letters[i]){
            stack.push(letters[i])
        }
    }

    // for (const letter of letters){
    //     if(stack.storage.length && stack.peek() === letter){
    //         stack.pop()
    //         continue
    //     }
    //     if(stack.peek() !== letter){
    //         stack.push(letter)
    //     }
    // }
    
    return stack.storage.length ? 0 : 1
}

let stack;

beforeEach(() => {
    stack = new Stack();
})

test('push', () => {
    stack.push('a')
    expect(stack.storage[0]).toBe('a')
    stack.push('b')
    expect(stack.storage[1]).toBe('b')
    stack.push('c')
    expect(stack.storage[2]).toBe('c')
})

test('peek', () => {
    stack.push('a')
    stack.push('b')
    stack.push('c')

    expect(stack.peek()).toBe('c')
})

test('pop', () => {
    stack.push('a')
    stack.push('b')
    stack.push('c')
    
    expect(stack.peek()).toBe('c')
    expect(stack.storage.length).toBe(3)
    
    stack.pop()
    
    expect(stack.peek()).toBe('b')
    expect(stack.storage.length).toBe(2)
})

test('solution', () => {
    expect(solution('baabaa')).toBe(1)
    expect(solution('cdcd')).toBe(0)
    expect(solution('aa')).toBe(1)
})