let metodoGet="GET";
let metodoPost="POST";
let Url="http://192.168.2.32:4000/test";
var input=document.getElementsByTagName("input");

function promiseGD(metodo, url){
    return new Promise((risolvi, reject) => {
        let xhr = new XMLHttpRequest();
        xhr.open(metodo, url);
        xhr.send(null);

        xhr.onload = () => {
            risolvi(xhr.response);
        }
    });
}

/*function simpleGD(metodo, url){
    let xhr = new XMLHttpRequest();
    xhr.open(metodo, url);


}*/

function simpleSD(metodo, url){
   /* var email=input[0].value;
    var numero=input[1].value;
    var indirizzo=input[2].value;
    var nome=input[3].value;
    var cognome=input[4].value;
    var descrizione=input[5].value;*/
    var email=document.getElementById("email");
    var numero=document.getElementById("numero");
    var indirizzo=document.getElementById("indirizzo");
    var nome=document.getElementById("nome");
    var cognome=document.getElementById("cognome");
    var descrizione=document.getElementById("descrizione");
    //console.log(email.value);
    //console.log(numero.value);
    

    var dati={
        email: email.value,
        numero: numero.value,
        nome: nome.value,
        cognome: cognome.value,
        indirizzo: indirizzo.value,
        descrizione: descrizione.value
    };
    return new Promise((risolvi, reject) => {
    var xhr = new XMLHttpRequest();
    xhr.open(metodo, url);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.responseType="json";
    xhr.send(JSON.stringify(dati));

    xhr.onload = () => {
        if(xhr.status>=400){
            console.log("Boom");
    }
    else{
        risolvi(xhr.response);
        console.log("Sta senza pensieri");
    }

}
});
}

console.log(promiseGD(metodoGet, Url));
simpleSD(metodoPost, Url);

/*async function sendPromiseHTTP(metodo, url){
    let response = await  promiseGD(metodo, url);
    console.log(response);
}*/



