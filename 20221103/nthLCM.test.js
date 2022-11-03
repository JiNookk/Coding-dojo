function solution(arr) {
    const max = Math.max(...arr)
    let lcm = Math.max(...arr) * Math.min(...arr)
    
    if(isLCM(arr,max)){
        return max
    }

    while(!isLCM(arr,lcm)){
        lcm += 1;        
    }

    return lcm;
}

function isLCM(arr, number){    
    return arr.find(element => number % element != 0) ? false : true
}



test('isLCM', () => {
    expect(isLCM([2,6,8,14],16)).toBe(false)
})

test('isLCM', () => {
    expect(isLCM([2,6,8,14],168)).toBe(true)
})

test('solution', () => {
    expect(solution([2,6,8,14])).toBe(168)
})

test('solution', () => {
    expect(solution([1,2,3])).toBe(6)
})
