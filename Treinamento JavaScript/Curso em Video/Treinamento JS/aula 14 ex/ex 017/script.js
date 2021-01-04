/*function gerar(){
    var num = document.getElementById('txtnumero')
    var tab = document.getElementById('seltab')
    var res = document.getElementById('res')
    if (num.value.length == 0) {
        alert('Por favor, digite um número')
    } else {
        var n = Number(num.value)
        var c = 1
        tab.innerHTML = ''
        while (c <= 10) {
            var item = document.createElement('option')
            item.text = `${n} x ${c} = ${n*c}`
            item.value = `tab${c}`
            tab.appendChild(item)
            c++
        }
    }
}*/

function gerar(){
    var num = document.getElementById('txtnumero')
    var tab = document.getElementById('seltab')
    var res = document.getElementById('res')
    if (num.value.length == 0) {
        alert('Por favor, digite um número')
    } else {
        var n = Number(num.value)
        tab.innerHTML = ''
        for (var c = 1; c <= 10; c++) {
            var item = document.createElement('option')
            var t = n*c
            item.text = `${n} x ${c} = ${t}`
            item.value = `tab${c}`
            tab.appendChild(item)
        }
    }
}