export function sliceAndSort(array,command){
    return array.slice(command[0]-1,command[1]).sort((a,b) => a - b);
};

export default function kthNumber(array, commands){
    const answer = [...commands]
    .map((command) => sliceAndSort(array,command)[command[2]-1]); 

    return answer;
}
