//Pegando a imagem do mario
const mario = document.querySelector('.mario')

//Colocando a class jump para o mario pular
const jump = ()=>{
mario.classList.add('jump')

//Para o mario poder pular varias vezes, a cada 500ms(tempo do pulo) a class vai ser removida para poder ser usada novamente
//setTimeout funciona com uma função(aquilo que vai ser feito ) 
setTimeout(()=>{
    mario.classList.remove('jump')
}, 501)
}


//Adionar o evento Jump quando a tecla for pressionada - jump sendo const
document.addEventListener('keydown', jump)