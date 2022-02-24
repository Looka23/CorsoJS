var x=0;
var array= Array();

function addvett() {
    array[x] = document.getElementById("num").value;
    if(isNaN(array[x])!=true){
    alert("Elemento: " + array[x] + " aggiunto alla posizione " + x);
    x++;
    document.getElementById("num").value = "";
    }
    else{
        alert("Non puoi aggiungere caratteri/stringhe");
    }
    //console.log(array[x]);
   }

   function mostra()
   {
      var e = "<hr/>";   
       
      for (var y=0; y<array.length; y++)
      {
        e += "Elemento " + y + " = " + array[y] + "<br/>";
      }
      document.getElementById("Prima").innerHTML = e;
   }

    function mol(){
        var e="<hr/>";
        var mul=document.getElementById("mol").value;
        for(var z=0; z<array.length; z++){
            //var mul=3;
            var m=mul*array[z];
            //console.log(array[z]);
            e+="Elemento moltiplicato " + z + " = " + m + "<br/>";
         }
         document.getElementById("Dopo").innerHTML = e;
    }
    
    