function bit(){
    var input=document.getElementsByTagName("input");
    var numero=input[0];
    var stringa=input[1];
    var ao=stringa.value.length;
    //console.log(ao);
    //console.log(stringa.value);
    if (numero.value>ao){
        alert("Il numero non puo' essere piu grande della parola");
        return;
    }
    else{
        var y="";
        for(var i=0; i<numero.value; i++){
                //console.log(stringa.value);
                y+=stringa.value[i];
                
            }
            console.log(y);
            return y;
           }
         }