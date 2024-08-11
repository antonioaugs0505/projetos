  const btn = document.querySelector('#envio')
  console.log(btn)
  
  function sendMsg(e){
    e.preventDefaut()


    Email.send({
    SecureToken : "bec86ec9-b657-42b1-b873-1fc265deabad",
    To : 'tonisantos0505@gmail.com',
    From : 'aagomes0505@gmail.com',
    Subject : "ESTOU SENDO VIOLENTADA",
    Body : "ESTOU SENDO VIOLENTADA"
}).then(
  message => alert(message)
);
}

btn.addEventListener('submit', sendMsg);





