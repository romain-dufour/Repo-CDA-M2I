use("tp_agregation_1");

// -- trier les publications de "Toru Ishida" par titre de livre et par page de début

// db.livre.aggregate(
//   { $match: { authors: "Toru Ishida" } },
//   { $sort: {  booktitle: 1, title: 1 ,"pages.start": 1 } }
// );


// -- projeter le resultat sur le titre de la publication et les pages

// db.livre.aggregate([{$match : {authors : "Toru Ishida"}},{$sort : {title: 1 ,pages.start : 1}}, {
//     $project: {_id:0, title:1, pages: 1}
// }])


// -- compter le nombre de ses publications

// db.livre.aggregate({$match : {authors : "Toru Ishida"}},{$count : "compteur"})

//-- compter le nombre de publication depuis 2011 et par type

// db.livre.aggregate({$match : { year :{$gte : 2011} }},
// {$group: {_id:"$type" , nombre_publications : {$sum:1}}})

// -- compter le nombre de publications par auteur et trier le resultat par ordre croissant

// db.livre.aggregate([{ $unwind : "$authors"},{$group: {_id: "$authors", participation : {$sum:1}}}, {$sort : {participation: -1}}])

