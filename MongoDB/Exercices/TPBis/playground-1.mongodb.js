use("info")



// db.info.insertOne({
//     "nom" : "MacBook Pro",
//     "fabriquant" : "Apple",
//     "prix" : "11435,99",
//     "options" : [
//         "intel Core i5",
//         "Retine Display",
//         "Long life battery"
//     ]
// });



// db.info.insertOne({
//     "nom" : "Thinkpad X230",
//     "fabriquant" : "Lenovo",
//     "prix" : "114358.74",
//     "ultrabook" : "true",
//     "options" : [
//         "intel Core i5",
//         "SSD",
//         "Long life battery"
//     ]
// })

// A -Récupérer tous les produits.

// db.info.find()

// B. - Récupérer le premier produit

// db.info.find().limit(1)

// C. - Trouver l’id du Thinkpad et faites la requête pour récupérer ce produit avec
// son id.


db.info.find({_id:})

// D. - Récupérer les produits dont le prix est supérieur à 13723 DA


// E. - Récupérer le premier produit ayant le champ ultrabook à true


// F. - Récupérer le premier produit dont le nom contient Macbook


// G. - Récupérer les produits dont le nom commence par Macbook


// H. - Supprimer les deux produits dont le fabricant est Apple.


// I. - Supprimer le Lenovo X230 en utilisant uniquement son id.