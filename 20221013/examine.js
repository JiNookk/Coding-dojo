const pattern = {
  1: [1, 2, 3, 4, 5],
  2: [2, 1, 2, 3, 2, 4, 2, 5],
  3: [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
};

function count({ answers, array }) {
  return answers.filter((answer, i) => answer === array[i]).length;
}

export function counter(answers) {
  const array1 = [...answers].map((_, i) => pattern[1][i % 5]);

  const array2 = [...answers].map((_, i) => pattern[2][i % 8]);

  const array3 = [...answers].map((_, i) => pattern[3][i % 10]);

  return [count({ answers, array: array1 }),
    count({ answers, array: array2 }),
    count({ answers, array: array3 })];
}

export default function examine(answers) {
  const correctCount = counter(answers);

  const max = Math.max(...correctCount);

  return correctCount.map((elem, i) => (elem === max ? i + 1 : null))
    .filter((elem) => elem !== null);
}
