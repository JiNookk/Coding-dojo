export default function marathon(participant, completion) {
  const sorted = [...completion].sort();
  return participant.sort().find((person, i) => person !== sorted[i]);
}
