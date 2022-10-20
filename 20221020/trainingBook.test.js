import trainingBook from './trainingBook';

test('training book with 2,4 lost 1,3,5 reserve', () => {
  expect(trainingBook(5, [2, 4], [1, 3, 5])).toBe(5);
});

test('training book with 2,4 lost 3 reserve', () => {
  expect(trainingBook(5, [2, 4], [3])).toBe(4);
});

test('training book with 3 lost 1 reserve', () => {
  expect(trainingBook(3, [3], [1])).toBe(2);
});
