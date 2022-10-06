// 홀수 인덱스를 추출할 방법?

export default function convert(text) {
  return text.split(' ')
    .map((elem) => elem.split(''))
    .map((elem) => [...elem]
      .map((letter, i) => (i % 2 === 0 ? letter.toUpperCase() : letter.toLowerCase())).join(''))
    .join(' ');
}
