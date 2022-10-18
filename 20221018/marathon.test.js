import marathon from './marathon';

test('marathon with 3 members', () => {
  expect(marathon(['leo', 'kiki', 'eden'], ['eden', 'kiki'])).toBe('leo');
});

test('marathon with 5 members', () => {
  expect(marathon(
    ['marina', 'josipa', 'nikola', 'vinko', 'filipa'],
    ['josipa', 'filipa', 'marina', 'nikola'],
  )).toBe('vinko');
});

test('marathon with 4 members', () => {
  expect(marathon(
    ['mislav', 'stanko', 'mislav', 'ana'],
    ['stanko', 'ana', 'mislav'],
  )).toBe('mislav');
});
