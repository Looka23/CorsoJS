var metodoGet="GET";
var metodoSet="POST";
var UrlS="http://192.168.2.32:4000/setUserData";
var UrlG="http://192.168.2.32:4000/getUserData";
var UrlU="http://192.168.2.32:4000/updateUserData";
var UrlD="http://192.168.2.32:4000/deleteUserData";


var input=document.getElementsByTagName("input");

function PrimaSet(metodo, url){

    var password = document.getElementById("password");
    var email = document.getElementById("email");
    var nome = document.getElementById("nome");
    var cognome = document.getElementById("cognome");
    var eta = document.getElementById("eta");
    var sesso = document.getElementsByName("sesso");
    var regione = document.Fra.regione;
    var datiS= {
        email: email.value,
        password: password.value,
        nome: nome.value,
        cognome: cognome.value,
        eta: eta.value,
        sesso: sesso,
        regione: regione.value
    };

    //console.log(email.value, password.value, nome.value, cognome.value, eta.value, sesso.value, regione.values);
    return new Promise((resolve, reject) => {

        let xhrq = new XMLHttpRequest();
        if (document.getElementById("password").value != document.getElementById("Cpassword").value) {
            console.log("errore password non corrispondente");
            xhrq.reject;
        }

        xhrq.open(metodo, url);
        xhrq.setRequestHeader('Content-Type', 'application/json');
        xhrq.responseType = "json";

        xhrq.send(JSON.stringify(datiS));
        xhrq.onload = () => {
            if (xhrq.status >= 400) {
                console.log("Hai sbagliato qualcosa");
                reject(xhrq.reject);
            }
            if (xhrq.status == 200) {
                console.log("Ok")
                resolve(xhrq.response);
            }
            if (xhrq.status == 201) {
                resolve(xhrq.response);
                console.log("Tutto ok");
            }
        };
        xhrq.onerror = () => {
            console.log("errore");
        }

    });

}



function PrimaGet(metodo, url){
    var dataG = {
        email: document.getElementById("email").value,
        password: document.getElementById("password").value
    }
    return new Promise((resolve, reject) => {
        let xhrq = new XMLHttpRequest(); //instanzio la richiesta
        xhrq.open(metodo, url);
        xhrq.setRequestHeader('Content-Type', 'application/json');
        xhrq.responseType = "json";
        xhrq.send(JSON.stringify(dataG));
        xhrq.onload = () => {
            if (xhrq.status <= 201) {
                document.getElementById("pino").innerHTML = "Ricevuto";
                console.log("Ok trovato");
                resolve(xhrq.response);
            }
            if(xhrq.status == 403){
                document.getElementById("pino").innerHTML = "Ricevuto ma sbagliato";
                reject(xhrq.reject);
            }
            if(xhrq.status == 404){
                document.getElementById("pino").innerHTML = "Niente";
                reject(xhrq.reject);
            }
        };
    });
}

function PrimaUP(metodo, url) {

    var password = document.getElementById("password").value;
    var email = document.getElementById("email").value;
    var nome = document.getElementById("nome").value;
    var cognome = document.getElementById("cognome").value;
    var eta = document.getElementById("eta").value;
    var sesso = document.getElementsByName("sesso");
    var regione = document.Fra.regione.value;
    var data = {
        email: email,
        password: password,
        nome: nome,
        cognome: cognome,
        eta: eta,
        sesso: sesso,
        regione: regione

    };
    //console.log(email, password, nome, cognome, eta, sesso, regione);
    return new Promise((resolve, reject) => {

        let xhrq = new XMLHttpRequest(); //instanzio la richiesta
        xhrq.open(metodo, url);
        xhrq.setRequestHeader('Content-Type', 'application/json');
        xhrq.responseType = "json";

        xhrq.send(JSON.stringify(data));
        xhrq.onload = () => {
            if (xhrq.status == 403) {
                document.getElementById("pino").innerHTML = "Non si e' aggiornato";
                reject(xhrq.reject);
            }
            if (xhrq.status == 404) {
                document.getElementById("pino").innerHTML = "Non e' stato trovato nulla";
                reject(xhrq.reject);
            }
            if (xhrq.status <= 201){
                document.getElementById("pino").innerHTML = "Fatto";
                resolve(xhrq.response);
                console.log("Tutto ok");
            }
        };
        xhrq.onerror = () => {
            console.log("errore");
        }

    });

}
function PrimaDel(metodo, url){
      var dataE = {
      email: document.getElementById("email").value,
       password: document.getElementById("password").value
}
    return new Promise((resolve, reject) => {
    let xhrq = new XMLHttpRequest(); //instanzio la richiesta
    xhrq.open(metodo, url);
    xhrq.setRequestHeader('Content-Type', 'application/json');
    xhrq.responseType = "json";
    xhrq.send(JSON.stringify(dataE)); 
    xhrq.onload = () => {
        if (xhrq.status == 403) {
            document.getElementById("pino").innerHTML = "Sbagliato";
            reject(xhrq.reject);
        }
        if (xhreq.status == 404) {
            document.getElementById("pino").innerHTML = "Not Found";
            reject(xhrq.reject);
        }
        if (xhreq.status <= 201) {
            document.getElementById("pino").innerHTML = "Eliminato";
            resolve(xhrq.response);

        }
    };
});
}
