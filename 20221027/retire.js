export default function retire(lottos, win_nums){
    const reserved = lottos.filter(lotto => lotto !== 0);
    
    const winNumberWithouterased = reserved.reduce((initial, reserve) =>  
    win_nums.includes(reserve) ? initial + 1 : initial
    , 0)

    const minCount = winNumberWithouterased;

    const maxCount = 6 - reserved.length + winNumberWithouterased

    return [rate(maxCount), rate(minCount)];
}

const rate = (count) => {
    return count < 2 
    ? 6 
    : 7-count
    
}