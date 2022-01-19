let x = 10
let y =20
let z = x+y
console.log(`addition is ${z}`)
setTimeout(()=> {
    console.log(`inside the timeout callback function`)
},1000)
console.log('End of the line')