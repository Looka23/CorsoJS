function pino(){
    var numeri=["0","1","2","3","4","5","6","7","8","9"];
    var input=document.getElementsByTagName("input");
    var stringa=input[0];
    console.log(stringa.value);
    var b = stringa.value.length;
    var a = numeri.length;
    for(let o=0; o<a; o++){
        console.log(a);
        for(let i=0; i<b; i++){
              console.log(i);
              if(i<5){
              //console.log(b);
              switch (stringa.value[i]==numeri[o]){
                  case true:
                  alert("La stringa contiene un numero");
                  break;
                  case false:
                  alert("La stringa inserita non contiene un numero");
                  return;
                             }
                                          }else{
                                              return;
                                          }
                                          }

                            }
                        }
         


/*function CN(input){
    var str = String(input);
    for( let i = 0; i < str.length; i++){
              console.log(str.charAt(i));
        if(!isNaN(str.charAt(i))){           
            return true;
            
        }
    }
}*/