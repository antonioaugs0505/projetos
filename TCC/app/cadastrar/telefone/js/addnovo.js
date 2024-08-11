document.getElementById("salvar").addEventListener("click", function() {
    salvarContNome();
});

function salvarContNome() {
    let contNome = document.getElementById('contNome').value;
    console.log(contNome);

    localStorage.setItem('contNome', contNome);
}

document.getElementById("salvar").addEventListener("click", function() {
    salvarContTel();
});

function salvarContTel() {
    let contTel = document.getElementById('contTel').value;
    console.log(contTel);

    localStorage.setItem('contTel', contTel);
}
