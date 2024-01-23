use("tp_requete_agregation")



// 1. Quels sont les sportifs (identifiant, nom et prénom) qui ont un
// âge entre 20 et 30 ans ? ok

// db.sportifs.aggregate([
//     {
//         $match: {
//             Age: {
//                 $gte: 20,
//                 $lte: 30
//             }
//         }
//     },
//     {
//         $project: {
//             _id: 1, 
//             Nom: 1, 
//             Prenom: 1 ,
// Age : 1
//         }
//     }
// ])


// 2. Quels sont les gymnases de ville “Villetaneuse” ou de
// “Sarcelles” qui ont une surface de plus de 400 m2 ? OK
// db.gymnase.find()

// db.gymnase.aggregate([
//     {
//     $match: {
//         $or:[
//             {Ville: "SARCELLES"},
//             { Ville: "VILLETANEUSE" }
//         ],
//         Surface: {$gt : 400}
//     }
// },
//     {       
//          $project: {
//             _id: 0,
//             NomGymnase : 1,
//         }
//     }
// ])


// 3. Quels sont les sportifs (identifiant et nom) qui pratiquent du
// handball ? ok

// db.sportifs.aggregate([
//     {
//         $match: {
//             "Sports.Jouer": 
//       "Hand ball"
            
//         }
//     },
//     {
//         $project: {
//             _id: 1, 
//             Nom: 1 
//         }
//     }
// ])


// 4. Quels sportifs (identifiant et nom) ne pratiquent aucun sport ? ok 

// db.sportifs.aggregate([
//     {
//         $match: {
//             "Sports.Jouer": {$exists : false}
//         }
//     },
//     {
//         $project: {
//             _id: 1, 
//             Nom: 1 
//         }
//     }
// ])


// 5. Quels gymnases n’ont pas de séances le dimanche ? ok

// db.gymnase.aggregate([
//     {
//         $match: {
//             $and: [
//                 {
//                     "Seances.Jour":{$ne: "dimanche"}
//                 },
//                 {
//                     "Seances.Jour":{$ne:"Dimanche"}
//                 }
//             ]
        
//         }
//     }
    
// ])



// 6. Quels gymnases ne proposent que des séances de basket
// ball ou de volley ball ? 


// db.gymnase.aggregate([
//     {
//         $match: {

//                 $nor: [
//                     {"Seances.Libelle" : {$nin: ["Basket ball","Volley ball" ]}}
//                 ]
//                 }
//             }

    
// ])


// db.gymnase.aggregate([
//     {
//         $match: {
//             "Seances.Libelle" : {
//                 $all: [
//                     "Hockey","Volley ball" 
//                 ]
//             }
//                 }
            
//             }
// ])


// 7. Quels sont les entraîneurs qui sont aussi joueurs ? ok

// db.sportifs.aggregate([
//     {
//         $match: {
//             $and: [
//                 { "Sports.Jouer": { $exists: true } }, 
//                 { "Sports.Entrainer": { $exists: true } } 
//             ]
//         }
//     }
// ])


// 8. Pour le sportif “Kervadec” quel est le nom de son conseiller ? ok
// db.sportifs.find();
// db.gymnase.find();

// db.sportifs.aggregate([
//     {
//         $match: {
//             Nom: "KERVADEC"
//         }
//     },
//     {
//         $lookup: {
//             from: "sportifs",
//             localField: "IdSportifConseiller",
//             foreignField: "IdSportif",
//             as: "conseiller"
//         }
//     },
//     {
//         $project: {
//             _id: 0,
//             NomSportif: "$Nom",
//             Conseiller: {
//                 $arrayElemAt: ["$conseiller.Nom", 0]
//             }
//         }
//     }

// ])



// 9. Quelle est la moyenne d’âge des sportives qui pratiquent du
// basket ball ?ok

// db.sportifs.aggregate([
//     {
//         $match: 
// {        $and: [
//             { "Sports.Jouer": "Basket ball" },
//             {Sexe : "F"}
//         ]}
//     },

//     {
//         $group: { 
//         _id: "Age F",
//         avg_age : {$avg: "$Age"}
//         }
//     }
// ])



// db.sportifs.find();



// 10.Quels entraîneurs n’entraînent que du hand ball ou du basket
// ball ?

// db.sportifs.aggregate(
// [    {
//         $match:
//           {
//              $and :
//              [
//                  {"Sports.Entrainer" : "Hand ball"},
//                {"Sports.Entrainer" : "Basket ball"},
//                {"Sports.Entrainer" : "$size : 2"}   
//              ]
             
//          }
//     }]
// )




// 11. Pour chaque sportif donner le nombre de sports qu’il arbitre?

db.sportifs.aggregate([
    {
        $unwind : "$Sports.Arbitrer"
    },
    {
        $group:{
            _id:"$_id",
            IdSportif : {$first : "$IdSportif"},
            Nom :  {$first : "$Nom"},
            Prenom: {$first: "$Prenom"},
            ArbitrageNombreSports : {$sum : 1}
        }
    }
])


