p1 = { pname: 'HP', price: 45000 };
p2 = { pname: 'Dell', price: 35000 };
p3 = { pname: 'Acer', price: 25000 };
p4 = { pname: 'Lenovo', price: 23000 };
p5 = { pname: 'Think Pad IBM', price: 3115000 };

var products = [p1, p2, p3, p4, p5];
var maxProduct = products[0];
var minProduct = products[0];
var sum = 0.0
for (i = 0; i < products.length; i++) {
    product = products[i];
    // pname = products[i]['pname']; 
    // pname = product['pname']; 
    // both above statement are same
    price = product['price'];
    sum += price;
    if (price > maxProduct['price']) {
        maxProduct = product;
    }
    if (price < minProduct['price']) {
        minProduct = product;
    }

}
console.log("Sum of all products : " + sum);
console.log("--------------------------------------");
console.log("Maximum Price product details : ");
console.log("Product name : " + maxProduct['pname']);
console.log("Product Price : " + maxProduct['price']);
console.log("--------------------------------------");
console.log("Minimum Price product details : ");
console.log("Product name : " + minProduct['pname']);
console.log("Product Price : " + minProduct['price']);
