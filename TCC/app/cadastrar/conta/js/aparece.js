let nomeUser = document.getElementById('nome');
let nomeDigitado = localStorage.getItem('loginNome');

nomeUser.innerHTML = nomeDigitado;

let emailUser = document.getElementById('email');
let emailDigitado = localStorage.getItem('loginEmail');

emailUser.innerHTML = emailDigitado;

let celUser = document.getElementById('celular');
let celDigitado = localStorage.getItem('loginTel');

celUser.innerHTML = celDigitado;

let contNome = document.getElementById('contNome');
let contLocal = localStorage.getItem('contNome');

contNome.innerHTML = contLocal;

let contTel = document.getElementById('contTel');
let telDigitado = localStorage.getItem('contTel');

contTel.innerHTML = telDigitado;
