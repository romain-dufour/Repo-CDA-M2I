use("patient");


// -- Insérer 3 dossiers patients avec au moins 1 historique par patient
// Creation :
// db.patient.insertMany([{
//     "firstname": "Mohamed",
//     "lastName": "Deloin",
//     "age" : 30,
//     "history": [
//         {"desease": "rhume",
//         "treatment": "sirop"},
//         {"desease": "grippe",
//         "treatment": "anti-biotique"}
//     ]
// },{
// "firstname": "robert",
// "lastName": "Deprès",
// "age" : 53,
// "history": [
//     {"desease": "CoVid",
//     "treatment": "tape dans le dos"}
// ]},{
// "firstname": "Jean-Michel",
// "lastName": "Acoté",
// "age" : 44,
// "history": [
//     {"desease": "Toux",
//     "treatment": "sirop"},
//     {"desease": "plait a l'abdomene",
//     "treatment": "chirurgie"}
// ]}]
// );



// -- Mettre à jour les données d’un patient avec nouvel un âge, un
// nouveau nom et un nouvel historique medical.
// db.patient.updateOne({firstname : "robert" },{$set: {age : 60, lastName : "Dacoté", history :  [
//         {"desease": "CoVid",
//         "treatment": "hydroxychloroquine"}
//      ]}})

//  db.patient.find({firstname : "robert"})


// -- Trouver tous les patients qui ont un âge supérieur à 29 ans

// db.patient.find({age : {$gt: 29}});

// -- Supprimer tous les patients qui ont attrapé un rhume comme une maladie.

// db.patient.findOneAndDelete({desease : "rhume"});

//db.patient.find();
db.patient.deleteMany({"history.desease": "rhume"});