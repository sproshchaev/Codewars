function getParticipants(handshakes) {
  let result = 0;
  let counterMan = 0;
  let counterhandshakes = 0;
  for (let i = 1; i <= handshakes; i++) {
    counterhandshakes += i;
    if (counterhandshakes >= handshakes) {
      counterMan = i + 1;
      break;
    }
  }
  result = counterMan;
  console.log(result);
  return result;
}

getParticipants(0);
getParticipants(1);
getParticipants(3);
getParticipants(6);
getParticipants(7);
getParticipants(78);