use("demoRelation")

// db.user.insertOne({_id: "123", nom: "Michel", email: "michel@gmail.com", profil: { age: 30, hobbies: ["Peinture","Sport"]}})
// db.user.find()
// 65a7da8db8a15db7f28af7d2
// db.user.insertOne({_id: "124", nom: "Paul", email: "paul@gmail.com", profil_Id: ObjectId("65a7da8db8a15db7f28af7d2")})
// db.profil.insertOne({age: 55, hobbies: ["Echec","Football"]})
// db.profil.find()
// db.user.find()

// db.profil.aggregate([
//     {$lookup : {from: "user", localField: "_id", foreignField: "profil_Id", as: "user"}},
//     {$match : {_id: ObjectId("65a7da8db8a15db7f28af7d2")}}]) 


// db.profil.aggregate([
//     {$lookup : {from: "profil", localField: "profil_Id", foreignField: "_id", as: "profil"}},
//     {$match : {_id: "124"}},{$project: {
//       "profil._id" : 0
//     }}]) 



// db.utilisateur.insertOne({name:"Jean", age: 40});
// db.adresse.insertOne({street: "rue des fleurs", number : 46, city : "Croix", utilisateur_id: ObjectId("65a7e3f2f90b76a588cbea50")})
// db.utilisateur.find();
// db.adresse.find();

db.utilisateur.aggregate({$lookup : {from : "adresse", localField: "_id", foreignField : "utilisateur_id", as : "adresse"}})





