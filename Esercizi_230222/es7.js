function charChange1 (str) {
    //const capitalized = str.charAt(0).toUpperCase() + str.slice(1);;
    let risultato = '';
    var lun = str.length;
    for (let i = 0; i < lun; i++) {
      var c = str[i];
      var ascii = c.charCodeAt(0);
  
      if (ascii < 65 || ascii > 90) {
        risultato += c;
      } else {
        risultato += String.fromCharCode(ascii - 65 + 97);
      }
    } 
    //p=capitalized;
    //return p;
    return risultato;
  }
  var str=prompt("Metti na stringa")
  console.log(charChange1(str));