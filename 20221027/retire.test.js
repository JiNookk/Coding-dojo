import retire from './retire'

test('retire', () => {
    expect(retire([44, 1, 0, 0, 31, 25],[31, 10, 45, 1, 6, 19])).toEqual([3,5])
})

test('retire', () => {
    expect(retire([0, 0, 0, 0, 0, 0],[38, 19, 20, 40, 15, 25])).toEqual([1, 6])
})

test('retire', () => {
    expect(retire([45, 4, 35, 20, 3, 9],[20, 9, 3, 45, 4, 35]	)).toEqual([1,1])
})