function franco(){
    var input=document.getElementsByTagName("input");
    var parola1=input[0];
    var parola2=input[1];
    if(parola1.value.length<parola2.value.length){
    //console.log(parola1.value);
    //console.log(parola2.value);
    for(var i=0; i<parola1.value.length; i++){
        for(var o=0; o<parola2.value.length; o++){
          //if(parola1.value[0]==parola2.value[0] && parola1.value[1]==parola2.value[1]){
            if(parola1.value[i]==parola2.value[i]){
                if(parola1.value[i+1]==parola2.value[o+1]){
                   alert("la prima parola si trova nella seconda parola ");
                   return;
                     }  
                     else {
                        alert("non ce sta");
                        return; 
                  }
            
            }
            else{
                continue;
            }
        }
        /*else{
            alert("non bisogna calcolare le prime due lettere");
            return;*/
        }
    }
        else{
            alert("La prima parola deve esse la piu piccola");
            return;
        }
    
}


 /*if (parola1.value.indexOf(parola2.value)!==-1){
       alarm("La stringa contiene la parola");
       return;
}
    else{
       alarm("La stringa non contiene la parola");
       return;
}
}*/