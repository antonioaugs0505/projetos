document.getElementById("add").addEventListener("click", function() {
    salvarContNome();
});

function salvarContNome() {
    let addNome = document.getElementById('contNome').value;
    console.log(addNome);

    localStorage.setItem('contNome', addNome);
}

document.getElementById("add").addEventListener("click", function() {
    salvarContTel();
});

function salvarContTel() {
    let addTel = document.getElementById('contTel').value;
    console.log(addTel);

    localStorage.setItem('contTel', addTel);
}
