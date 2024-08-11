//Pegando o tubo
const pipe = document.querySelector('.pipe');
const clouds = document.querySelector('.clouds')
//Verificando se o tubo bateu no mario

//Setinterval = Fazer o jogo rodar até o mario morrer
const loop = setInterval(()=>{

//Pegando a posição da esquerda do tubo
const pipePosition = pipe.offsetLeft;

//Pegando a posição do bottom do mario
//getComputedStyle deixa voce pegar QUALQUER atributo css e o + converte em Number
const marioPosition = +window.getComputedStyle(mario).bottom.replace('px' , '')


//Verificando se bateu ou não = ver se deu 120 = posiçao do mario 
//Verificando se o mario passou da altura = pulou ou não
//Se o mario passa o tubo, tem que coniuar
if(pipePosition <= 120 && marioPosition < 175 && pipePosition > 0){

 //stlye = pega o atributo da css e altera
//Fazendo o tubo parar
pipe.style.animation = 'none';
pipe.style.left = `${pipePosition}px`;


//Fazendo o mario parar
mario.style.animation = 'none';
mario.style.bottom = `${marioPosition}px`;

//Mudando a Imagem do mario
mario.src = './images/game-over.png'
mario.style.width = '65px'
mario.style.marginLeft = '50px'


//Terminando o jogo
clearInterval(loop)

}


} ,10)