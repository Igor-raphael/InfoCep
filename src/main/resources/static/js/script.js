document.addEventListener("DOMContentLoaded", function() {
    const resultSpans = document.querySelectorAll('.dadosCep .list .result');
    const aviso = document.querySelector('.aviso');

    let todosOcultos = true;

    resultSpans.forEach((span) => {
        if(!span.textContent.trim()) {
            const li = span.closest('li');
            li.style.display = 'none';
        
        } else {
           todosOcultos = false;
        }
    });

     if(todosOcultos) {
        aviso.style.display = 'block';
     }
});