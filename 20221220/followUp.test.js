//  에러 검증: 끝 낱말을 검증, 한글자인지 검증, 중복 검증 => true or false배열로 반환하고 싶다.
//  가장 먼저 탈락한 플레이어 넘버와 사이클을 반환

function isWord({word}){
    return word.length > 1
}

function isContinuous({previous, current}){
    if(!previous){
        return true;
    }

    const lastLetter = previous[previous.length-1];
    return current.startsWith(lastLetter)
}

function isUnique({words}){
    const storage = {};

    const isUnique = words.map(word => {
        if(!storage[word]){
            storage[word] = true
            return true
        }
        return false
    })

    return isUnique
}

function validate({words}){
    const validateWord = words.map(word => isWord({word}))
    
    const validateContinuous = words.map((word, i) => isContinuous({previous:words[i-1], current:word}))

    const validateUnique = isUnique({words})

    const validated = [...Array(words.length)].map((elem,i) => validateWord[i] && validateContinuous[i] && validateUnique[i])
    
    return validated
}

function arrayToAnswer({playerCount, array}){
    const index = [...array].findIndex(elem => elem === false)
    
    const playerNumber = index % playerCount + 1 || 0;
    const cycle = Math.floor(index / playerCount) + 1 || 0;

    const answer = [playerNumber, cycle]

    return answer
}

function solution(n, words){
    const validated = validate({words})

    const answer = arrayToAnswer({playerCount:n, array:validated})
    
    return answer
}

test('validate word length is not 1', () => {
    expect(isWord({word: 'a'})).toBe(false)
    expect(isWord({word: ''})).toBe(false)
    expect(isWord({word: 'abdsa'})).toBe(true)
})

test('validate word start With the last letter of previous word ', () => {
    expect(isContinuous({previous: 'anonymous', current: 'start'})).toBe(true)
    expect(isContinuous({previous: 'bob', current: 'buddy'})).toBe(true)
    expect(isContinuous({previous: 'monitor', current: 'watermelon'})).toBe(false)
})

test('validate not duplication', () => {
    expect(isUnique({words:["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]}))
        .toEqual([true, true, true, true, true, true, true, true, false])
    
    expect(isUnique({words:["hello", "observe", "effect", "take", "either", "recognize", "encourage"]}))
        .toEqual([true, true, true, true, true, true, true])
    
    expect(isUnique({words:["hello", "one", "even", "never", "now", "world", "draw"]}))
        .toEqual([true, true, true, true, true, true, true])
})

test('validate', () => {
    expect(validate({words:["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]}))
        .toEqual([true, true, true, true, true, true, true, true, false])
    
    expect(validate({words:["hello", "observe", "effect", "take", "either", "recognize", "encourage"]}))
        .toEqual([true, true, true, true, true, true, true])
    
    expect(validate({words:["hello", "one", "even", "never", "now", "world", "draw"]}))
        .toEqual([true, true, true, true, false, true, true])
})

test('convert Array to playerNumber and cycle', () => {
    expect(arrayToAnswer({playerCount: 3, array:[true, true, true, true, true, true, true, true, false]}))
        .toEqual([3,3])
    
    expect(arrayToAnswer({arrayplayerCount: 5, array:[true, true, true, true, true, true, true, true, true]}))
        .toEqual([0,0])
    
    expect(arrayToAnswer({playerCount: 2, array:[true, true, true, true, false, true, true, true]}))
        .toEqual([1,3])
})

test('solution', () => {
    expect(solution(3, ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]))
        .toEqual([3,3])
    
    expect(solution(5, ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]))
        .toEqual([0,0])
    
    expect(solution(2, ["hello", "one", "even", "never", "now", "world", "draw"]))
        .toEqual([1,3])
})
