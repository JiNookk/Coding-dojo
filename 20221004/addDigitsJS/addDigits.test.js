import { split, stringify, addDigits } from './addDigits';

test('stringify', () => {
  expect(stringify(123)).toBe('123');
});

test('split', () => {
  expect(split('123')).toEqual(['1', '2', '3']);
});

test('addDigits123', () => {
  expect(addDigits(123)).toBe(6);
});

test('addDigits987', () => {
  expect(addDigits(987)).toBe(24);
});
