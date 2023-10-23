import {writeFile, mkdirSync} from "fs";
import LineByLine from "n-readlines"


const monFichier = "./repertoryList.txt"
let line;
let reader = new LineByLine(monFichier)

writeFile(monFichier,"support\nexercices\ndemos\ncorrections",{ encoding: "utf8", flag: "a+" }, (err) => {
    if (err) {
      console.error(err);
      return;
    }
});

while(line = reader.next()) {
    let directory = line.toString().trim()
    try {
        mkdirSync(directory)
        console.log('le dossier')
    } catch(err) {
        console.error(`erreur dans le dossier ${line.toString()}`)
    }
}