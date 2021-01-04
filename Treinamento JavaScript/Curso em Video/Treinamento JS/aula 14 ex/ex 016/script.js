function contar(){
    var início = document.getElementById('txtinicio')
    var fim = document.getElementById('txtfim')
    var passo = document.getElementById('txtpasso')
    var res = document.getElementById('res')

    if (início.value.length == 0 || fim.value.length == 0 || passo.value.length == 0){
        window.alert('[ERRO] Faltam dados!')
        res.innerHTML = 'Impossível contar!'
    } else {
        res.innerHTML = 'Contando: <br>'
        var i = Number(início.value)
        var f = Number(fim.value)
        var p = Number(passo.value)
        if (p <=0) {
            alert('Passo inválido! Considerando PASSO 1')
            p = 1
        }
        if (i<f){ //contagem crescente
            for(let c = i; c <= f; c += p) {
                res.innerHTML += `${c} \u{1F449}` //formatação unicode javascript (site)
            }
        } else { //contagem decrescente
            for(let c = i; c >= f; c -= p) {
                res.innerHTML += `${c} \u{1F449}`
            }
        }
        res.innerHTML += `\u{1F3C1}`
    }
}