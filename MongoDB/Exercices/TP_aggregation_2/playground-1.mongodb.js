use("tp_agregation_2");


// db.restaurants.find();
// 1. Afficher la liste des restaurants mais limitez l’affichage à 10.

// db.restaurants.aggregate({$limit : 10})

// 2. Afficher la liste des 10 premiers restaurants mais en triant cette liste par ordre
// alphabétique.

// db.restaurants.aggregate({$limit : 10},{$sort:{name : 1}})


// 3. Afficher la liste des 10 premiers restaurants mais en triant cette liste par ordre
// alphabétique, mais uniquement ceux sur “Brooklyn” (champs : borough)..

// db.restaurants.aggregate({$limit : 10},{$match:{borough : "Brooklyn"}},{$sort:{name : 1}})



// 4. Afficher la liste des 10 premiers restaurants mais on affiche que le nom du restaurant
// et son quartier.

// db.restaurants.aggregate({$limit : 10},{$project:{_id:0 ,name : 1, borough : 1}})

// 5. Afficher la liste des 10 premiers restaurants mais on affiche tout sauf adresse et le
// grade.

// db.restaurants.aggregate({$limit : 10},{$project:{ address : 0, grades : 0}})


// 6. Afficher la liste des 10 premiers restaurants avec un nouveau champ qui va afficher
// le nombre d’avis (grades) par restaurant.


  
// db.restaurants.aggregate([
//     { $limit: 10 },
//     { $unwind: "$grades" },
//     { $group: { _id: "$_id", name: { $first: "$name" }, nombre_avis: { $sum: 1 } } },
//     { $project: { _id: 0, name: 1, nombre_avis: 1 } }
//   ]);
  


// 7. Afficher la liste des 10 premiers restaurants avec un nouveau champ qui va afficher
// le nombre d’avis (grades) par restaurant et il faudra faire le tri par nombre d’avis.

// db.restaurants.aggregate([
//     { $limit: 10 },
//     { $unwind: "$grades" },
//     { $group: { _id: "$_id", name: { $first: "$name" }, nombre_avis: { $sum: 1 } } },
//     { $project: { _id: 0, name: 1, nombre_avis: 1 } },
//     { $sort: {nombre_avis : -1}}
//   ]);

// 8. On souhaite toujours afficher la liste des 10 premiers restaurants en affichant le nom
// du restaurant en majuscule et le quartier du restaurant.

// db.restaurants.aggregate([
//     { $limit: 10 },
//     {
//       $project: {
//         _id: 0,
//         uppercased_name: { $toUpper: "$name" },
//         borough: 1
//       }
//     }
//   ]);
  

// 9. On souhaite toujours afficher la liste des 10 premiers restaurants en affichant le nom
// du restaurant en majuscule et les 3 premières lettres du quartier.

// db.restaurants.aggregate([
//     { $limit: 10 },
//     {
//       $project: {
//         _id: 0,
//         uppercased_name: { $toUpper: "$name" },
//         first_three_letters_borough: { $substr: ["$borough", 0, 3] }
//       }
//     }
//   ]);
  


// // 10. On souhaite avoir le nombre total de restaurants toujours avec agrégation.

// db.restaurants.aggregate([
//     { $group: { _id: null, total_restaurants: { $sum: 1 } } }
//   ]);
  


// 11. On souhaite avoir le nombre de restaurants par quartier (borough).

db.restaurants.aggregate([
    { $group: { _id: "$borough", total_restaurants: { $sum: 1 } } }
  ]);