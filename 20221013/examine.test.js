import examine, { counter } from './examine';

test('count with 1 2 3 4 5 1 2 3 4 5 1', () => {
  expect(counter([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1])).toStrictEqual([11, 1, 1]);
});

test('examine with 1 2 3 4 5', () => {
  expect(examine([1, 2, 3, 4, 5], 1)).toStrictEqual([1]);
});

test('examine with 1 3 2 4 2', () => {
  expect(examine([1, 3, 2, 4, 2], 1)).toStrictEqual([1, 2, 3]);
});
