let num = [5, 8, 2]
num[3] = 6
num.push(7)
console.log(num)
console.log(`O vetor tem ${num.length} posições`)
console.log(`O primeiro valor do vetor é ${num[0]}`)
num.sort()
console.log(num)

for (let pos in num){
    console.log(num[pos])
}