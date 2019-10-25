let arr = [10, 20, 30];
//arr[3] = 'cool'; // dynamically changes in runtime 
/* Arrays in JS are objects they can grow dynamically*/
console.log(arr[0]);
console.log(arr);
console.log(arr.length);
console.log(typeof arr); // typeof returns which datatype 
let sum=0;
for(let i=0;i<arr.length;i++){
    sum += arr[i];
}
console.log("Sum of elements in array : "+sum);

arr=[10,20,30,40,50,60,70];
for(let i=0;i<arr.length;i++){
    if(i%2!=0){
        sum += arr[i];
    }
}
console.log("Sum of elements in array : "+sum);




