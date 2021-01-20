const listaDeDestinos = new Array(
    `Salvador`,
    `São Paulo`,
    `Rio de Janeiro`
);

console.log("Destinos possíveis:")
console.log(listaDeDestinos);


const listaDeDestinos2 = new Array(
    `Salvador`,
    `São Paulo`,
    `Rio de Janeiro`
);

listaDeDestinos2.push(`Curitiba`);
console.log("Destinos possíveis 2:")
console.log(listaDeDestinos2);

listaDeDestinos.splice(1,1);
console.log(listaDeDestinos);
console.log(listaDeDestinos2[0]);