var str="ada"
var len = str.length;
var isPal=true;

for(var i=0;i<str.length/2;i++){
    if(str[i] != str[len-1]){
        isPal=false;
        break;
    }
    len--;
}

if(isPal){
    console.log("Palindrome");
}else{
    console.log("Not Palindrome");
}
