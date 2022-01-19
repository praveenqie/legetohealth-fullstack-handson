let fs = require('fs')
let data = "this is the text need to be added in file\n"
fs.writeFileSync('msg.txt',data, {flag:'a+'});
console.log('done')
