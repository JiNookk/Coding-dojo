import report from './report'

test('report', () => {
    expect(report(
        ["muzi", "frodo", "apeach", "neo"],
    ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"],
    2
    )).toEqual([2,1,1,0])
})

test('report', () => {
    expect(report(
        ["con", "ryan"],
        ["ryan con", "ryan con", "ryan con", "ryan con"],
    3
    )).toEqual([0,0])
})