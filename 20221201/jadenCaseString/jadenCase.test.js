// - 주어진 문자열을  분리한다.

// - 단어를 jadenCase로 변경한다
// - 단어를 연결한다.
// - 엣지 케이스
// - 공백문자가 연속해서 나올 수 있다.
// - 문자열은 알파벳과 숫자, 공백으로만 되어있다.
// - 숫자로만 이루어진 단어는 없다.

function toWords(sentence){
    return sentence.split(' ')
}

function toJadenCase(word){
    return word.toLowerCase().replace(/(^|\s)\S/g, firstLetter => firstLetter.toUpperCase())
}

function solution(sentence){
    const words = toWords(sentence)

    const answer = words.map(word => toJadenCase(word)).join(' ')

    return answer
}

test('toWords', () => {
    expect(toWords('3people unFollowed me')).toEqual(['3people', 'unFollowed', 'me'])
    expect(toWords('for the last week')).toEqual(['for', 'the', 'last', 'week'])
    expect(toWords('for  the ')).toEqual(['for', '', 'the', ''])
})

test('toJadenCase',() => {
    expect(toJadenCase('3people')).toBe('3people')
    expect(toJadenCase('unFollowed')).toBe('Unfollowed')
    expect(toJadenCase('aa')).toBe('Aa')
})

test('solution',() => {
    expect(solution('3people unFollowed me')).toBe('3people Unfollowed Me')
    expect(solution('for the last week')).toBe('For The Last Week')
    expect(solution('a aa')).toBe('A Aa')
    expect(solution('a  aa  ')).toBe('A  Aa  ')
})