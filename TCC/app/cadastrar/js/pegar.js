document.getElementById("confirmarDados").addEventListener("click", function() {
    salvarNome();
});

function salvarNome() {
    let nome = document.getElementById('nome').value;
    console.log(nome);

    localStorage.setItem('nome', nome);
}