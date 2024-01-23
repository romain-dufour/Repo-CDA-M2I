use("Livre");

// db.articles.find();
// db.auteurs.find()


// 1 - Trouver tous les articles par id : auteur1 ok 

// db.articles.aggregate(
//     {
//     $match : {
//         auteurId : "auteur1"
//     }
// },
// {$project : {
//     _id : 0,
//     titre : 1
// }}
// )

// 2 - Trouver un auteur par 'Alice Dupont' ok

// db.auteurs.aggregate(
//     {
//     $match : {
//         nom: "Alice Dupont"
//     }
// }
// )

// 3 - Trouver un article par titre : 'La Science des Données' ok


// db.articles.aggregate(
//     {
//     $match : {
//         titre: "La Science des Données"
//     }
// }
// )



// 4 - Lister tous les articles d'un auteur spécifique "alice@example.com" ok

// db.articles.aggregate([
//     {$lookup: {
//       from: "auteurs",
//       localField: "auteurId",
//       foreignField: "_id",
//       as: "auteursInfo"
//     }},
//     {$match: {
//       "auteursInfo.email": "alice@example.com"
//     }},
//     {
//         $project: {
//             _id: 1,
//             titre: 1,
//             contenu: 1
//         }
//     }
// ])





// 5 - Lister les auteurs qui ont un email spécifique "example.com" ok 

// db.auteurs.aggregate({
//     $match:{
//         email : {$regex : /example.com/}
//     }
// })



// 6 - Mettre à jour l'email d'un auteur : Alice Dupont ok


// db.auteurs.updateOne({
//         "nom" : "Alice Dupont"
// },
// {$set: {email: "AliceDupont@example.com"}}

// )


// 7 - Supprimer tous les articles d'un auteur spécifique : Alice Dupont

db.articles.deleteMany([
    {$lookup: {
      from: "auteurs",
      localField: "auteurId",
      foreignField: "_id",
      as: "auteursInfo"
    }},
    {$match: {
      "auteursInfo.email": "alice@example.com"
    }},
    {
        $project: {
            _id: 1,
            titre: 1,
            contenu: 1
        }
    }
])



// 8 - Compter le nombre d'articles d'un auteur spécifique : Bob Martin





// 9 - Rechercher des auteurs par un mot-clé dans leur nom : "Dup"






// 10 - Lister les articles avec un mot spécifique dans le titre : "Data"