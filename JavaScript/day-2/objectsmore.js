function callMe(){
    var emps = {
        name: "Rajesh", loc: "Bangalore", info: function () {
            console.log(this.name + " lives in " + this.loc);
        }
    }
    // here objects is having method info() in the object itself 
    emps.info(); // invoking info method in object
}

callMe(); 