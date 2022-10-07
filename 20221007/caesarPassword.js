const dictionary = {
  a: 1,
  b: 2,
  c: 3,
  d: 4,
  e: 5,
  f: 6,
  g: 7,
  h: 8,
  i: 9,
  j: 10,
  k: 11,
  l: 12,
  m: 13,
  n: 14,
  o: 15,
  p: 16,
  q: 17,
  r: 18,
  s: 19,
  t: 20,
  u: 21,
  v: 22,
  w: 23,
  x: 24,
  y: 25,
  z: 26,
};

export function checkCapitalLetter(letter) {
  if (letter.trim() === '') {
    return false;
  }

  return letter.toUpperCase() === letter;
}

export function isCapital(alphabets) {
  return alphabets.map((alphabet) => checkCapitalLetter(alphabet));
}

function toLowerLetter(alphabet, by) {
  return !dictionary[alphabet.toLowerCase()]
    ? alphabet
    : dictionary[alphabet.toLowerCase()] + by;
}

export default function encode(text, by) {
  const alphabets = text.split('');

  if (text.trim() === '') {
    return text;
  }

  const capitals = isCapital(alphabets);

  return alphabets
    .map((alphabet) => toLowerLetter(alphabet, by))
    .map((index) => {
      if (index === ' ') return index;

      return Object.keys(dictionary)[(index - 1) % 26];
    })
    .map((alphabet, i) => (capitals[i] === true ? alphabet.toUpperCase() : alphabet))
    .join('');
}
