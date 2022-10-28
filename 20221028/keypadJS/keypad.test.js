/* eslint-disable no-param-reassign */
const distance = (number, lastPosition) => {
  const target = number === 0 ? 11 : number;

  const { left, right } = lastPosition;

  let leftDistance = Math.floor(Math.abs(target - left) / 3);
  let rightDistance = Math.floor(Math.abs(target - right) / 3);

  if (left % 3 === 1) {
    leftDistance = (target - left) > 0
      ? Math.floor(Math.abs(target - left) / 3) + 1
      : Math.floor(Math.abs(target - left) / 3) + 2;
  }

  if (right % 3 === 0) {
    rightDistance = (target - right) > 0
      ? Math.floor(Math.abs(target - right) / 3) + 2
      : Math.floor(Math.abs(target - right) / 3) + 1;
  }

  return { leftDistance, rightDistance };
};

const pressButton = (number, lastPosition, hand) => {
  const { leftDistance, rightDistance } = distance(number, lastPosition);

  if (number === 0) {
    number = 11;
  }

  if (number % 3 === 1) {
    lastPosition.left = number;
    return 'L';
  }

  if (number % 3 === 0) {
    lastPosition.right = number;
    return 'R';
  }

  if (leftDistance < rightDistance) {
    lastPosition.left = number;
    return 'L';
  }

  if (leftDistance > rightDistance) {
    lastPosition.right = number;
    return 'R';
  }

  if (hand === 'left') {
    lastPosition.left = number;
    return 'L';
  }

  lastPosition.right = number;
  return 'R';
};

function solution(numbers, hand) {
  const lastPosition = {
    left: 10,
    right: 12,
  };

  const answer = numbers.map((number) => pressButton(number, lastPosition, hand))
    .join('');

  return answer;
}

test('distance1', () => {
  expect(distance(0, { left: 10, right: 12 }))
    .toEqual({ leftDistance: 1, rightDistance: 1 });
});

test('distance2', () => {
  expect(distance(0, { left: 2, right: 12 }))
    .toEqual({ leftDistance: 3, rightDistance: 1 });
});

test('distance3', () => {
  expect(distance(2, { left: 4, right: 12 }))
    .toEqual({ leftDistance: 2, rightDistance: 4 });
});

test('distance4', () => {
  expect(distance(0, { left: 1, right: 12 }))
    .toEqual({ leftDistance: 4, rightDistance: 1 });
});

test('pressButton', () => {
  expect(pressButton(0, { left: 10, right: 12 }, 'right'))
    .toBe('R');
});

test('pressButton', () => {
  expect(pressButton(0, { left: 10, right: 12 }, 'left'))
    .toBe('L');
});

test('pressButton', () => {
  expect(pressButton(1, { left: 10, right: 12 }, 'right'))
    .toBe('L');
});

test('pressButton', () => {
  expect(pressButton(3, { left: 1, right: 12 }, 'right'))
    .toBe('R');
});

test('keypad', () => {
  expect(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], 'right'))
    .toBe('LRLLLRLLRRL');
});

test('keypad', () => {
  expect(solution([7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2], 'left'))
    .toBe('LRLLRRLLLRR');
});

test('keypad', () => {
  expect(solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], 'right'))
    .toBe('LLRLLRLLRL');
});
