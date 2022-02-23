function dati(){
    var input=document.getElementsByTagName("input");
    var nome=input[0];
    var cognome=input[1];
    var ateneo=document.pinco.ateneo.value;
    var check=document.pinco.SL.checked;
    var richieste=document.pinco.richieste.value;
    //console.log(check);
    //console.log(nome.value);
    //console.log(cognome.value);
    if(nome.value==""){
        alert("AO devi da scrive er cognome");
        return;
    }
    else if(cognome.value==""){
        alert("AO devi da scrive er nome");
        return;
    }
    else if(ateneo==["nessuna"]){
        alert("DEVI DA METTE ER CAZZO DATENEO");
        return;
    }
    else if(check==true && richieste==""){
            alert("AOOOOO COMPILA QUA SOTTO CAZZO");
            return;
    } 
}
