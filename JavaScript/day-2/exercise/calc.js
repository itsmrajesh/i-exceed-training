function findBig(){
    num1 = document.getElementById('num1').value;
    num2 = document.getElementById('num2').value;
    num1 = parseInt(num1)
    num2 = parseInt(num2)
    if(num1>num2){
        alert(num1 +" is bigger")
    }else{
        alert(num2 +" is bigger")
    }
}