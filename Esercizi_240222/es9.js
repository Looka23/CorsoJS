function reverseString() {
    var str=document.getElementById("string").value;
    var a=str.length;
    //console.log(str);
    //console.log(a);
    var newString = "";
    for (var i = a - 1; i >= 0; i--) {
        newString += str[i];
        //console.log(newString);
    }
    alert(newString);
}
