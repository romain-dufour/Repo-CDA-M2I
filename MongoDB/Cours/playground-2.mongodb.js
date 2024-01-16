use("book");
// db.books.find();

//Read
// db.books.find({_id : 45})
// -- limiter a 5
// // db.books.find().limit(5);

// -- avec 2 auteurs
// // db.books.find({authors: {$size: 2}});

// -- nombre de page egales a 400 et plus (greater than equals)
// db.books.find({pageCount: {$gte : 400}});

//-- id == 55, 75 et 120
// db.books.find({_id: {$in: [55,75,120]}}); // affiche les livres avec les id demandés

// -- affiche les livres avec livre avec 2 auteurs et les tri par titre puis par id le plus grand si egalité
// db.books.find({authors: {$size: 2}}).sort({title:1, _id:-1});

// -- avec 2 auteurs, tri par titre, puis id et les 3 premiers
// db.books.find({authors:{$size:2}}).skip(10).sort({title:1, _id:-1}).limit(3);

// -- livre entre 25 et 50 exclue et compte la quantité
// db.books.find({$and: [{_id : {$gt: 25}},{_id : {$lt: 50}}]}).count()

// -- affiche l'id et l'auteur dont l'id est supérieur a 45
// db.books.find({_id: {$gt : 45}}, {_id:1, authors:1})

// -- affiche tout sauf l'auteur dont l'id est supérieur a 45
// db.books.find({_id: {$gt : 45}}, { authors:0})

// -- les deux informations
// db.books.find({categories: {$all: ['Java', 'Computer Graphics']}});

// -- l'un ou l'autre
// db.books.find({$or : [{_id: 19},{_id : 80}]});

// -- commence par ext ou Ext ou EXT
// -- $options : "i" insensible a la casse
// db.books.find({longDescription: {$regex : "^ext", $options : "i"}});

// -- contient Distributed et insensible a la casse 
// db.books.find({longDescription: {$regex : "Distributed" , $options:"i"}})

// -- titre fini par Perl
// db.books.find({title: {$regex : "Perl$" , $options:"i"}})




