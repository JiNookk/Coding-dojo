export default function trainingBook(n, lost, reserve) {
  const realLost = [...lost].sort().filter((person) => !reserve.includes(person));
  const realReserve = [...reserve].sort().filter((person) => !lost.includes(person));

  const realTrainingBook = [...Array(n)].map((_, i) => {
    if (realLost.includes(i + 1)) {
      return 0;
    }
    if (realReserve.includes(i + 1)) {
      return 2;
    }
    return 1;
  });

  realReserve.forEach((reserve) => {
    const index = reserve - 1;
    if (realTrainingBook[index - 1] === 0 && reserve !== 1) {
      realTrainingBook[index] = 1;
      realTrainingBook[index - 1] = 1;
      return;
    }

    if (realTrainingBook[index + 1] === 0 && reserve !== n) {
      realTrainingBook[index] = 1;
      realTrainingBook[index + 1] = 1;
    }
  });

  return realTrainingBook.filter((person) => person !== 0).length;
}
