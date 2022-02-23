function cn(){
    var input=document.getElementsByTagName("input");
    var cognome = input[0];
    var nome = input[1];
    console.log(cognome);
    var anno = input[2];
    var regione = document.registr.regione.value;
    if(cognome.value==""){
        alert("il campo cognome è vuoto, cavolo");
        return ;
    }
        else if(nome.value==""){
        alert("il campo nome è vuoto, perdincibacco");
        return ;
    }
        /*else if(anno>=1 && anno<=5 || "FC") {
        alert ("l'anno deve essere compreso tra 1 e 5 oppure essere Fuori Corso");
        return ;*/
    }
        /*else if(regione==["nessuna"]){
        alert("Selezionare una regione prego");
        return;
        }*/

/*function reg(){
        if(document.registr.regione.value==["nessuna"]) 
        return;
    }*/
