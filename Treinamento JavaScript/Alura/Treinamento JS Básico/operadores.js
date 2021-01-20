const listaDeDestinos = new Array(
    `Salvador`,
    `São Paulo`,
    `Rio de Janeiro`
);

const idadeComprador = 15;
const estaAcompanhada = true;
const temPassagem = false;

listaDeDestinos.push(`Curitiba`);
console.log("Destinos possíveis:")
console.log(listaDeDestinos);

listaDeDestinos.splice(1,1);
console.log(listaDeDestinos[0]);

if((idadeComprador >= 18 || estaAcompanhada == true) && temPassagem == true){
    console.log("Comprador maior de idade ou acompanhado e com passagem, pode embarcar");
} else {
    console.log("Comprador menor de idade e não acompanhado ou não tem passagem, não pode embarcar");     
};