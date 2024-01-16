use("TpMongoDB_3");

// -- LISTE DE TOUS LES LIVRES TYPE "Book"
// db.livre.find({type : "Book"});


//  -- Liste des publication depuis 2011
// db.livre.find({$and : [{type:"Article"},{year: {$gte : 2011}}]});

// ** Liste des livres depuis 2014

// db.livre.find({$and : [{type:"Book"},{year: {$gte : 2014}}]});
//db.livre.find()

// -- Liste des publications de l'auteur "Toru Ishida"
// db.livre.find({$and : [{authors:"Toru Ishida"}, {type:"Article"} ]});

// -- Liste de tous les éditeurs (type "publisher") distincs
// db.livre.distinct("publisher");

// -- liste de tous les auteurs distincts
db.livre.distinct("authors");

