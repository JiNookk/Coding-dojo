export function split(text) {
  return text.split('');
}

export function stringify(n) {
  return n.toString();
}

export function addDigits(n) {
  const numbers = split(stringify(n)).map((letter) => Number(letter));
  return numbers.reduce((acc, cur) => acc + cur);
}
