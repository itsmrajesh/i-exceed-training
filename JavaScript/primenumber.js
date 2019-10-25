
function isPrime(num){
    for(let i=2;i<=num/2;i++){
        if(num%i==0){
            return false;
        }
    }
    return true;
}
var num = 10;
if(isPrime(num)){
    console.log("Prime Number");   
}
else{
    console.log("Not prime number"); 
}

let lb=3,ub=50;
//printing prime numbers between range
while(lb<ub){
    if(isPrime(lb)){
        console.log(lb);
    }
    lb++;
}