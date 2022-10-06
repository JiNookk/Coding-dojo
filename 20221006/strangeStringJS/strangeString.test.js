import convert from './strangeString';

test('convert try hello world', () => {
  expect(convert('try hello world')).toBe('TrY HeLlO WoRlD');
});

// test('convert what the good', () => {
//   expect(convert('what the good')).toBe('WhAt ThE GoOd');
// });

// test('convert whatthegood', () => {
//   expect(convert('whatthegood')).toBe('WhAtThEgOoD');
// });

// test('convert WHAT THE GOOD', () => {
//   expect(convert('WHAT THE GOOD')).toBe('WhAt ThE GoOd');
// });

// test('convert WHATTHEGOOD', () => {
//   expect(convert('WHATTHEGOOD')).toBe('WhAtThEgOoD');
// });

// test('convert none', () => {
//   expect(convert('')).toBe('');
// });

// test('convert a', () => {
//   expect(convert('a')).toBe('A');
// });
