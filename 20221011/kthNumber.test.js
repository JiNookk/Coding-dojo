import kthNumber, {sliceAndSort} from './kthNumber';

test('sliceAndSort', () => {
    expect(sliceAndSort([1,5,2,6,3,7,4],[2,5,3])).toStrictEqual([2,3,5,6])
})

test('kthNumber', () => {
    expect(kthNumber([1,5,2,6,3,7,4],[[2,5,3],[4,4,1],[1,7,3]])).toStrictEqual([5,6,3])
})

test('kthNumber', () => {
    expect(kthNumber([1],[[1,1,1],[1,1,1],[1,1,1]])).toStrictEqual([1,1,1])
})
