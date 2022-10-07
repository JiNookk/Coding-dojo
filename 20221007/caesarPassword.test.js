import encode, { checkCapitalLetter, isCapital } from './caesarPassword';

test('empty by 1', () => {
  expect(encode('', 1)).toBe('');
});

test('blank by 1', () => {
  expect(encode(' ', 1)).toBe(' ');
});

test('ab by 1', () => {
  expect(encode('ab', 1)).toBe('bc');
});

test('AB by 1', () => {
  expect(encode('AB', 1)).toBe('BC');
});

test('z by 1', () => {
  expect(encode('z', 1)).toBe('a');
});

test('a B z by 4', () => {
  expect(encode('a B z', 4)).toBe('e F d');
});

test('check a', () => {
  expect(checkCapitalLetter('a')).toBe(false);
});

test('check empty', () => {
  expect(checkCapitalLetter('')).toBe(false);
});

test('check blank', () => {
  expect(checkCapitalLetter(' ')).toBe(false);
});

test('check B', () => {
  expect(checkCapitalLetter('B')).toBe(true);
});

test('isCapital [a B c]', () => {
  expect(isCapital(['a', ' ', 'B', ' ', 'c'])).toEqual([false, false, true, false, false]);
});
