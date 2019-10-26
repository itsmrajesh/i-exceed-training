var arr = [12, 3, 4, 5, 6];
var big = 0;
var small = arr[0]
var evenSum = 0;
for (var i = 0; i < arr.length; i++) {
    if (arr[i] > big) {
        big = arr[i];
    }
    else if (arr[i] < small) {
        small = arr[i];
    }

    if (arr[i] % 2 == 0)
        evenSum += arr[i];
}
document.write("Given array : "+arr + " <br>");
document.write("Big : " + big);
document.write(" <br>");
document.write("Smallest : " + small);
document.write(" <br>");
document.write("Sum of big and small : " + (big + small));
document.write(" <br>");
document.write("Even sum is "+evenSum);