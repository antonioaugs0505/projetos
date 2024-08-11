document.getElementById("concluir").addEventListener("click", function() {
    salvarNome();
});

function salvarNome() {
    let nome = document.getElementById('loginNome').value;
    console.log(nome);

    localStorage.setItem('loginNome', nome);
}

document.getElementById("concluir").addEventListener("click", function() {
    salvarEmail();
});

function salvarEmail() {
    let email = document.getElementById('loginEmail').value;
    console.log(email);

    localStorage.setItem('loginEmail', email);
}

document.getElementById("concluir").addEventListener("click", function() {
    salvarTel();
});

function salvarTel() {
    let tel = document.getElementById('loginTel').value;
    console.log(tel);

    localStorage.setItem('loginTel', tel);
}

document.getElementById("concluir").addEventListener("click", function() {
    salvarSenha();
});

function salvarSenha() {
    let senha = document.getElementById('loginSenha').value;
    console.log(senha);

    localStorage.setItem('loginSenha', senha);
}