const listaDeDestinos = new Array(
    `Salvador`,
    `São Paulo`,
    `Rio de Janeiro`
);

const idadeComprador = 15;
const estaAcompanhada = true;

listaDeDestinos.push(`Curitiba`);
console.log("Destinos possíveis:")
console.log(listaDeDestinos);

listaDeDestinos.splice(1,1);
console.log(listaDeDestinos[0]);

if(idadeComprador >= 18){
    console.log("Comprador maior de idade, posso vender");
} else {
    if(estaAcompanhada){
        console.log("Comprador está acompanhado, posso vender");
    } else {
        console.log("Comprador não está acompanhado, não posso vender");
    }
};