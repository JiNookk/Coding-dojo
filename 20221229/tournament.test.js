function gameIndex({playerIndex}){
    const gameIndex = playerIndex % 2 === 0 ? playerIndex / 2 : Math.floor(playerIndex / 2) + 1
    return gameIndex
}

function matchingRound({playerIndex1, playerIndex2, count = 0}){
    if(playerIndex1 === playerIndex2){
        return {round: count}
    }

    return matchingRound({
        playerIndex1: gameIndex({playerIndex: playerIndex1}), 
        playerIndex2: gameIndex({playerIndex: playerIndex2}), 
        count : count + 1
    })
}

function solution(n, a, b){
    const {round}= matchingRound({playerIndex1: a, playerIndex2:b})

    return round;
}

test('gameIndex', () => {
    expect(gameIndex({playerIndex: 4})).toBe(2)
    expect(gameIndex({playerIndex: 7})).toBe(4)
})

test('matchingRound', () => {
    expect(matchingRound({playerIndex1: 4, playerIndex2: 7})).toEqual({round: 3})
    expect(matchingRound({playerIndex1: 7, playerIndex2: 15})).toEqual({round: 4})
})

test('solution', () => {
    expect(solution(8, 4, 7)).toBe(3)
})


// 둘이 같은 라운드에서 만날때까지 토너먼트
// round를 구하는 함수를 만든다.