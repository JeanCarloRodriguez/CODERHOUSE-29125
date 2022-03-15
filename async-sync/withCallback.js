// Callback Function Example
function greet(name, callBack) {
  console.log('Hello world');

  // callback function
  // executed only after the greet() is executed
  callBack(name);
}

// callback function
function sayName(name) {
  console.log('Hello' + ' ' + name);
}

// calling the function after 2 seconds
setTimeout(greet, 2000, 'John', sayName);