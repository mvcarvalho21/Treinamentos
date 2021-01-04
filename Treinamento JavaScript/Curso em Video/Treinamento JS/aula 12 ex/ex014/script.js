function carregar() {
    var msg = document.getElementById("msg")
    var img = document.getElementById("imagem")
    var data = new Date()
    var hora = data.getHours()
    msg.innerHTML = `Agora são ${hora} horas.`
    if (hora >= 0 && hora <5) {
        img.src = 'madrugada.jpg'
        document.body.style.background = '#e2cd9f'
    } else if (hora >=5 && hora <12){
        img.src = 'manhã.jpg'
        document.body.style.background = '#e5779f'
    } else if (hora >= 12 && hora <18){
        img.src = 'tarde.jpg'
        document.body.style.background = '#e7ce9f'
    } else {
        img.src = 'noite.jpg'
        document.body.style.background = '#e9ab9f'
    }
}