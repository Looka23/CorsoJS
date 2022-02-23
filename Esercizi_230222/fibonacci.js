function fibo(){
    var n=document.getElementsByTagName("input");
    n=n[0].value;
    var fib=[];
    var a=0;
    var b=1;
    var c;
    fib[0]=0;
    fib[1]=1;
    //console.log(numero.value);
     for (i=2; i<n; i++){
      console.log(a+b);
      fib[i]=a+b;
      a=b;
      c=b;   
      continue;
}
}